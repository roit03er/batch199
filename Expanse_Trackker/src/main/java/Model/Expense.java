package Model;

import java.util.Date;

public class Expense {
	private int id;
	 private int user_id;
	    private String category, description;
	    private double amount;
	    private Date date;
	    
	    public Expense() {
	    	
	    }

	    public Expense(int id, int user_id, String category, String description, double amount, Date date) {
	        this.id = id;
	        this.user_id = user_id;
	        this.category = category;
	        this.description = description;
	        this.amount = amount;
	        this.date = date;
	    }

			
			
		


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getUser_id() {
			return user_id;
		}

		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}

		

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		@Override
		public String toString() {
			return "Expense [id=" + id + ", user_id=" + user_id + ", category=" + category + ", description="
					+ description + ", amount=" + amount + ", date=" + date + "]";
		}
		
}
