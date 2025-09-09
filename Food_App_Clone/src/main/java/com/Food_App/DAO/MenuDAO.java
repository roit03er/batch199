package com.Food_App.DAO;

import java.util.List;

import com.foodApp.Model.Menu;

public interface MenuDAO {
	List<Menu> getAllMenu();
	List<Menu> getAllMenusByRestaurant(int restaurantId);
	
    Menu getMenuById(int menuId);
    void addMenu(Menu menu);
    void updateMenu(Menu menu);
    void deleteMenu(int menuId);
}
