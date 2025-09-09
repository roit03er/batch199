package com.Food_App.DAO;

import java.util.List;

import com.foodApp.Model.Restaurant;
import com.foodApp.Model.User;

public interface RestaurantDAO {
List<Restaurant> getAllRestaurant();
	
	Restaurant getRestaurantByid(int restaurantId);
	
	void addRestaurant(Restaurant r);
	void updateRestaurant(Restaurant r);
	void deleteRestaurant(int restaurantId );
}
