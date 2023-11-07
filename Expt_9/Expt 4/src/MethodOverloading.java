import java.util.*;
//Method Overloading of Functions which differ in no of args 
class MethodOverloading1{
	int add(int a, int b) {
		System.out.println("Function call to this Function (Func 1)");
		return a + b;
	}
	int add(int a, int b, int c) {
		System.out.println("Function call to this Function (Func 2)");
		return a + b + c;
	}
}

//Method Overloading of Functions which differ in Data Types of args
class MethodOverloading2{
	int add(int a, int b) {
		System.out.println("Function call to this Function (Func 3)");
		return a + b;
	}
	double add(double a, double b) {
		System.out.println("Function call to this Function (Func 4)");
		return a + b;
	}
}

//Method Overloading of Functions which differ in sequence of args
class MethodOverloading3{
	void print(int a, double b, String str) {
		System.out.println("Function call to this Function (Func 5)");
		System.out.println("int: " + a + " double: " + b + " string: " + str);
	}
	void print(double b, String str, int a) {
		System.out.println("Function call to this Function (Func 6)");
		System.out.println("double: " + b + " string: " + str + " int: " + a);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sin = new Scanner(System.in);
		MethodOverloading1 obj1 = new MethodOverloading1();
		System.out.print("Enter 2 Integers: ");
		int a = sin.nextInt();
		int b = sin.nextInt();
		System.out.println("Result : " + obj1.add(a, b) + "\n");
		System.out.print("Enter 3 Integers: ");
		a = sin.nextInt();
		b = sin.nextInt();
		int c = sin.nextInt();
		System.out.println("Result : " + obj1.add(a, b, c) + "\n");
		
		MethodOverloading2 obj2 = new MethodOverloading2();
		System.out.print("Enter 2 Integers: ");
		a = sin.nextInt();
		b = sin.nextInt();
		System.out.println("Result : " + obj2.add(a, b) + "\n");
		System.out.print("Enter 2 Doubles: ");
		double d = sin.nextDouble();
		double e = sin.nextDouble();
		System.out.println("Result : " + obj2.add(d, e) + "\n");
		
		MethodOverloading3 obj3 = new MethodOverloading3();
		System.out.print("Enter an Integer, a Double and a String: ");
		a = sin.nextInt();
		d = sin.nextDouble();
		String str = sin.next();
		obj3.print(a, d, str);
		System.out.println();
		obj3.print(d, str, a);
		sin.close();
	}

}
