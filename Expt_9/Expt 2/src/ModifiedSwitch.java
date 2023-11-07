import java.util.Scanner;
public class ModifiedSwitch {

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
			double result = switch(choice) {
				case 1 ->	{
						System.out.print("Enter 2 numbers to be added: ");
						double a, b;
						if(sin.hasNextDouble())
							a = sin.nextDouble();
						else {
							System.out.println("Wrong input. Try Again!");
							throw new IllegalArgumentException("Wrong Input!");
						}
						if(sin.hasNextDouble())
							b = sin.nextDouble();
						else {
							System.out.println("Wrong input. Try Again!");
							throw new IllegalArgumentException("Wrong Input!");
						}
//						System.out.println("Addition : " + (a + b));
						yield a + b;
					}
				case 2 -> {
					System.out.print("Enter 2 numbers to be Subtracted (1st - 2nd): ");
					double a, b;
					if(sin.hasNextDouble())
						a = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						throw new IllegalArgumentException("Wrong Input!");
					}
					if(sin.hasNextDouble())
						b = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						throw new IllegalArgumentException("Wrong Input!");
					}
//					System.out.println("Subtraction : " + (a - b));
					yield a - b;
				}
				case 3 -> {
					System.out.print("Enter 2 numbers to be multiply: ");
					double a, b;
					if(sin.hasNextDouble())
						a = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						throw new IllegalArgumentException("Wrong Input!");
					}
					if(sin.hasNextDouble())
						b = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						throw new IllegalArgumentException("Wrong Input!");
					}
//					System.out.println("Multiplication : " + (a * b));
					yield a * b;
				}
				case 4 -> {
					System.out.print("Enter 2 numbers to be divide (1st / 2nd): ");
					double a, b;
					if(sin.hasNextDouble())
						a = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						throw new IllegalArgumentException("Wrong Input!");
					}
					if(sin.hasNextDouble())
						b = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						throw new IllegalArgumentException("Wrong Input!");
					}
					if(b == 0) {
						System.out.println("Denominator cannot be zero. Try Again!");
						throw new IllegalArgumentException("Wrong Input!");
					}
//					System.out.println("Division : " + (a / b));
					yield a / b;
				}
				case 5 -> {
					System.out.print("Enter numbers whose Factorial you want to find: ");
					double a, b;
					if(sin.hasNextDouble())
						a = sin.nextDouble();
					else {
						System.out.println("Wrong input. Try Again!");
						throw new IllegalArgumentException("Wrong Input!");
					}
					b = 1;
					for (int i = 2; i <= a; i++)
						b *= i;
//					System.out.println("Factorial : " + b);
					yield b;
				}
				default -> Double.MAX_VALUE;
			};
			if(result != Double.MAX_VALUE)
				System.out.println("Result : " + result);
		} while(choice != 6);
		sin.close();
		System.out.println("Thank You!");
	}
}
