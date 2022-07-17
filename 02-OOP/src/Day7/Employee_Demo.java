package Day7;

public class Employee_Demo {

	public static void main(String[] args) {
		
		try {
			// create object
			Employee emp1 = new Employee();
			Employee emp2 = new Employee();
			Employee emp3 = new Employee();
			
			//initialize data
			emp1.initData("John", 500000);
			emp2.initData("Lucifer", 2000000);
			emp3.initData("Ana", 800000);
			
			// show info
			System.out.println("ID\tName\tSalary");
			emp1.showData();
			emp2.showData();
			emp3.showData();
			
			Employee.changeNoOfEmplotee(4);
			//create 4th employee object
			var emp4 = new Employee(); // exception
			emp4.initData("Kane", 400000);
			emp4.showData();
			emp4.viewInformation();
			
		} catch (AppException e) {
			System.err.println(e.getMessage());
		}
		
//		display(2.5f);
		
	}
	
//	static void display(String a) {
//		System.out.println("Testing1");
//	}
//	static void display(int a) {
//		System.out.println("Testing2");
//	}
//	static void display(float a) {
//		System.out.println("Testing3");
//	}
	
	
}
