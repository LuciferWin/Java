package Day1;

public class JavaMethod {

	int num1 = 20; // Instance Field
	static int num2 = 30; // Static Field
	
	public static void main(String[] args) {
		JavaMethod obj = new JavaMethod();
		obj.instance_method();
		static_method();
	}
	
	static void static_method() {
		//JavaMethod oj = new JavaMethod();
		//System.out.println("num1 = " + num1); // Can't Access Instance Data
		System.out.println("num2 = " + num2);
		//instance_method();
		
	}

	void instance_method() {
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		static_method();
	}
	
}
