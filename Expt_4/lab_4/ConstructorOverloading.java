import java.util.*;

class Record{
	int Roll_no;
	String Name;
	Record (){
		System.out.println("\nThis is from Default Constructor.");
	}
	Record(int roll_no, String name){
		this();
		this.Roll_no = roll_no;
		this.Name = name;
		System.out.println("Hello " + Roll_no + "_" + Name + ". This from parametrised constructor.");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		System.out.println("Name: Om Shinde");
		System.out.println("Roll no: 32358");
		System.out.println("Batch: M7");
		// TODO Auto-generated method stub
		Record obj = new Record(32358, "Om");
		
	}

}
