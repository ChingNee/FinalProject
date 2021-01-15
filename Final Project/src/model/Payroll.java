package model;

import java.sql.Date;

public class Payroll {
	
	private int payrollID;
	
	private int employeeID;
	
	private double totalClaim;
	
	private double totalDeduction;
	
	private double totalAmount;
	
	private Date date;

	public Payroll(int payrollID, int employeeID, double totalClaim, double totalDeduction, double totalAmount,
			Date date) {
		super();
		this.payrollID = payrollID;
		this.employeeID = employeeID;
		this.totalClaim = totalClaim;
		this.totalDeduction = totalDeduction;
		this.totalAmount = totalAmount;
		this.date = date;
	}

	public Payroll() {
		// TODO Auto-generated constructor stub
	}

	public int getPayrollID() {
		return payrollID;
	}

	public void setPayrollID(int payrollID) {
		this.payrollID = payrollID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public double getTotalClaim() {
		return totalClaim;
	}

	public void setTotalClaim(double totalClaim) {
		this.totalClaim = totalClaim;
	}

	public double getTotalDeduction() {
		return totalDeduction;
	}

	public void setTotalDeduction(double totalDeduction) {
		this.totalDeduction = totalDeduction;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
