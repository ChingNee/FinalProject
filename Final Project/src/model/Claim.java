package model;

public class Claim {
	
	private int claimID;
	
	private int employeeID;
	
	private double amount;
	
	private String status;
	
	public Claim() {};
	
	public Claim(int claimID, int employeeID, double amount, String status) {
		super();
		this.claimID = claimID;
		this.employeeID = employeeID;
		this.amount = amount;
		this.status = status;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getClaimID() {
		return claimID;
	}

	public void setClaimID(int claimID) {
		this.claimID = claimID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
