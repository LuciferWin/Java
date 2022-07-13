package Assignments;

import java.util.Scanner;

public class Exception_Assignment_1 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("How many numbers do you want to enter : ");
			int i = sc.nextInt();
			String[] numbers = new String[i];
			for(var a = 0 ; a < i ; a++ ) {
				System.out.print("Enter a number : ");
				numbers [a] = sc.next();
			}
			int[] intnumbers = new int[i];
			for(var a = 0 ; a < i ; a++ ) {
				intnumbers[a] = (int) Integer.parseInt(numbers[a]);		// illegal argument Exception
			}
			
			int max, avg, min;
			
			System.out.println("----- Finding Maximum -----");
			max = intnumbers[0];
			for(var s = 1 ; s < i ; s++ ) {
				if(intnumbers[s] > max) {
					max = intnumbers[s];
				}
			}
			System.out.println("Maximum : " + max);
			
			System.out.println("----- Finding Average -----");
			System.out.print("Enter total : ");
			int total = sc.nextInt();
			System.out.print("Enter numbers : ");
			int numb = sc.nextInt();	// Arithmetic Exception
			avg = total/numb;
			System.out.println("Average : " + avg);
			
			System.out.println("----- Finding Minimum -----");
			min = intnumbers[0];
			for(var s = 0 ; s < i+1 ; s++ ) { // Array index out of Bound Exception
				if(intnumbers[s] < min) {
					min = intnumbers[s];
				}
			}
			System.out.println("Minimum : " + min);
			
			
		} catch (IllegalArgumentException obj1) {
			System.err.print("You can only enter numbers!");
		} catch (ArithmeticException obj2) {
			System.err.print("The divisor must not be 'Zero'.");
		} catch (ArrayIndexOutOfBoundsException obj3) {
			System.err.print("You pointed to over the size of the array");
		}
		
		
	}

}
