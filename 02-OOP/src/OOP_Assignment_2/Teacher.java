package OOP_Assignment_2;

import java.util.Scanner;

public class Teacher extends Person{
	private String position, department, salary;
	
	public Teacher() {
		super();
	}
	
	public Teacher(String position, String department, String salary) {
		super();
		this.position = position;
		this.department = department;
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	String promote(String positon, String salary, Scanner sc) {
		System.out.print("Enter New Position : ");
		position = sc.next();
		System.out.print("Enter New Salary : ");
		salary = sc.next();
		this.position = positon;
		this.salary = salary;
		return (position + salary);
	}

	String transfer(String department, Scanner sc) {
		System.out.print("Enter New Department : ");
		department = sc.next();
		this.department = department;
		return department;
	}
	
	void showTeacherInfo() {
		super.showInfo();
		System.out.println("----------------------------");
		System.out.println("Positon\tDepartment\tSalary");
		System.out.println(getPosition() + "\t" + getDepartment() + "\t" + getSalary());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		sc.close();
	}
}
