package Assignments;

import java.util.Scanner;

public class String_Assignment_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your NRC (If first Number is less than 10, Enter 09 eg. 01 , 02) : ");
		String nrc = sc.nextLine();
		
		int helper1 = nrc.indexOf("(");
		String township = nrc.substring(3, helper1);
		String nrcNo = nrc.substring(nrc.length()-6);
		
		System.out.println("\nLocation : " + township);
		System.out.println("Number : " + nrcNo);
		
		sc.close();

	}

}
