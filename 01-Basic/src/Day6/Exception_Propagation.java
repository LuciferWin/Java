package Day6;

public class Exception_Propagation {

	public static void main(String[] args) {
		
		test3(); // 4

	}

	private static void test3() {
		
		test2(); // 3
		
	}

	private static void test2() {
		
		test1(); // 2
		
	}

	private static void test1() {
		
		System.out.println(100/0); // 1
		
	}


}
