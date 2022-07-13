package Assignments;

import java.util.Scanner;

public class Exception_Assignment_3 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)){
			System.out.print("Enter Student's Mark : ");
			int mark = sc.nextInt();
			StudentMark(mark);
		} catch (StudentMarkException e) {
			System.err.print(e.getMessage());
		}
		
	}

	private static void StudentMark(int mark) throws StudentMarkException {
		
		if(mark < 0 || mark > 100) {
			throw new StudentMarkException("Student's mark must be between 0 and 100.");
		}else {
			System.out.println("Student's Mark : " + mark);
		}
		
	}
}

class StudentMarkException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	public StudentMarkException (String msg) {
		super(msg);
	}
	
}

