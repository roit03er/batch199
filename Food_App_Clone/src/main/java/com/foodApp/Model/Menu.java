package com.foodApp.Model;

public class Menu {
	private int menuId;
	private int restaurantId;
	private String itemName;
	private String description;
	private int price;
	private String isAvailable;
	private int rating;
	private String imagePath;
	
	
	public Menu(int id, int restaurantId, String itemName, String description, int price, String isAvailable, String imagePath) {
		this.menuId = id;
	    this.restaurantId = restaurantId;
	    this.itemName = itemName;
	    this.description = description;
	    this.price=price;
	    this.isAvailable = isAvailable;
	    this.imagePath = imagePath;
		
	}


	public Menu(int menuId, int restaurantId, String itemName, String description,
            int price, String isAvailable, int rating, String imagePath) {
    this.menuId = menuId;
    this.restaurantId = restaurantId;
    this.itemName = itemName;
    this.description = description;
    this.price = price;
    this.isAvailable = isAvailable;
    this.rating = rating;
    this.imagePath = imagePath;
}
	public Menu(int menuId, int restaurantId, String itemName, String description,
            String isAvailable, String imagePath) {
    this.menuId = menuId;
    this.restaurantId = restaurantId;
    this.itemName = itemName;
    this.description = description;
    this.isAvailable = isAvailable;
    this.imagePath = imagePath;
}




	public Menu(int menuId2, int restaurantId2, String itemName2, String description2, int price2, String isAvailable2,
			String imagePath2, int rating2) {
		this.menuId=menuId2;
		this.restaurantId=restaurantId2;
		this.itemName=itemName2;
		this.description=description2;
		this.price=price2;
		this.isAvailable=isAvailable2;
		this.imagePath=imagePath2;
		this.rating=rating2;
	}


	public int getMenuId() {
		return menuId;
	}


	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}


	public int getRestaurantId() {
		return restaurantId;
	}


	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getIsAvailable() {
		return isAvailable;
	}


	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", restaurantId=" + restaurantId + ", itemName=" + itemName + ", description="
				+ description + ", price=" + price + ", isAvailable=" + isAvailable + ", rating=" + rating
				+ ", imagePath=" + imagePath + "]";
	}
	
}
