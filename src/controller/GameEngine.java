package controller;

import java.sql.*;

public class GameEngine {
	public static String username_current = "";
	public static int userID_current;
	public void initialize() {
		Connection initConnect = getConnection();
		//test
		
		
	}
	
	public static Connection getConnection() {
		// Database Initial Connection, will have to be called for each class
		
		String username = "oldtown";
		String pass = "road";
		
		String url = "jdbc:mysql://localhost:3306/horseracing";
		try {
			Connection conn = DriverManager.getConnection(url,username,pass);
			System.out.println("Connected");
			return conn;
		}catch (Exception exc) {
			System.out.println("error in connection to database");
			return null;
		}
	}
}
