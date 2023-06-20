package com.game;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String category = request.getParameter("category");
		String description = request.getParameter("description");
		
		boolean isTrue;
		
		isTrue = gameDBUtil.updateGame(id, name, type, category, description);
		
		if(isTrue == true) {
			
//			List<Game> gameDetails = gameDBUtil.getGameDetails(name);
//			request.setAttribute("gameDetails", gameDetails);
			
			List<Game> getAllDetails = gameDBUtil.getAllGames();
			request.setAttribute("getAllDetails", getAllDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("GamePage.jsp");
			dis.forward(request, response);
		}
		else {
			List<Game> gameDetails = gameDBUtil.getGameDetails(name);
			request.setAttribute("gameDetails", gameDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
	}

}
