import java.util.Scanner;
import java.util.regex.*;

/**User need to enter a valid First Name
- First name starts with Cap and has minimum 3 characters
 * 
 */

/**
 * @author Rachit
 *
 */
public class UserRegistration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to user registration");
		
		System.out.println("Please enter your first name:");
		String firstName = sc.nextLine();
		System.out.println("Please enter your last name:");
		String lastName = sc.nextLine();
		System.out.println("Enter Email ID");
		String email = sc.nextLine();
		
		String namePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
		
		if(firstName.matches(namePattern))
			System.out.println("Valid first name");
		else 
			System.out.println("Invalid first name");
		
		if(lastName.matches(namePattern))
			System.out.println("Valid last name");
		else 
			System.out.println("Invalid last name");
		
		String emailPattern = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$";
		
		if(email.matches(emailPattern))
			System.out.println("Valid email");
		else 
			System.out.println("Invalid email");
	}

}
