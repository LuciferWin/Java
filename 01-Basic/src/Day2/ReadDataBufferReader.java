package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataBufferReader {

	public static void main(String[] args) throws IOException {
		
		// Create Object
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// Operations
		System.out.print("Enter Name : ");
		String name = reader.readLine();
		System.out.print("Enter Salary : ");
		int salary = Integer.parseInt(reader.readLine());
		System.out.print("Enter Bonus Rate : ");
		float bonus = Float.parseFloat(reader.readLine());
		
		// Thread
		
		// Close Object
		reader.close();
		
		System.out.println("\n-------------Your Data-------------");
		System.out.println("\tName : " + name);
		System.out.println("\tSalary : " + salary);
		System.out.println("\tBonus rate : " + bonus);
	}

}
