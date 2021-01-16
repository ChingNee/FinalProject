package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.connection.DBController;
import model.Claim;

public class ClaimController {

	private DBController dbController;

	public ClaimController() {

		this.dbController = new DBController();

	}

	public void insertClaim(Claim claim) {

		try {
			Connection con = dbController.getConnection();

			String query = "insert into claim(employee_id,amount,status)" + " values(?,?,?)";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, claim.getEmployeeID());
			statement.setDouble(2, claim.getAmount());
			statement.setString(3, claim.getStatus());

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

	public void updateClaim(Claim claim) {

		try {
			Connection con = dbController.getConnection();

			String query = "update claim set" + "employee_id =?," + "amount = ?," + "status = ? "
					+ "where claim_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, claim.getEmployeeID());
			statement.setDouble(2, claim.getAmount());
			statement.setString(3, claim.getStatus());
			
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

	public void deleteClaimByID(int claimID) {
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "delete from claim where claim_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, claimID);
			
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

	public Claim searchClaimByID(int claimID) {
		
		Claim claim = null;
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "select * from claim where claim_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, claimID);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				claim = getClaimFromResult(result);
				
				return claim;
				
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

	private Claim getClaimFromResult(ResultSet result) throws SQLException {
		Claim claim = new Claim();
		claim.setClaimID(result.getInt(1));
		claim.setEmployeeID(result.getInt(2));
		claim.setAmount(result.getDouble(3));
		claim.setStatus(result.getString(4));
		return claim;
	}

	public ArrayList<Claim> getClaimList(){
		
		ArrayList<Claim> claimList = new ArrayList<Claim>();
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "select * from claim";
			
			PreparedStatement statement = con.prepareStatement(query);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
							
				claimList.add(getClaimFromResult(result));
				
			}
			
			return claimList;
			
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
