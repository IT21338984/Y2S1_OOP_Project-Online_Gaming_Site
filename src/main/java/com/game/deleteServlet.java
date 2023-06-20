package com.game;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue = gameDBUtil.deleteGame(id);
		
		if(isTrue==true) {
			List<Game> getAllDetails = gameDBUtil.getAllGames();
			request.setAttribute("getAllDetails", getAllDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("GamePage.jsp");
			dis.forward(request, response);
			
		}
		else {
			List<Game> getGameDetails = gameDBUtil.getGameDetails(id);
			request.setAttribute("getGameDetails", getGameDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("GamePage.jsp");
			dispatcher.forward(request, response);
		}
	}

}
