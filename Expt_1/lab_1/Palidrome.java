import java.util.Scanner;
public class Palidrome {

	public static void main(String[] args) {
		long num;
		long temp;
		long result=0;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a number to check for palidrome: ");
		num = obj.nextInt();
		
		long num2 = num;
		
		while(num>0) {
			temp = num%10;
			result = result*10 + temp;
			num /= 10;
		}
		if (result == num2) {
			System.out.println("It is a palidrome.");
		} else {
			System.out.println("It is NOT a palidrome.");
		}

	}

}
