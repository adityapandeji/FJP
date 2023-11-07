import java.util.*;
class Sort1{
	private int n;
	private int[] arr;
	
	public Sort1() {
		Scanner sin = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to sort: ");
		n = sin.nextInt();
		arr = new int[n];
		System.out.print("\nEnter the elements: ");
		for(int i = 0; i < n; i++){
			arr[i] = sin.nextInt();
		}
	}
	
	public void ascendingSort() {
		for(int i = 0; i < n-1; i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public void descendingSort()
	{
		this.ascendingSort();
		for (int i = 0; i < this.arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
		}
	}
	
	public void display(){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
class Sort2{
	private int n;
	private Integer[] arr;
	
	public Sort2(){
		Scanner sin = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to sort : ");
		n = sin.nextInt();
		arr = new Integer[n];
		System.out.print("\nEnter the elements: ");
		for(int i=0;i<n;i++){
			arr[i] = sin.nextInt();
		}
	}
	
	public void ascending(){
		Arrays.sort(arr);
	}
	
	public void descending(){
		Arrays.sort(arr,Collections.reverseOrder());
	}
	
	public void display(){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
public class IntegerSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort1 s1 = new Sort1();
		s1.ascendingSort();
		System.out.print("Ascending Order : ");
		s1.display();
		s1.descendingSort();
		System.out.print("Descending Order : ");
		s1.display();		
		
		Sort2 s2 = new Sort2();
		s2.ascending();
		System.out.print("Ascending Order : ");
		s2.display();
		s2.descending();
		System.out.print("Descending Order : ");
		s2.display();
	}

}
