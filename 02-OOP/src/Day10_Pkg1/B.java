package Day10_Pkg1;

public class B {
	void test() {
		var obj = new A();
		obj.number = 200; // Within same pkg
		
		obj.name = "Lucifer";
		obj.age = 20;
	}
}

class C extends A {
	// int number;
	// protected String name;
//	public int age
	void test() {
		System.out.println(number);
		System.out.println(name);
		System.out.println(age);
	}
}
