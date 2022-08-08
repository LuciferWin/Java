package OOP_Assignment_3;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Color : ");
		String color = sc.next();
		System.out.print("Enter Width : ");
		int width = sc.nextInt();
		System.out.print("Enter Length : ");
		int length = sc.nextInt();
		Rectangle r1 = new Rectangle(color , width, length);
		r1.Area();
		r1.displayArea();
		sc.close();
	}
}
