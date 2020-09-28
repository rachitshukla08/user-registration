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

		String pattern = "^[A-Z]{1}[a-zA-Z]{2,}";
		
		if(firstName.matches(pattern))
			System.out.println("Valid first name");
		else 
			System.out.println("Invalid first name");
		
		if(lastName.matches(pattern))
			System.out.println("Valid last name");
		else 
			System.out.println("Invalid last name");
	}

}
