
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		int i = 1;
		while(!q.isFull()) {
			q.push(i);
			i++;
		}
		System.out.println("Size : " + q.size());
		while(!q.isEmpty()) {
			System.out.print(q.front() + " ");
			q.pop();
		}
		System.out.println();
		System.out.println("Size : " + q.size());
	}

}
class QueueDataStructure{
	protected int[] arr;
	protected int front, rear, size;
	public QueueDataStructure() {
		this.arr = new int[10];
		this.front = this.rear = -1;
		this.size = 0;
	}
}
interface QueueMethods{
	void push(int item);
	void pop();
	int front();
	boolean isEmpty();
	boolean isFull();
	int size();
}
class Queue extends QueueDataStructure implements QueueMethods{
	public void push(int item) {
		if(this.front == - 1 && this.rear == -1) {
			this.front = this.rear = 0;
			arr[this.rear] = item; 
			this.size++;
		}
		else {
			if(!isFull()) {
				this.rear = (this.rear + 1) % 10; 
				arr[this.rear] = item;
				this.size++;
			}
		}
	}
	public void pop() {
		if(!isEmpty()) {
			if(this.front == this.rear)
				this.front = this.rear = -1;
			else {
				this.front = (this.front + 1) % 10;
			}
			this.size--;
		}
	}
	public int front() {
		return arr[this.front];
	}
	public boolean isEmpty() {
		return this.front == -1 && this.rear == -1;
	}
	public boolean isFull() {
		int newRear = this.rear + 1;
		newRear = newRear % 10;
		return newRear == this.front;
	}
	public int size() {
		return this.size;
	}
//	public void display() {
//		for (int i = 0; i < 10; i++)
//			System.out.print(arr[i] + " ");
//		System.out.println();
//		System.out.println("Front : " + this.front);
//		System.out.println("Rear : " + this.rear);
//		System.out.println("Size : " + this.size);
//	}
}