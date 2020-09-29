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
		String emailInvalidArr[] = { "abc", "abc@.com.my", "abc@.com.my", "abc123@gmail.a", "abc123@.com",
				"abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
				"abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

		String emailValidArr[] = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com" };

		System.out.println("Welcome to user registration");

		System.out.println("Please enter your first name:");
		String firstName = sc.nextLine();
		System.out.println("Please enter your last name:");
		String lastName = sc.nextLine();
		System.out.println("Enter Email ID");
		String email = sc.nextLine();
		System.out.println("Enter Mobile number");
		String mobile = sc.nextLine();
		System.out.println("Enter password");
		String password = sc.nextLine();
		// Inputs

		String namePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
		String emailPattern = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$";
		String mobilePattern = "[0-9-]{1,}[ ][1-9]{1}[0-9]{9}";
		String passwordPattern = "(?=.*[A-Z]+)(?=.*[0-9]+)(?=.*\\W).{8,}$";
		// Patterns

		if (firstName.matches(namePattern))
			System.out.println("Valid first name");
		else
			System.out.println("Invalid first name");

		if (lastName.matches(namePattern))
			System.out.println("Valid last name");
		else
			System.out.println("Invalid last name");

		if (email.matches(emailPattern))
			System.out.println("Valid email");
		else
			System.out.println("Invalid email");

		if (mobile.matches(mobilePattern))
			System.out.println("Valid Mobile Number");
		else
			System.out.println("Invalid Mobile Number");

		if (password.matches(passwordPattern))
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");
		// Verification
		System.out.println("-----------------------------");
		for (int i = 0; i < emailInvalidArr.length; i++) {
			if (emailInvalidArr[i].matches(emailPattern))
				System.out.println(emailInvalidArr[i] + ": Valid email");
			else
				System.out.println(emailInvalidArr[i] + ": Invalid email");
		}
		System.out.println("-----------------------------");
		for (int i = 0; i < emailValidArr.length; i++) {
			if (emailValidArr[i].matches(emailPattern))
				System.out.println(emailValidArr[i] + ": Valid email");
			else
				System.out.println(emailValidArr[i] + ": Invalid email");
		}

	}
}
