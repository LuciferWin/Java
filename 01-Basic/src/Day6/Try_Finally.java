package Day6;

import java.awt.DisplayMode;
import java.util.Scanner;

public class Try_Finally {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			
//			System.out.print("Enter salary : ");
//			var salary = sc.nextInt();
//			if(salary == 0) {
//				return;
//			}
//			System.out.println("Your salary is " + salary);
//			
//		} catch (NullPointerException e) {
//			System.err.println("Object does not allocate in memory.");
//		} catch (Exception obj) {
//			System.err.println(obj.getMessage());
//		} 
//		finally {
//			System.out.println("Finally Block is executed.");
//			sc.close();
//		}
//
//		System.out.println("Outside of Try Finally Block !");
		
		System.out.println("--------Try with resource statement--------");
		try (Scanner s = new Scanner(System.in)){
			System.out.print("Enter name : ");
			var name = s.nextLine();
			System.out.println("Your name : " + name);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		display();
		
	}
	
	private static void display() throws NullPointerException {
		System.out.println("Hello");
	};

}
