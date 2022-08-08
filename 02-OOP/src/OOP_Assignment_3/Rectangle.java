package OOP_Assignment_3;

public class Rectangle extends Shape{
	int length, width;
	
	@Override
	double Area() {
		double A = this.length * this.width;
		return A;
	}
	
	void displayArea() {
		System.out.println("Area of Rectangle : " +  Area());
	}
	
	public Rectangle(String color, int width, int length) {
		this.length = length;
		this.width = width;
		setColor(color);
	}
}
