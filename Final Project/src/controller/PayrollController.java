package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.connection.DBController;
import model.Payroll;

public class PayrollController {

	private DBController dbController;

	public PayrollController() {

		this.dbController = new DBController();

	}

	public void insertPayroll(Payroll payroll) {

		try {
			Connection con = dbController.getConnection();

			String query = "insert into payroll(employee_id,"
					+ "total_claim,total_deduction,total_amount,date) values(?,?,?,?,?)";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, payroll.getEmployeeID());
			statement.setDouble(2, payroll.getTotalClaim());
			statement.setDouble(3, payroll.getTotalDeduction());
			statement.setDouble(4, payroll.getTotalAmount());
			statement.setDate(5, payroll.getDate());

			int i = statement.executeUpdate();
			System.out.println(i + " row inserted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updatePayroll(Payroll payroll) {

		try {
			Connection con = dbController.getConnection();

			String query = "update payroll set " + "employee_id = ?," + "total_claim = ?," + "total_deduction = ?,"
					+ "total_amount = ?," + "date = ?" + " where payroll_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, payroll.getEmployeeID());
			statement.setDouble(2, payroll.getTotalClaim());
			statement.setDouble(3, payroll.getTotalDeduction());
			statement.setDouble(4, payroll.getTotalAmount());
			statement.setDate(5, payroll.getDate());
			statement.setInt(6, payroll.getPayrollID());
			
			int i = statement.executeUpdate();
			System.out.println(i+" row updated");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deletePayrollById(int payrollID) {
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "delete from payroll where payroll_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, payrollID);
			
			int i = statement.executeUpdate();
			System.out.println(i+" row deleted");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public Payroll searchPayrollByID(int payrollID) {
		
		Payroll payroll = null;
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "select * from payroll where payroll_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, payrollID);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				payroll = getPayrollFromResult(result);
				
				return payroll;
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	private Payroll getPayrollFromResult(ResultSet result) throws SQLException {
		Payroll payroll;
		payroll = new Payroll();
		payroll.setPayrollID(result.getInt(1));
		payroll.setEmployeeID(result.getInt(2));
		payroll.setTotalClaim(result.getDouble(3));
		payroll.setTotalDeduction(result.getDouble(4));
		payroll.setTotalAmount(result.getDouble(5));
		payroll.setDate(result.getDate(6));
		return payroll;
	}

	public ArrayList<Payroll> getListOfPayroll(){
		
		ArrayList<Payroll> payrollList = new ArrayList<Payroll>();
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "select * from payroll";
			
			PreparedStatement statement = con.prepareStatement(query);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
								
				payrollList.add(getPayrollFromResult(result));
				
			}
			
			return payrollList;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
