package stringvars;
import java.util.Scanner;
public class Exercise {

	/**
	 * 
	 * 
	 */
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
	    //instantiation
		String username;
		System.out.println("Enter your username here");
		username = keyboard.next();
	String password;
	System.out.println("Enter your password here");
	password = keyboard.next();
	System.out.println("Hello " + username + ", Welcome to CSC200 class! and Your password is " + password + ".");
}
		}
