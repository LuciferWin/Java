package Day10;

public class PrivateAccessMidifier {
	private int number = 100;
	
	void test() {
		System.out.println(number);
	}
}

class B {
	void test() {
		var obj = new PrivateAccessMidifier();
//		obj.number = 200; // Error (Private)
		System.out.println(obj);
	}
}