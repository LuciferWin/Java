package Day10_1;

public class Demo {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Lucifer", "Head Officer");
		t1.showInfo();
		
		Person p1 = new Person("Denny");
		p1.showInfo();
		
		Person p2 = new Teacher("Jerry", "Tutor");
		p2.showInfo(); // Call Teacher's  showInfo Method
	}
}
