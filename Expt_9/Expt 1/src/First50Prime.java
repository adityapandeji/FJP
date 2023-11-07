
public class First50Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem Statement : ii) Print first 50 prime numbers
		boolean[] arr = new boolean[1000];
		arr[0] = arr[1] = true;
		for (int i = 2; i < 1000; i++) {
			if(!arr[i]) {
				for (int j = 2 * i; j < 1000; j += i) {
					arr[j] = true;
				}
			}
		}
		int k = 0;
		int i = 0;
		while(i < 1000 && k < 50) {
			if(!arr[i]) {
				System.out.print(i + " ");
				k++;
			}
			i++;
		}
	}

}
