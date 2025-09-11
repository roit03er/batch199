package dao;

import Model.User;

public interface UserDAO {
	   boolean registerUser(User user);
	    User login(String username, String password);
	    User getUserById(int userId);
}

