package Day2;

import java.util.Scanner;

public class Conditional_Statement {

	public static void main(String[] args) {
		
		// if statement
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Language : ");
//		String lang = sc.nextLine();
//		
//		if ( lang.equalsIgnoreCase("Java")) {
//			System.out.println("Best Programming Language");
//		}
		
		// if else statement
		
//		System.out.println("-----if else-----");
//		System.out.print("Enter E-mail : ");
//		String mail = sc.nextLine();
//		System.out.print("Enter Password : ");
//		String pass = sc.nextLine();
//		
//		if (mail.equals("admin@gmail.com") && pass.equals("123")) {
//			System.out.println("Login Success!");
//		}else {
//			System.out.println("Login Fail!");
//		}
		
		// if else if statement
		
		System.out.println("-----if else if-----");
		System.out.print("Enter Your BMI Value : ");
		float bmi = sc.nextFloat();
		
		if(bmi < 18.5) {
			System.out.println("Underweight!");
		}
		else if(bmi >=18.5 && bmi <= 24.9) {
			System.out.println("Normal Weight!");
		}
		else if(bmi > 24.9 && bmi <= 29.9) {
			System.out.println("Overweight!");
		}
		else {
			System.out.println("Obesity!");
		}
	}

}
