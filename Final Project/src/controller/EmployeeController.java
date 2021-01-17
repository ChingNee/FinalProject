package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.connection.DBController;
import model.Employee;

public class EmployeeController {

	private DBController dbController;

	public EmployeeController() {
		this.dbController = new DBController();
	}

	public void insertEmployee(Employee employee) {

		try {
			Connection con = dbController.getConnection();

			String query = "insert into employee" + "(employee_name,employee_position,employee_salary,"
					+ "annual_leave, sick_leave, gender, account_no, date_joined, age, phone_no) values(?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, employee.getEmployeeName());
			statement.setString(2,employee.getEmployeePosition());
			statement.setDouble(3, employee.getEmployeeSalary());
			statement.setInt(4, employee.getAnnualLeave());
			statement.setInt(5, employee.getSickLeave());
			statement.setString(6, employee.getGender());
			statement.setInt(7, employee.getAccountNo());
			statement.setDate(8, employee.getDateJoined());
			statement.setInt(9, employee.getAge());
			statement.setString(10, employee.getPhoneNo());
			
			
			int i = statement.executeUpdate();
			System.out.println(i+" row inserted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateEmployee(Employee employee) {
		
		try {
			
			Connection con = dbController.getConnection();
			
			String query = "update employee set "+
							" employee_name = ?,"+
							" employee_position = ?,"+
							" employee_salary = ?,"+
							" annual_leave = ?,"+
							" sick_leave = ?,"+
							" gender = ?,"+
							" account_no = ?,"+
							" date_joined = ?,"+
							" age = ?,"+
							" phone_no = ?"+
							" where employee_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, employee.getEmployeeName());
			statement.setString(2, employee.getEmployeePosition());
			statement.setDouble(3, employee.getEmployeeSalary());
			statement.setInt(4, employee.getAnnualLeave());
			statement.setInt(5, employee.getSickLeave());
			statement.setString(6, employee.getGender());
			statement.setInt(7, employee.getAccountNo());
			statement.setDate(8, employee.getDateJoined());
			statement.setInt(9, employee.getAge());
			statement.setString(10, employee.getPhoneNo());
			statement.setInt(11, employee.getEmployeeID());
			
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

	public void deleteEmployeeByID(int employeeID) {
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "delete from employee where employee_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, employeeID);
			
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

	public Employee searchByEmployeeID(int employeeID) {
		
		Employee employee = null;
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "select * from employee where employee_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, employeeID);
			
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				
				employee = getEmployeeFromResult(result);
				
			}
			
			return employee;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

	private Employee getEmployeeFromResult(ResultSet result) throws SQLException {
		Employee employee;
		employee = new Employee();
		employee.setEmployeeID(result.getInt(1));
		employee.setEmployeeName(result.getString(2));
		employee.setEmployeePosition(result.getString(3));
		employee.setEmployeeSalary(result.getDouble(4));
		employee.setAnnualLeave(result.getInt(5));
		employee.setSickLeave(result.getInt(6));
		employee.setGender(result.getString(7));
		employee.setAccountNo(result.getInt(8));
		employee.setDateJoined(result.getDate(9));
		employee.setAge(result.getInt(10));
		employee.setPhoneNo(result.getString(11));
		
		return employee;
	}

	public ArrayList<Employee> getEmployeeList(){
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		try {
			Connection con =  dbController.getConnection();
			
			String query = "select * from employee";
			
			PreparedStatement statement = con.prepareStatement(query);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				employeeList.add(getEmployeeFromResult(result));
				
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
	
}
