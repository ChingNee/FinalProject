package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.connection.DBController;
import exception.ItemNotAvailableForUpdateException;
import model.Employee;
import model.LeaveApplication;

public class LeaveApplicationController {

	private DBController dbController;

	public LeaveApplicationController() {

		this.dbController = new DBController();

	}

	public void insertLeaveApplication(LeaveApplication leaveApplication) {

		try {
			Connection con = dbController.getConnection();

			String query = "insert into leave_application(employee_id,date,type,status)" + " values(?,?,?,?)";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, leaveApplication.getEmployeeID());
			statement.setDate(2, leaveApplication.getDate());
			statement.setString(3, leaveApplication.getType());
			statement.setString(4, leaveApplication.getStatus());

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

	public void updateLeaveApplication(LeaveApplication leaveApplication) {

		try {
			Connection con = dbController.getConnection();

			String query = "update leave_application set " + "employee_id = ?," + "date = ?," + "type = ?,"
					+ "status = ?" + " where leave_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, leaveApplication.getEmployeeID());
			statement.setDate(2, leaveApplication.getDate());
			statement.setString(3, leaveApplication.getType());
			statement.setString(4, leaveApplication.getStatus());
			statement.setInt(5, leaveApplication.getLeaveID());
			
			int i = statement.executeUpdate();
			
			if(leaveApplication.getStatus().equals("Accept")) {
				
				EmployeeController employeeController = new EmployeeController();
				Employee employee = employeeController.searchByEmployeeID(leaveApplication.getEmployeeID());
				
				if(leaveApplication.getType().equals("Annual Leave")) {
					employee.setAnnualLeave(employee.getAnnualLeave()-1);										
				}else if(leaveApplication.getType().equals("Sick Leave")) {
					employee.setSickLeave(employee.getSickLeave()-1);
				}
				
				employeeController.updateEmployee(employee);
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteLeaveApplicationByID(int leaveID) {
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "delete from leave_application where leave_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, leaveID);
			
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

	public LeaveApplication searchLeaveApplicationByID(int leaveID) throws ItemNotAvailableForUpdateException {
		
		LeaveApplication leaveApplication = null;
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "select * from leave_application where leave_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, leaveID);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				leaveApplication = getLeaveApplicationFromResult(result);
				
				if(leaveApplication.getStatus().equals("Accept")) {
					
					throw new ItemNotAvailableForUpdateException();
					
				}
				
				return leaveApplication;
				
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

	private LeaveApplication getLeaveApplicationFromResult(ResultSet result) throws SQLException {
		LeaveApplication leaveApplication;
		leaveApplication = new LeaveApplication();
		leaveApplication.setLeaveID(result.getInt(1));
		leaveApplication.setEmployeeID(result.getInt(2));
		leaveApplication.setDate(result.getDate(3));
		leaveApplication.setType(result.getString(4));
		leaveApplication.setStatus(result.getString(5));
		return leaveApplication;
	}

	public ArrayList<LeaveApplication> getLeaveApplicationList(){
		
		ArrayList<LeaveApplication> leaveApplicationList = new ArrayList<LeaveApplication>();
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "select * from leave_application";
			
			PreparedStatement statement = con.prepareStatement(query);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				leaveApplicationList.add(getLeaveApplicationFromResult(result));
				
			}
			
			return leaveApplicationList;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public ArrayList<LeaveApplication> getApprovedLeaveApplicationListByEmployeeID(int employeeID){
		
		ArrayList<LeaveApplication> leaveApplicationList = new ArrayList<LeaveApplication>();
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "select * from leave_application where employee_id = ? and status = 'approved'";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, employeeID);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				leaveApplicationList.add(getLeaveApplicationFromResult(result));
				
			}
			
			return leaveApplicationList;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public ArrayList<LeaveApplication> getLeaveApplicationListByEmployeeID(int employeeID){
		
		ArrayList<LeaveApplication> leaveApplicationList = new ArrayList<LeaveApplication>();
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "select * from leave_application where employee_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, employeeID);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				leaveApplicationList.add(getLeaveApplicationFromResult(result));
				
			}
			
			return leaveApplicationList;
			
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
