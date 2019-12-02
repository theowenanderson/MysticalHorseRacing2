package controller;

import java.sql.*;

public class GameEngine {
	public static String username_current = "";
	public static int userID_current;
	public static int userIDbalance;
	public void initialize() {
		Connection initConnect = getConnection();
		//test
		
		
	}
	
	public static Connection getConnection() {
		// Database Initial Connection, will have to be called for each class
		
		String username = "sql9314118";
		String pass = "fBAhsdUvtm";
		
		String url = "jdbc:mysql://sql9.freemysqlhosting.net:3306/sql9314118";
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