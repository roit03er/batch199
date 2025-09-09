import java.util.List;
import java.util.Scanner;

import com.foodApp.DAOimpl.RestaurantDAOImplementation;
import com.foodApp.Model.Restaurant;

public class Restaurant_Launch {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        
	        RestaurantDAOImplementation dao = new RestaurantDAOImplementation();
		        
		        List<Restaurant> restaurantList = dao.getAllRestaurant();

		        for (Restaurant r : restaurantList) {
		            System.out.println("ID: " + r.getRestaurantId());
		            System.out.println("Name: " + r.getName());
		            System.out.println("Address: " + r.getAddress());
		            System.out.println("Cuisine Type: " + r.getCuisineType());
		            System.out.println("Delivery Time: " + r.getDeliveryTime());
		            System.out.println("Admin User ID: " + r.getAdminUserId());
		            System.out.println("Rating: " + r.getRating());
		            System.out.println("Is Active: " + r.getIsActive());
		            System.out.println("Image Path: " + r.getImagePath());
		            System.out.println("---------------------------");		      
		            
		        
		        }

		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        //Delete Restaurant
		        
//		        
		        
		        
		        
		        // Fetching Restaurant
		        
		        
//		        System.out.println("Enter the Id");
//		        int id= sc.nextInt();
//		        
//		        RestaturantDAOIMple resI = new RestaturantDAOIMple();
//		        
//		        
//		        Restaurant r = resI.getRestaurantByid(id);
//		        
//		        
//		        System.out.println(r);
//		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
////		         Inserting Restaurant
///
///

//	        System.out.print("Enter Restaurant Name: ");
//	        String name = sc.nextLine();
//
//	        System.out.print("Enter Address: ");
//	        String address = sc.nextLine();
//
//		        System.out.print("Enter Cuisine Type: ");
//		        String cuisineType = sc.nextLine();
//
//		        System.out.print("Enter Delivery Time: ");
//		        String deliveryTime = sc.nextLine();
//
//		        System.out.print("Enter Admin User ID: ");
//		        String adminUserId = sc.nextLine();
//
//		        System.out.print("Enter Rating: ");
//		        String rating = sc.nextLine();
//
//		        System.out.print("Is Active (yes/no): ");
//		        String isActive = sc.nextLine();
//
//		        System.out.print("Enter Image Path: ");
//		        String imagePath = sc.nextLine();
//
//		        Restaurant restaurant = new Restaurant(
//		                0, name, address, cuisineType, deliveryTime,
//		                adminUserId, rating, isActive, imagePath
//		        );
//		        RestaturantDAOIMple dao1 = new RestaturantDAOIMple();
//		        dao1.addRestaurant(restaurant);
//
//		        System.out.println("Restaurant inserted successfully!");
	}
		}
