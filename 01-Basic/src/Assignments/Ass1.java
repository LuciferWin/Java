package Assignments;

import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Your Full Name : ");
			String name = sc.nextLine();

			System.out.print("Enter E-mail : ");
			String email = sc.nextLine();
			
			System.out.print("Enter Phone No : ");
			String phone = sc.nextLine();
			
			System.out.print("Enter Education : ");
			String edu = sc.nextLine();
			
			System.out.print("Enter Monthly Income : ");
			double income = sc.nextDouble();
			
			System.out.print("Enter Age : ");
			int age = sc.nextInt();
			
			System.out.println("-----Your Profile-----");
			System.out.println("Name : " + name);
			System.out.println("E-mail : " + email);
			System.out.println("Phone : " + phone);
			System.out.println("Education : " + edu);
			System.out.println("Monthly Income : " + income);
			System.out.println("Age : " + age);
		}
		
	}

}
