package com.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class gameDBUtil implements allPage {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static boolean createGame(String name, String type, String category, String description, String fileName) {
		
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into games values (0,'"+name+"','"+type+"','"+category+"','"+description+"','"+fileName+"')";
		
			int r = stmt.executeUpdate(sql);
			
			if(r>0) {
				isSuccess = true;
			}
			else { 
				isSuccess = false;
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Game> getGameDetails(String gname){
		
		//int convertedID = Integer.parseInt(Id);
		ArrayList<Game> gm = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from games where name='"+gname+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String type = rs.getString(3);
				String category = rs.getString(4);
				String description = rs.getString(5);
				String image = rs.getString(6);
				
				Game g = new Game(id, name, type, category, description,image);
				gm.add(g);	
			}
			
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		
		return gm;
	}

	public static List<Game> getAllGames(){
		
		//int convertedID = Integer.parseInt(Id);
		ArrayList<Game> gme = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from games";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String type = rs.getString(3);
				String age = rs.getString(4);
				String description = rs.getString(5);
				String fileName = rs.getString("image");				
				
				Game g = new Game(id, name, type, age, description,fileName);
				gme.add(g);
				g = null;
			}
			
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		
		return gme;
	}
	
	public static boolean updateGame(String id, String name, String type, String category, String description) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update games set name='"+name+"',type='"+type+"',category='"+category+"',description='"+description+"' "
					+"where id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean deleteGame(String id) {
		
		int convertedID = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from games where id='"+convertedID+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean retrieveGames(){
		
		//int convertedID = Integer.parseInt(Id);
		boolean is=false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from games";
			int rs=stmt.executeUpdate(sql);
			
			
			if(rs>0) {
				is=true;
			}
			else {
				is=false;
				
			}
			
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		
		return is;
	}

	@Override
	public List<Game> getAllDetails() {
		
		ArrayList<Game> gme = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from games";
			PreparedStatement ps=con.prepareStatement(sql);
			rs=ps.executeQuery(sql);
			
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String type = rs.getString(3);
				String age = rs.getString(4);
				String description = rs.getString(5);
				String fileName = rs.getString("image");				
				
				Game g = new Game(id, name, type, age, description,fileName);
				gme.add(g);
			}
			
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		
		return gme;
	}
	
}
