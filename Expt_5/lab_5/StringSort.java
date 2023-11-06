import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Methods_of_String {

	void arr_sort_asc_inbuilt(String a[]) {
		System.out.println("\nArray is sorted in ascending order (using inbuilt method) : ");
		Arrays.sort(a);
		for (String x : a) {
			System.out.print(x + ", ");
		}
	}

	void arr_sort_desc_inbuilt(String a[]) {
		System.out.println();
		System.out.println("\nArray is sorted in descending order (using inbuilt method) : ");
		Arrays.sort(a, Collections.reverseOrder());

		for (String x : a) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}

	void arr_sort_asc_user_defined(String a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		display_array(a);
	}

	void display_array(String a[]) {
		System.out.println("\nArray is sorted in ascending order (using user defined method) : ");
		for (String x : a) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}
}

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name: Om Shinde");
		System.out.println("Roll No: 32358");
		System.out.println("Batch: M7\n");
		int size;
		System.out.print("\nEnter the size for the string array: ");
		Scanner sc1 = new Scanner(System.in);
		size = sc1.nextInt();
		System.out.println();
		String a[] = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter the " + (i + 1) + "th element of the array : ");
			Scanner sc2 = new Scanner(System.in);
			a[i] = sc2.next();
		}

		Methods_of_String obj = new Methods_of_String();
		obj.arr_sort_asc_inbuilt(a);
		obj.arr_sort_desc_inbuilt(a);
		obj.arr_sort_asc_user_defined(a);
	}
}
