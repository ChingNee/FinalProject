package model;

import java.sql.Date;

public class LeaveApplication {
	
	private int leaveID;
	
	private int employeeID;
	
	private Date date;
	
	private String type;
	
	private String status;

	public LeaveApplication(int leaveID, int employeeID, Date date, String type, String status) {
		super();
		this.leaveID = leaveID;
		this.employeeID = employeeID;
		this.date = date;
		this.type = type;
		this.status = status;
	}

	public LeaveApplication() {
		// TODO Auto-generated constructor stub
	}

	public int getLeaveID() {
		return leaveID;
	}

	public void setLeaveID(int leaveID) {
		this.leaveID = leaveID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
