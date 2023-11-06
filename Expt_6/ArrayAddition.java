import java.util.Scanner;

class Matrix {
	int array[][] = new int[3][3];
	
	int row;
	int col;
	
	Scanner obj = new Scanner(System.in);
	
	Matrix() {
		row=3;
		col=3;
	}
	void get_data() {
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print("array[" + i + "]" + "[" + j + "]:");
				array[i][j] = obj.nextInt();
			}
		}
	}
	
	void display() {
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
	void additon(Matrix m, Matrix mi) {
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				mi.array[i][j] = array[i][j] + m.array[i][j];
			}
		}
	}
}
public class ArrayAddition {

	public static void main(String[] args) {
		System.out.println("Name: Om Shinde\nRoll no: 32358\nBatch: M7");
		Matrix m1 = new Matrix();
		System.out.println("Enter m1 elements: ");
		m1.get_data();
		System.out.print("\n");
		
		Matrix m2 = new Matrix();
		System.out.println("Enter m2 elements: ");
		m2.get_data();
		System.out.print("\n");
		
		System.out.println("Matrix m1 elements are: ");
		m1.display();
		
		System.out.println("Matrix m2 elements are: ");
		m2.display();
		
		Matrix m3 = new Matrix();
		
		m1.additon(m2, m3);
		
		System.out.println("\nMatrix m3 elements after adding m1 and m2 are: ");
		m3.display();
	}

}
