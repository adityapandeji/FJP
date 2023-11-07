import java.util.*;
public class Factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem Statement i) To find fact of a number
		double ans = 1;
		Scanner sin = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sin.nextInt();
		for(double i = 2; i <= n; i++) {
			ans *= i;
		}
		System.out.println("Factorial of given number is : " + ans);
		sin.close();
	}
}
