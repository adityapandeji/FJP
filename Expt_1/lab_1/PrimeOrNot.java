import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		int num;
		boolean flag = false;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number to check prime ro not: ");
		num = obj.nextInt();
		
		
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
		    flag = true;
		    break;
		    }
		}
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
		    System.out.println(num + " is not a prime number.");
	}

}
