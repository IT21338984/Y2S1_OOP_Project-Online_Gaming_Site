package com.game;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static String url="jdbc:mysql://localhost:3306/game_db";
	private static String pass="Imesh123";
	private static String user="root";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,pass);
		}
		catch(Exception e) {
			System.out.println("DB connection is not successfull");
		}
		
		return con;
	}
}
