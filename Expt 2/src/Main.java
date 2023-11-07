import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sin = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Which Operation you want to Perform?\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Factorial\n6. Exit");
			System.out.print("Enter your choice here: ");
			while(!sin.hasNextInt()) //to discard all wrong input **not necessary** 
				sin.next();
			choice = sin.nextInt();
			switch(choice) {
				case 1:	{
						System.out.print("Enter 2 numbers to be added: ");
						double a, b;
						if(sin.hasNextDouble())
							a = sin.nextDouble();
						else {
							System.out.println("Wrong input. Try Again!");
							break;
						}
						if(sin.hasNextDouble())
							b = sin.nextDouble();
						else {
							System.out.println("Wrong input. Try Again!");
							break;
						}
						System.out.println("Addition : " + (a + b));
						break;
					}
				case 2:{
					System.out.print("Enter 2 numbers to be Subtracted (1st - 2nd): ");
					double a, b;
					if(sin.hasNextDouble())
						a = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						break;
					}
					if(sin.hasNextDouble())
						b = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						break;
					}
					System.out.println("Subtraction : " + (a - b));
					break;
				}
				case 3:{
					System.out.print("Enter 2 numbers to be multiply: ");
					double a, b;
					if(sin.hasNextDouble())
						a = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						break;
					}
					if(sin.hasNextDouble())
						b = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						break;
					}
					System.out.println("Multiplication : " + (a * b));
					break;
				}
				case 4:{
					System.out.print("Enter 2 numbers to be divide (1st / 2nd): ");
					double a, b;
					if(sin.hasNextDouble())
						a = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						break;
					}
					if(sin.hasNextDouble())
						b = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						break;
					}
					if(b == 0) {
						System.out.println("Denominator cannot be zero. Try Again!");
						break;
					}
					System.out.println("Division : " + (a / b));
					break;
				}
				case 5:{
					System.out.print("Enter numbers whose Factorial you want to find: ");
					double a, b;
					if(sin.hasNextDouble())
						a = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						break;
					}
					b = 1;
					for (int i = 2; i <= a; i++)
						b *= i;
					System.out.println("Factorial : " + b);
					break;
				}
			}
		} while(choice != 6);
		sin.close();
		System.out.println("Thank You!");
	}
}
