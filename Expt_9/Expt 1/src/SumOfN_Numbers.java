import java.util.*;
public class SumOfN_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem Statement iii) Sum and Avg of 1st N Numbers
		Scanner sin = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		double n = sin.nextDouble();
		System.out.print("Sum till Nth number : " + (n * (n + 1)) / 2 + "\n");
		System.out.print("Avg of this sum : " + (n + 1) / 2);
		sin.close();
	}
}
