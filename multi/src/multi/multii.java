package multi;
class Myclass extends Thread
{
	int value;
	Myclass()
	{
		
	}
	Myclass(int x)
	{
		value = x;
	}
	public void run()
	{
		while(value<10)
		{
			System.out.println(value + " "+Thread.currentThread().getName());
			value = value+2;
		}
	}
}

public class multii  {
	
	public static void main(String args[])
	{
		Myclass obj = new Myclass(0);
		Thread t = new Thread(obj,"ONE");
		Myclass obj2 = new Myclass(1);
		Thread t2 = new Thread(obj2,"TWO");
		t.start();
		t2.start();
	}
}