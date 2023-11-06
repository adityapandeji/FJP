import java.util.Scanner;
public class SumAvgOfNnumbers {

	public static void main(String[] args) {
		float n;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Roll No: 32358");
		System.out.println("Name: Om Shinde");
		System.out.println("Batch: M7\n");
		
		System.out.println("Enter number: ");
		n = obj.nextInt();
		
		int sum=0;
		float avg;
		
		for (int i=1; i<=n; i++) {
			sum = sum+i;
		}
		avg = sum/n;
		
		System.out.println("The sum of first " + n + " numbers is: " + sum);
		System.out.println("The avg of first " + n + " numbers is: " + avg);

	}

}
