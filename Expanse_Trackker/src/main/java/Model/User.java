package Model;

public class User {
	
	    private int user_id;
	    private String name, username, password, email, phone, address;
		public User(int user_id, String name, String username, String password, String email, String phone, String address) {
			super();
			this.user_id = user_id;
			this.name = name;
			this.username = username;
			this.password = password;
			this.email = email;
			this.phone = phone;
			this.address = address;
		}

	    	public User () {
	    		
	    	}

			public int getUser_id() {
				return user_id;
			}

			public void setUser_id(int user_id) {
				this.user_id = user_id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUsername() {
				return username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPhone() {
				return phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			@Override
			public String toString() {
				return "User [id=" + user_id + ", name=" + name + ", username=" + username + ", password=" + password
						+ ", email=" + email + ", phone=" + phone + ", address=" + address + "]";
			}
	    	
	}


