package com.game;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/retrieveServlet")

public class retrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public retrieveServlet() {
    
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean isTrue;
		
		isTrue=gameDBUtil.retrieveGames();
		
		if(isTrue=true) {
			List<Game> getAllDetails = gameDBUtil.getAllGames();
			request.setAttribute("getAllDetails", getAllDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("GamePage.jsp");
			dis.forward(request, response);
		}
		else {
			List<Game> getAllDetails = gameDBUtil.getAllGames();
			request.setAttribute("getAllDetails", getAllDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("GamePage.jsp");
			dis.forward(request, response);
		}
	}

}
