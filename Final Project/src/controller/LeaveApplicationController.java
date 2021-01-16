package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.connection.DBController;
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

	public LeaveApplication searchLeaveApplicationByID(int leaveID) {
		
		LeaveApplication leaveApplication = null;
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "select * from leave_application where leave_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, leaveID);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				leaveApplication = getLeaveApplicationFromResult(result);
				
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
		leaveApplication.setEmployeeID(result.getInt(1));
		leaveApplication.setDate(result.getDate(2));
		leaveApplication.setType(result.getString(3));
		leaveApplication.setStatus(result.getString(4));
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
	
}
