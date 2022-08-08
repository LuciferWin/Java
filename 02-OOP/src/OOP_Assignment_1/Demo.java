package OOP_Assignment_1;

import java.util.Scanner;

public class Demo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id, mark;
		String name;
		
		Student[] students = new Student[4];
		
		for(var i = 0 ; i < 4 ; i++) {
			students[i] = new Student();
			System.out.println("Enter Student " + (i + 1) + " Infromation.");
			System.out.print("Enter ID : ");
			id = sc.nextInt();
			System.out.print("Enter Name (Don't use space) : ");
			name = sc.next();
			System.out.print("Enter Total Mark : ");
			mark = sc.nextInt();
			students[i].setId(id);
			students[i].setName(name);
			students[i].setMark(mark);
		}
		
		System.out.println("-------------- Students Information --------------");
		System.out.println("\tID\tName\t\tTotal Mark");
		for(var i  = 0 ; i < 4 ; i++) {
			students[i].display();
		}
		
		System.out.println("\n\n");
		
		System.out.print("Enter Student ID to Search Info : ");
		int sid = sc.nextInt();
		int svj = 0;
		for(var i = 0 ; i < 4 ; i++) {
			if(sid == students[i].getId()) {
				System.out.println("\tID\tName\t\tTotal Mark");
				students[i].display();
				break;
			}
			
			if(sid != students[i].getMark()) {
				svj++;
			}
		}
		
		if(svj == 4) {
			System.err.println("Student ID : " + sid + " is not Found!");
		}
		
		int max, avg;
		
		max = students[1].getMark();
		
		for(var i = 1 ; i < 4 ; i++) {
			if(students[i].getMark() > max) {
				max = students[i].getMark();
			}
		}
	
		for(var i = 0 ; i < 4 ; i++) {
			if(max == students[i].getMark()) {
				System.out.println("Maximum Mark : " +  students[i].getName() + " = " + students[i].getMark() + " marks");
			}
		}
		
		int total = 0;
		
		for(var i = 0 ; i < 4 ; i++) {
			total += students[i].getMark();
		}
		
		avg = total / 4 ;
		
		System.out.println("Average Mark Over All The Students : " +  avg + " marks");
		
		sc.close();
	}
}
