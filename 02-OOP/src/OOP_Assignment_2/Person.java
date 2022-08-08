package OOP_Assignment_2;

import java.util.Scanner;

public class Person {
	private String name, nrc, phone, address;

	public Person() {
		super();
	}
	
	public Person(String name, String nrc, String phone, String address) {
		super();
		this.name = name;
		this.nrc = nrc;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNrc() {
		return nrc;
	}

	public void setNrc(String nrc) {
		this.nrc = nrc;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	void showInfo() {
		System.out.println("\tName\t\tAddress\t\tPhone\t\tNRC");
		System.out.println("\t" + getName() + "\t\t" + getAddress() + "\t\t" + getPhone() + "\t\t" + getNrc());
	}
	
	int showIdentificationInfo(Scanner sc) {
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
		
		return 0;
	}
}
