package Day8;

public class Calling_Super_Constructor {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Yan Myoe", "CEO");
		System.out.println(t1);
//		new Animal();
	}
}

class Employee {
	private String name;
	
	public Employee() {
		this.setName("unknown");
	}
	
	public Employee(String name) {
		this.setName(name);
		System.out.println("This is emp constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Teacher extends Employee {
	private String position;
	public Teacher(String na, String pos) {
		super(na);
//		System.out.println(na);
		this.position = pos;
		System.out.println(position);
		System.out.println(getName());
		System.out.println("This is teacher constructor");
	}
}

//class Animal {
//	private Animal() {
//		
//	}
//}
//
//class Dog extends Animal {
//	
//}