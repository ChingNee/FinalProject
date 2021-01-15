package model;

public class Employee {
	
	private int employeeID;
	
	private String employeeName;
	
	private String employeePosition;
	
	private String employeeSalary;
	
	private int annualLeave;
	
	private int sickLeave;

	public Employee(int employeeID, String employeeName, String employeePosition, String employeeSalary,
			int annualLeave, int sickLeave) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeePosition = employeePosition;
		this.employeeSalary = employeeSalary;
		this.annualLeave = annualLeave;
		this.sickLeave = sickLeave;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

	public String getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getAnnualLeave() {
		return annualLeave;
	}

	public void setAnnualLeave(int annualLeave) {
		this.annualLeave = annualLeave;
	}

	public int getSickLeave() {
		return sickLeave;
	}

	public void setSickLeave(int sickLeave) {
		this.sickLeave = sickLeave;
	}
	

}
