import java.util.List;
import java.util.Scanner;

import com.foodApp.DAOimpl.MenuDAOImple;
import com.foodApp.Model.Menu;

public class Menu_Launch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		//INSERTING - MENU
		
		
//		System.out.println("Enter the Restaurant ID: ");
//		int restaurantId = scanner.nextInt();
//		scanner.nextLine();
//		
//		System.out.println("Enter the ItemName: ");
//		String itemName= scanner.nextLine();
//		
//		System.out.println("Enter the Description: ");
//		String description = scanner.nextLine();
//		
//		System.out.println("Enter the Price : ");
//		int price = scanner.nextInt();
//		scanner.nextLine();
//		
//		System.out.println("Enter the isAvailable: ");
//		String isAvailable = scanner.nextLine();
//		
//		System.out.println("Enter the Ratings: ");
//		int rating = scanner.nextInt();
//		scanner.nextLine();
//		
//		System.out.println("Enter the ImagePath: ");
//		String imagePath= scanner.nextLine();
//		
//		Menu menu = new Menu(0, restaurantId, itemName, description, price, isAvailable, rating, imagePath);
//		
//		MenuDAOImple menuDao = new MenuDAOImple();
//		menuDao.addMenu(menu);
//		System.out.println("Menu Inserted Successfully!");
//	
		
		
		
		
				//GET MENU BY ID
		
//	        System.out.print("Enter Menu ID: ");
//	        int menuId = scanner.nextInt();
//
//	        // Create object of DAO
//	        MenuDAOImple menuDAO = new MenuDAOImple();
//
//	        // Call the method
//	        Menu menu = menuDAO.getMenuById(menuId);
//
//	      System.out.println(menu);
////	      
///
///
///
///
///		<>-----	GET ALL RESTAURANT ----->
//	      
//	      MenuDAOImple menuDAO= new MenuDAOImple();
//	      
//	      List<Menu> menuList = menuDAO.getAllMenu();
//	      
//	      for (Menu o : menuList){
//	    	  System.out.println("MenuID: "+o.getMenuId());
//	    	  System.out.println("Restaurant ID:  "+o.getRestaurantId());
//	    	  System.out.println("Item Name: "+o.getItemName());
//	    	  System.out.println("Description: "+o.getDescription());
//	    	  System.out.println("Price: "+o.getPrice());
//	    	  System.out.println("IsAvailable: "+o.getIsAvailable());
//	    	  System.out.println("Rating: "+o.getRating());
//	    	  System.out.println("ImagePath: "+o.getImagePath());
		
		
		
		
		
//				<	-----	//DELETE - MENU ----->
		
		
//			MenuDAOImple menuD = new MenuDAOImple();
//			System.out.println("Enter Menu ID to Delete: ");
//			int id = scanner.nextInt();
//			
//			menuD.deleteMenu(id);
		
		
		
		
//			// GET-RESTAURANT-BY-ID //
//		
//		 System.out.print("Enter Restaurant ID: ");
//	        int restaurantId = scanner.nextInt();
//
//	        // Step 2: Create DAO object
//	        MenuDAOImple menuDao = new MenuDAOImple();
//
//	        // Step 3: Call the method
//	        List<Menu> menuList = menuDao.getAllMenusByRestaurant(restaurantId);
//
//	        // Step 4: Check and display the result
//	        if (menuList.isEmpty()) {
//	            System.out.println("No menu found for the given restaurant ID.");
//	        } else {
//	            for (Menu menu : menuList) {
//	                System.out.println(menu);
//	            }
//	        }
//
//	        scanner.close();
//	    }
		
	
		
		
//				<-----UPDATE-MENU------->
		
		
		MenuDAOImple menuDao = new MenuDAOImple();
		
		
		System.out.println("Enter Menu Id to Update: ");
		int menuId = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the new Restaurant ID: ");
		int restaurantId= scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the Item Name: ");
		String itemName= scanner.nextLine();
		
		System.out.println("Enter the Description: ");
		String description =scanner.nextLine();
		
		System.out.println("Enter the Updated Price: ");
		int price = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the Updated IsAvailable: ");
		String isAvailable = scanner.nextLine();
		
		System.out.println("Enter the Rating: ");
		int rating = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the Update ImagePath: ");
		String imagePath = scanner.nextLine();
		
		Menu updateMenu = new Menu(menuId, restaurantId, itemName, description, price,  isAvailable, imagePath, rating);
		
		menuDao.updateMenu(updateMenu);
		
		System.out.println("Order Updated Succssfully.");
		
	}
		
		
		
	      }
	      
	      

	      
	      
	      
	    
	
		


