import java.util.*;
class Rectangle{
	double lenght, width, area;
	String color;
	Scanner sin;
	public Rectangle() {
		sin = new Scanner(System.in);
	}
	void get_length() {
		System.out.print("Enter the Length of the Rectangle: ");
		this.lenght = sin.nextDouble();
	}
	void get_width() {
		System.out.print("Enter the Width of the Rectangle: ");
		this.width = sin.nextDouble();
	}
	void get_color() {
		System.out.print("Enter the Color of the Rectangle: ");
		this.color = sin.next();
	}
	double find_area() {
		this.area = this.lenght * this.width;
		return area;
	}
	public void finalize() {
		sin.close();
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sin = new Scanner(System.in);
		Rectangle R1 = new Rectangle();
		R1.get_length();
		R1.get_width();
		R1.get_color();
		
		Rectangle R2 = new Rectangle();
		R2.get_length();
		R2.get_width();
		R2.get_color();
		
		sin.close();
		
		if(R1.find_area() == R2.find_area() && R1.color.equalsIgnoreCase(R2.color)) // R1.color == R2.color doesn't work
			System.out.println("This are equal Rectangles");
		else
			System.out.println("There are not equal Rectangles");
	}
	
}
