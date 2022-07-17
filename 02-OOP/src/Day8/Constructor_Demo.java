package Day8;

class Person {
	String name;
	int age;
	boolean single;
	
//	Default Constructor
	public Person() {
		name = "unknown";
		age = 100;
		single = true;
	}
	
	// Parameterized constructor
	public Person(String name, int age, boolean status) {
		this.name = name;
		this.age = age;
		this.single = status;
	}
	
	public void display() {
		System.out.println("\nName : " + name);
		System.out.println("Age : " + age);
		System.out.println("Is single : " + ((single) ? "yes" : "no"));
	}
}

public class Constructor_Demo {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.display();
		
		Person p2 = new Person();
		p2.display();
		
		Person p3 = new Person("Lucifer", 22, false);
		p3.display();
		
		var p4 = new Person("May", 23, false);
		p4.display();
	}
}