package com.servlet;

import java.io.IOException;
import java.util.List;

import com.foodApp.DAOimpl.RestaurantDAOImplementation;
import com.foodApp.Model.Restaurant;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/restaurant1")
public class newHomeServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Hi from home servlet");
		
		RestaurantDAOImplementation daoImpl = new RestaurantDAOImplementation();
		List<Restaurant> allRestaurant = daoImpl.getAllRestaurant();
		
		
		for (Restaurant res : allRestaurant) {
			System.out.println(res);
		}
		
		req.setAttribute("allRestaurant", allRestaurant);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("newRestaurant.jsp");
		
		rd.forward(req, resp);
	}
}
