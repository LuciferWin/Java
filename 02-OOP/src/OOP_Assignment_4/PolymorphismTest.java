package OOP_Assignment_4;

import java.util.Scanner;

public class PolymorphismTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Side Length For A Cube : ");
		int x = sc.nextInt();
		System.out.print("Enter Radius For A Circle : ");
		int radius = sc.nextInt();
		Shape[] shape = {new Cube(), new Circle()};
		shape[0] = new Cube();
		shape[1] = new Circle();
		System.out.println("Area of the Cube : " + shape[0].Area(x));
		System.out.println("Volume of the Cube : " + shape[0].Volume(x));
		System.out.println("Area of the Circle : " + shape[1].Area(radius));
		sc.close();
	}
}
