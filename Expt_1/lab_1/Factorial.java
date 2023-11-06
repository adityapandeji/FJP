import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int num;
		long fact = 1;
		
		System.out.println("Roll No: 32358");
		System.out.println("Name: Om Shinde");
		System.out.println("Batch: M7\n");
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter integer: ");
		num = obj.nextInt();
		
		for (int i=1; i<=num; i++) {
			fact *= i;
		}
		System.out.println("Factorial is: " + fact);
	}
}
