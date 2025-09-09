package com.foodApp.Model;


public class Restaurant {
	
	private int restaurantId;
	private String name;
	private String address;
	private String cuisineType;
	private String deliveryTime;
	private String adminUserId;
	private String rating;
	private String isActive;
	private String imagePath;
	
	
	public Restaurant() {
		
	}
	
	public Restaurant(int restaurantId, String name, String address, String cuisineType, String deliveryTime, String admiUserId, String rating, String isActive, String imagePath ) {
		this.restaurantId=restaurantId;
		this.name=name;
		this.address=address;
		this.cuisineType=cuisineType;
		this.deliveryTime=deliveryTime;
		this.adminUserId=admiUserId;
		this.rating=rating;
		this.isActive=isActive;
		this.imagePath=imagePath;
	}
	

	
	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", address=" + address + ", cuisineType= "+cuisineType+"]";
	}
	
	
	
	
}
