import java.util.*;
class Matrix{
	
	private int[][] arr;
	private int row, col;
	
	public Matrix(int row, int col) {
		arr = new int[row][col];
	}
	
	public Matrix(int[][] arr) {
		this.arr = arr;
		this.row = this.arr.length;
		this.col = row > 1 ? this.arr[0].length : 0;
	}
	
	public Matrix add(Matrix m) {
		int[][] ans = new int[this.row][this.col];
		for (int i = 0; i < this.row; i++) {
			for (int j = 0; j < this.col; j++) {
				ans[i][j] = this.arr[i][j] + m.arr[i][j];
			}
		}
		Matrix ansMat = new Matrix(ans);
		return ansMat;
	}
	
	int getRow() {
		return row;
	}
	
	int getCol() {
		return col;
	}
	
	void display() {
		for (int i = 0; i < this.row; i++) {
			for (int j = 0; j < this.col; j++) 
				System.out.print(this.arr[i][j] + " ");
			System.out.println();
		}
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sin = new Scanner(System.in);
		int row, col;
		System.out.print("Enter the Dimentions of the Matrix\nRows : ");
		row = sin.nextInt();
		System.out.print("Colums : ");
		col = sin.nextInt();
		
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		
		System.out.println("Enter Values of 1st Matrix : ");
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr1[i][j] = sin.nextInt();
			}
		}
		
		System.out.println("Enter Values of 2nd Matrix : ");
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr2[i][j] = sin.nextInt();
			}
		}
		
		Matrix m1 = new Matrix(arr1);
		Matrix m2 = new Matrix(arr2);
		Matrix m3 = m1.add(m2);
		
		System.out.println("Resultant Matrix is : ");
		m3.display();
		sin.close();
	}
}
