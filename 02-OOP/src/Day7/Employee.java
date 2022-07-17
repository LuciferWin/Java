package Day7;

public class Employee {
	
	static int noOfEmployee = 3; // static field
	static int nextId = 1; // static field
	final int empId; // final field
	String name; // instance field
	int salary; // instance field
	
	static final float BONUS = 2.5f;
	
	public Employee() throws AppException {
		if(nextId > noOfEmployee)
			throw new AppException("Sorry! Limited number has been reached.");
		empId = nextId;
		nextId++;
	}
	
	public void initData(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void changeData(String new_name, int new_salary) {
		if(! name.equalsIgnoreCase(new_name))
			this.name = new_name;
		if( salary != new_salary)
			this.salary = new_salary;
	}
	
	public void showData() {
		System.out.println(empId + "\t" + name + "\t" + salary + " ks");
	}
	
	public static void changeNoOfEmplotee(int no) {
		noOfEmployee = no;
//		this.name = ""; //can't use this
//		salary = 1000; //can't access instance data
	}
	
	public void viewInformation() {
		System.out.println("Total emp : " + noOfEmployee);//can access static
		System.out.println("-----Current Employee Info-----");
		this.showData();
		System.out.println("Next Employee's id : " + nextId );
	}
	
}
