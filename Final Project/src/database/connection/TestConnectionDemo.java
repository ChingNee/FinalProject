package database.connection;

import java.sql.Connection;

/**
 * This class test the connection to the database
 * 
 * @author emalianakasmuri
 *
 */
public class TestConnectionDemo {

	/**
	 * Main entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		DBController dbCtrl = new DBController();
		
		try {
			
			Connection connection = dbCtrl.getConnection();
			System.out.println("Durian Tunggal... connection to RBDMS is a success");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
