package Day10;

public class Method_Overriding {
	public static void main(String[] args) {
		var cat = new Cat();
		cat.show(); // Super 's Method
		cat.sound(); // Super's Method
		cat.display(); // Child's Method
		
		System.out.println("-------------------");
		
		Animal ani = new Animal();
		ani.sound();
		
		System.out.println("-------------------");
		
		ani = new Cat();
		ani.sound();
		
		System.out.println("-------------------");
		
		Cat cat1 = new Cat();
		cat1.display();
		cat1.display("Shwe Pyaung");
	}
}

class Animal {
	void show() {
		System.out.println("This is show method");
	}
	
	void sound() {
		System.out.println("Some sound");
	}
}

class Cat extends Animal {
	void display() {
		System.out.println("Display 1");
	}
	
	void display(String name) {
		System.out.println("Display 2");
	}
	
	@Override // Better to use
	void sound() { // Overriding Method from line 17
		System.out.println("Myaung");
	}
}