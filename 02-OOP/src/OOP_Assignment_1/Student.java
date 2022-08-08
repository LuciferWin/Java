package OOP_Assignment_1;

public class Student {
	private int id, mark;
	private String name;
	
	public Student() {
		super();
	}

	public Student(int id, int mark, String name) {
		super();
		this.id = id;
		this.mark = mark;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void display() {
		System.out.println("\t" + getId() + "\t" + getName() + "\t\t" + getMark());
	}
}
