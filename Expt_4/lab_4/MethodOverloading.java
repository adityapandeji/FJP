import java.util.*;
class Operation {
	// Different type of variables
	void sum (int a, int b) {
		System.out.println(a+b);
	}
	
	void sum(int a, double b) {
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	void sum(double a, int b) {
		System.out.println(a+b);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation obj = new Operation();
		int x,y,z;
		double a;
		System.out.println("Name: Om Shinde");
		System.out.println("Roll no: 32358");
		System.out.println("Batch: M7");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer x: ");
		x=input.nextInt();
		System.out.println("Enter integer y: ");
		y=input.nextInt();
		System.out.println("Enter integer z: ");
		z=input.nextInt();
		System.out.println("Enter decimal a: ");
		a=input.nextDouble();
		
		System.out.println("\n");
		System.out.println("Sum of x & y: ");
		obj.sum(x, y);
		System.out.println("Sum of x & a: ");
		obj.sum(x, a);
		System.out.println("Sum of x, y & z: ");
		obj.sum(x, y, z);
		System.out.println("Sum of a & z: ");
		obj.sum(a, z);
	}

}
