import java.util.Scanner;

interface methods {
	int size();

	void enqueue(int x);

	int dequeue();

	boolean isfull();

	boolean isempty();

	void display();
}

class Queue {
	public int arr[];
	public int front;
	public int rear;
	public int capacity;
	public int count;

	Queue(int x) {
		arr = new int[x];
		front = rear = -1;
		capacity = x;
		count = 0;
	}
}

class Q_implementation extends Queue implements methods {
	Scanner sc = new Scanner(System.in);

	Q_implementation(int y) {
		super(y);
	}

	public int size() {
		return count;
	}

	public boolean isfull() {
		return (size() == capacity);
	}

	public boolean isempty() {
		return (size() == 0);
	}

	public void enqueue(int x) {
		if (!isfull()) {
			if (front == -1) {
				front = 0;
			}
			rear++;
			count++;
			arr[rear] = x;
		} else {
			System.out.println("Queue is full");
		}
		display();
	}

	public int dequeue() {
		if (!isempty()) {
			int x = arr[front];
			if (front == rear) {
				front = rear = -1;
			}
			front++;
			count--;
			return x;
		} else {
			System.out.println("Queue is empty");
			return -1;
		}
	}

	public void display() {
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

public class Exp_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name: Om Shinde \nRoll no: 32358 \nBatch: M7");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Size of Queue:");
		int x = s.nextInt();
		Q_implementation q = new Q_implementation(x);
		int ch;
		do {
			System.out.println("Enter the choice\n" + "1.Enqueue 2.Dequeue");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the data:");
				int y = s.nextInt();
				q.enqueue(y);
				break;
			case 2:
				System.out.println("The Dequeued number is:" + q.dequeue());
				q.display();
				break;
			default:
				System.out.println("Inavlid Choice");
				break;
			}
			System.out.println("Eneter 1 to continue 0 to stop.");
			ch = s.nextInt();
		} while (ch != 0);
	}

}
