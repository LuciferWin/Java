package Day2;

import java.util.Scanner;

public class ReadData_Scanner {

	public static void main(String[] args) {
		
		// Open
		Scanner sc = new Scanner(System.in);
		
		// Process
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Salary : ");
		double salary = Double.parseDouble(sc.nextLine());
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		
		// Close
		sc.close();
		System.out.println("\n-----Data-----");
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Age : " + age);
		
	}

}
