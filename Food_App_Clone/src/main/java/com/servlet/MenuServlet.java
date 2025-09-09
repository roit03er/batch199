package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.foodApp.DAOimpl.MenuDAOImple;
import com.foodApp.Model.Menu;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/menu")
public class MenuServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	
    	int restId = Integer.parseInt(req.getParameter("restaurantId"));

        MenuDAOImple daoImpl = new MenuDAOImple();
        
        List<Menu> allMenusByRestaurant = daoImpl.getAllMenusByRestaurant(restId);
        
        for(Menu menu : allMenusByRestaurant) {
        	System.out.println(menu);
        }
        req.setAttribute("allMenusByRestaurant", allMenusByRestaurant);
        RequestDispatcher rd = req.getRequestDispatcher("menu.jsp");
        rd.forward(req, resp);
    }
}
