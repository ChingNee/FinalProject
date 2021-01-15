package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.connection.DBController;
import model.User;

public class UserController {
	
	private DBController dbController;
	
	public UserController() {
		
		this.dbController = new DBController();
		
	}
	
	public void insertUser(User user) {
		
		try {
			
			Connection con = dbController.getConnection();
			String query = "insert into user values(?,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, user.getUserID());
			preparedStatement.setString(2,user.getFullName());
			preparedStatement.setString(3, user.getPassword());
			
			int i = preparedStatement.executeUpdate();
			System.out.println(i+" rows inserted");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void updateUser(User user) {
		
		try {
			Connection con = dbController.getConnection();
			String query = " update user set "+
							"full_name = ?,"+
							"password = ? "+
							"where user_id = ?";
			PreparedStatement statement = con.prepareStatement(query);
			
			statement.setString(1, user.getFullName());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getUserID());
			
			int i = statement.executeUpdate();
			System.out.println(i+" row has been updated");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void deleteUserByID(String userID) {
				
		Connection con;
		try {
			
			String query = "delete from user where user_ID = ?";

			con = dbController.getConnection();
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, userID);
			
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

	public User searchByUserID(String userID) {
		
		User user = null;
		
		try {
			Connection con = dbController.getConnection();
			
			String query = "select * from user where user_id = ?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, userID);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				user = new User(result.getString(1),result.getString(2),result.getString(3));
				
			}
			
			return user;
			
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
