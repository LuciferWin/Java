package Assignments;

import java.util.Scanner;

public class Exception_Assignment_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String [] division = {"Kachin", "Kayah", "Kayin", "Chin", "Sagaing", "Tanintharyi", "Bago", "Magway", "Mandalay", "Mon", "Rakhine", "Yangon", "Shan", "Ayeyawady", "Nay Pyi Taw"};
			
			System.out.print("Enter Your NRC (If first Number is less than 10, Enter 09 eg. 01 , 02) : ");
			String nrc = sc.nextLine();
			
			int helper1 = nrc.indexOf("(");
			int helper2 = nrc.indexOf("/");
			String township = nrc.substring(3, helper1);
			String nrcNo = nrc.substring(nrc.length()-6);
			String divi = nrc.substring(0, helper2);
			int state = Integer.parseInt(divi);
			
			System.out.println("\nDivision : " + division[state-1]); 	// ArrayIndexOutOfBoundsException
			System.out.println("City : " + township);
			System.out.println("Number : " + nrcNo);
		} catch (ArrayIndexOutOfBoundsException obj) {
			System.err.print("Your NRC number is invalid.");
		} finally {
			sc.close();
		}
		
		

	}

}
