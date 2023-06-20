package com.game;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/createServlet")
@MultipartConfig
public class createServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String type = request.getParameter("type");
		String category = request.getParameter("category");
		String description = request.getParameter("description");
		Part part = request.getPart("image");
		String fileName = part.getSubmittedFileName();
		String image = request.getParameter("image");
		
		Game g = new Game(name,type,category,description,fileName);
		
		boolean isTrue;
		isTrue = gameDBUtil.createGame(name, type, category, description,fileName);
		
		if(isTrue == true) {
			
			String path = "D:/SLIIT/Year 2 Sem 1/OOP - IT2030/Assignments/Online Gaming Site/online_gaming_system/src/main/webapp/GameFiles/"+ fileName;
		
			FileOutputStream fos=new FileOutputStream(path);
			InputStream is=part.getInputStream();
			
			byte[] data=new byte[is.available()];
			is.read(data);
			fos.write(data);
			fos.close();
			String GAimage=null;
			try {
				
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from games ";
				rs=stmt.executeQuery(sql);
				
				while(rs.next()) {
					GAimage = rs.getString(6);
						
				}
				
			}
			catch(Exception e) {
				 e.printStackTrace();
			}
			
			List<Game> getAllDetails = gameDBUtil.getAllGames();
			request.setAttribute("getAllDetails", getAllDetails);
			request.setAttribute("image", GAimage);
			
			RequestDispatcher d=request.getRequestDispatcher("GamePage.jsp");
			d.forward(request, response);
		}
		else {
			RequestDispatcher d2=request.getRequestDispatcher("unsuccess.jsp");
			d2.forward(request, response);
		}
	}

}
