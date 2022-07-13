package Day6;

import java.util.Scanner;

public class UserException {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("Enter your age : ");
			var age = sc.nextInt();
			validAge(age); // exception
		} catch (InvalidAgeException e) {
			System.err.println(e.getMessage());
		}

	}

	private static void validAge(int age) throws InvalidAgeException {
		
		if(age < 18) {
			throw new InvalidAgeException("Your age is not allowed to smoke.");
		} else {
			System.out.println("You can smoke.");
		}
		
	}

}

class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException(String msg) {
		super(msg);
	}

	public InvalidAgeException() {
		
	}
	
}
