package Day10_Pkg2;

import Day10_Pkg1.A;

public class D {
	void test() {
		var obj = new A();
//		obj.number = 300; // Different Package Can't Access Default Access Modifier
		System.out.println(obj);
//		obj.name = "John"; // Non-subclass
	}
}
