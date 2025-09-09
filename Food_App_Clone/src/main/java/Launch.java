import java.util.Scanner;

import com.foodApp.DAOimpl.UserDAOImple;
import com.foodApp.Model.User;

public class Launch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the id");
		int id = scan.nextInt();
		
		UserDAOImple udao = new UserDAOImple();
		
		User u = udao.getUserById(id);
		
		System.out.println(u);
		u.setPassword("1234");
		u.setAddress("UB City");
		
		udao.updateUser(u);
		
		
		
		
		
//		System.out.println("Enter the name");
//		String name = scan.next();
//		System.out.println("Enter the Username");
//		String username = scan.next();
//		System.out.println("Enter the Password");
//		String password = scan.next();
//		System.out.println("Enter the email");
//		String email = scan.next();
//		System.out.println("Enter the phoneNumber");
//		String phoneNumber = scan.next();
//		System.out.println("Enter the address");
//		String Address = scan.next();
//		System.out.println("Enter the role");
//		String role= scan.next();
		
		
		
		
		
	}

}
