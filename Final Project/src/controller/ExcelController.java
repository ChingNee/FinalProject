package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import model.Claim;
import model.Employee;
import model.Payroll;

public class ExcelController {

	public void generateExcelPayslip(Payroll payroll, ArrayList<Claim> claimList,int overtimeHours, 
			int totalLeaveDeduction) {
		
		String filePath = "Payroll/"+Integer.toString(payroll.getPayrollID())+".xlsx";

		EmployeeController employeeController = new EmployeeController();
		Employee employee = employeeController.searchByEmployeeID(payroll.getEmployeeID());

		// Create blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create a blank sheet
		XSSFSheet spreadsheet = workbook.createSheet(" Payroll Info ");

		// Create row object
		Row row;
		Cell cell;

		int rowCount = 0;
		int cellCount = 0;
		int maxCellCount = 5;

		CellStyle boldCellStyle = workbook.createCellStyle();
		Font boldFont = workbook.createFont();
		boldFont.setBold(true);
		boldCellStyle.setFont(boldFont);

		CellStyle alignCellStyle = workbook.createCellStyle();
		alignCellStyle.setAlignment(HorizontalAlignment.LEFT);

		CellStyle sectionLabelStyle = workbook.createCellStyle();
		sectionLabelStyle.setFont(boldFont);
		sectionLabelStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		sectionLabelStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		
		CellStyle netPayStyle = workbook.createCellStyle();
		Font netPayFont = workbook.createFont();
		netPayFont.setBold(false);
		netPayStyle.setFont(netPayFont);
		netPayStyle.setBorderTop(BorderStyle.THIN);
		netPayStyle.setBorderBottom(BorderStyle.THIN);
		
		CellStyle netPayStyleBold = workbook.createCellStyle();
		Font netPayFontBold = workbook.createFont();
		netPayFontBold.setBold(true);
		netPayStyleBold.setFont(netPayFontBold);
		netPayStyleBold.setBorderTop(BorderStyle.THIN);
		netPayStyleBold.setBorderBottom(BorderStyle.THIN);

		row = spreadsheet.createRow(rowCount++);
		cell = row.createCell(cellCount++);
		cell.setCellValue("Employee ID:");
		cell.setCellStyle(boldCellStyle);
		cell = row.createCell(cellCount++);
		cell.setCellValue(employee.getEmployeeID());
		cell.setCellStyle(alignCellStyle);
		row = spreadsheet.createRow(rowCount++);
		cellCount = 0;
		cell = row.createCell(cellCount++);
		cell.setCellValue("Name:");
		cell.setCellStyle(boldCellStyle);
		cell = row.createCell(cellCount++);
		cell.setCellValue(employee.getEmployeeName());
		cell.setCellStyle(alignCellStyle);
		cell = row.createCell(cellCount++);
		cell = row.createCell(cellCount++);
		cell.setCellValue("Date Joined:");
		cell.setCellStyle(boldCellStyle);
		cell = row.createCell(cellCount++);
		cell.setCellValue(employee.getDateJoined().toString());
		cell.setCellStyle(alignCellStyle);
		row = spreadsheet.createRow(rowCount++);
		cellCount = 0;
		cell = row.createCell(cellCount++);
		cell.setCellValue("Position:");
		cell.setCellStyle(boldCellStyle);
		cell = row.createCell(cellCount++);
		cell.setCellValue(employee.getEmployeePosition());
		cell.setCellStyle(alignCellStyle);
		cell = row.createCell(cellCount++);
		cell = row.createCell(cellCount++);
		cell.setCellValue("Account No:");
		cell.setCellStyle(boldCellStyle);
		cell = row.createCell(cellCount++);
		cell.setCellValue(Integer.toString(employee.getAccountNo()));
		cell.setCellStyle(alignCellStyle);
		row = spreadsheet.createRow(rowCount++);
		cellCount = 0;
		cell = row.createCell(cellCount++);
		cell.setCellValue("Annual Leave:");
		cell.setCellStyle(boldCellStyle);
		cell = row.createCell(cellCount++);
		cell.setCellValue(employee.getAnnualLeave());
		cell.setCellStyle(alignCellStyle);
		cell = row.createCell(cellCount++);
		cell = row.createCell(cellCount++);
		cell.setCellValue("Sick Leave:");
		cell.setCellStyle(boldCellStyle);
		cell = row.createCell(cellCount++);
		cell.setCellValue(Integer.toString(employee.getSickLeave()));
		cell.setCellStyle(alignCellStyle);
		row = spreadsheet.createRow(rowCount++);
		cellCount = 0;
		row = spreadsheet.createRow(rowCount++);
		row = spreadsheet.createRow(rowCount++);
		cell = row.createCell(cellCount);
		cell.setCellStyle(sectionLabelStyle);
		cell.setCellValue("Salary Information");
		spreadsheet.addMergedRegion(new CellRangeAddress(rowCount - 1, rowCount - 1, cellCount, maxCellCount - 1));
		row = spreadsheet.createRow(rowCount++);
		cell = row.createCell(cellCount++);
		cell.setCellValue("Basic Salary:");
		cell.setCellStyle(boldCellStyle);
		while (cellCount < maxCellCount) {
			cell = row.createCell(cellCount++);
		}
		cell.setCellValue(employee.getEmployeeSalary());
		cellCount = 0;
		row = spreadsheet.createRow(rowCount++);
		row = spreadsheet.createRow(rowCount++);
		cell = row.createCell(cellCount);
		cell.setCellStyle(sectionLabelStyle);
		cell.setCellValue("Addition Information");
		spreadsheet.addMergedRegion(new CellRangeAddress(rowCount - 1, rowCount - 1, cellCount, maxCellCount - 1));
		for(Claim claim : claimList) {
			
			String cellValue = "Claim #"+Integer.toString(claim.getClaimID());
			
			row = spreadsheet.createRow(rowCount++);
			cell = row.createCell(cellCount++);
			cell.setCellValue(cellValue);
			cell.setCellStyle(boldCellStyle);
			while (cellCount < maxCellCount) {
				cell = row.createCell(cellCount++);
			}
			cell.setCellValue(claim.getAmount());
			cellCount = 0;
			
		}
		if(overtimeHours > 0) {
			
			String cellValue = "Overtime Hour ("+Integer.toString(overtimeHours)+")";
			
			row = spreadsheet.createRow(rowCount++);
			cell = row.createCell(cellCount++);
			cell.setCellValue(cellValue);
			cell.setCellStyle(boldCellStyle);
			while (cellCount < maxCellCount) {
				cell = row.createCell(cellCount++);
			}
			cell.setCellValue(overtimeHours*50);
			cellCount = 0;
			
		}
		row = spreadsheet.createRow(rowCount++);
		row = spreadsheet.createRow(rowCount++);
		cell = row.createCell(cellCount);
		cell.setCellStyle(sectionLabelStyle);
		cell.setCellValue("Deduction Information");
		spreadsheet.addMergedRegion(new CellRangeAddress(rowCount - 1, rowCount - 1, cellCount, maxCellCount - 1));
		
		if(totalLeaveDeduction > 0) {
			
			String cellValue = "Unpaid Leave ("+Integer.toString(totalLeaveDeduction)+")";
			row = spreadsheet.createRow(rowCount++);
			cellCount = 0;
			cell = row.createCell(cellCount++);
			cell.setCellValue(cellValue);
			cell.setCellStyle(boldCellStyle);
			while (cellCount < maxCellCount) {
				cell = row.createCell(cellCount++);
			}
			cell.setCellValue(totalLeaveDeduction*50);
			cellCount = 0;
			
		}
		
		String cellValue = "EPF";
		row = spreadsheet.createRow(rowCount++);
		cellCount = 0;
		cell = row.createCell(cellCount++);
		cell.setCellValue(cellValue);
		cell.setCellStyle(boldCellStyle);
		while (cellCount < maxCellCount) {
			cell = row.createCell(cellCount++);
		}
		cell.setCellValue(employee.getEmployeeSalary()*0.08);
		cellCount = 0;
		
		cellValue = "SOSCO";
		row = spreadsheet.createRow(rowCount++);
		cellCount = 0;
		cell = row.createCell(cellCount++);
		cell.setCellValue(cellValue);
		cell.setCellStyle(boldCellStyle);
		while (cellCount < maxCellCount) {
			cell = row.createCell(cellCount++);
		}
		cell.setCellValue(employee.getEmployeeSalary()*0.06);
		cellCount = 0;
		
		row = spreadsheet.createRow(rowCount++);
		
		cellValue = "Net Pay";
		row = spreadsheet.createRow(rowCount++);
		cellCount = 0;
		cell = row.createCell(cellCount++);
		cell.setCellValue(cellValue);
		cell.setCellStyle(netPayStyleBold);
		while (cellCount < maxCellCount) {
			cell = row.createCell(cellCount++);
			cell.setCellStyle(netPayStyle);
		}
		cell.setCellValue(payroll.getTotalAmount());
		cellCount = 0;
		

		// adjust column width for all column
		for (int i = 0; i < maxCellCount; i++) {

			spreadsheet.autoSizeColumn(i);

		}

		// Write the workbook in file system
		try {
			FileOutputStream out = new FileOutputStream(new File(filePath));
			workbook.write(out);
			out.close();
			System.out.println("Writesheet.xlsx written successfully");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
