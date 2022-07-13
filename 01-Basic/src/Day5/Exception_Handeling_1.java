package Day5;

import java.util.Scanner;

public class Exception_Handeling_1 {
	public static void main(String[] args) {
		try {
			display(100);
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Number 1 : ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Number 2 : ");
			int num2 = Integer.parseInt(sc.nextLine());
			
			var result = num1 / num2; // 100/0 (ArithmeticException a = new ArithmeticExmpe(); throw a;)
			System.out.println("Result : " + result);
			sc.close();
		}catch (ArithmeticException obj1) { // Execute When Exception Occurs in Try block
			System.err.print("Divisor must be greater than 0(Zero)!");
		}catch (NumberFormatException obj2) {
			System.err.print("User's Input must be a number!");
		}catch (NullPointerException obj3) {
			System.err.print("User's Input can't be empty");
		}catch (Exception obj0) {
			System.err.print("Please Only Enter number!");
		}
		System.out.println("\nOutside try catch block!");
	}

	private static void display(int i) {
		// TODO Auto-generated method stub
		
	}
}
