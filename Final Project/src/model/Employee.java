package model;

public class Employee {
	
	private int employeeID;
	
	private String employeeName;
	
	private String employeePosition;
	
	private double employeeSalary;
	
	private int annualLeave;
	
	private int sickLeave;
	
	public Employee() {};

	public Employee(int employeeID, String employeeName, String employeePosition, double employeeSalary,
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

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
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
