import java.util.*;

class Player {
	String name;
	int matches;
	int jersey_no;
	String country;
	
	Scanner obj = new Scanner(System.in);
	
	void get_data() {
		System.out.print("Enter name: ");
		name = obj.next();
		
		System.out.print("Enter number of matches: ");
		matches = obj.nextInt();
		
		System.out.print("Enter jersey number: ");
		jersey_no = obj.nextInt();
		
		System.out.print("Enter country: ");
		country = obj.next();
	}
	
	void display() {
		System.out.println("Name of player is: " + name);
		System.out.println("Total matches played: " + matches);
		System.out.println("Jersey number is: " + jersey_no);
		System.out.println("Country for which he/she plays is: " + country);
	}
}

class Cricket_player extends Player {
	int total_runs;
	int total_wickets;
	int odis;
	int t20s;
	int tests;
	float strike_rate;
	
	void get_data() {
		super.get_data();
		System.out.print("Enter total runs: ");
		total_runs = obj.nextInt();
		
		System.out.print("Enter total wickets: ");
		total_wickets = obj.nextInt();
		
		System.out.print("Enter ODIs: ");
		odis = obj.nextInt();
		
		System.out.print("Enter T20s: ");
		t20s = obj.nextInt();
		
		System.out.print("Enter tests: ");
		tests = obj.nextInt();
		
		System.out.print("Enter strike rate: ");
		strike_rate = obj.nextFloat();
	}
	
	void display() {
		super.display();
		
		System.out.println("Total runs: " + total_runs);
		System.out.println("Total wickets: " + total_wickets);
		System.out.println("Total ODI played: " + odis);
		System.out.println("Total T20 played: " + t20s);
		System.out.println("Total tests played: " + tests);
		System.out.println("Strike rate: " + strike_rate);
	}
}

class Football_player extends Player {
	int goals;
	String position;
	int penalties;
	
	void get_data() {
		super.get_data();
		System.out.print("Enter total goals: ");
		goals = obj.nextInt();
		
		System.out.print("Enter total penalties: ");
		penalties = obj.nextInt();
		
		System.out.print("Enter position on field: ");
		position = obj.next();
	}
	
	void display() {
		super.display();
		
		System.out.println("Field position: " + position);
		System.out.println("Total goals: " + goals);
		System.out.println("Total penalties: " + penalties);
	}
}

class Hockey_player extends Player {
	int goals;
	int penalty_minutes;
	
	void get_data() {
		super.get_data();
		System.out.print("Enter goals: ");
		goals = obj.nextInt();
		
		System.out.print("Enter total penalty_minutes: ");
		penalty_minutes = obj.nextInt();
	}
	
	void display() {
		super.display();
		
		System.out.println("Total goals: " + goals);
		System.out.println("Total penalty_minutes: " + penalty_minutes);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name: Om Shinde");
		System.out.println("Roll no: 32358");
		System.out.println("Batch: M7");
		System.out.println("\n");
		
		Cricket_player cricket = new Cricket_player();
		System.out.println("<----- Enter cricket player details ----->");
		cricket.get_data();
		System.out.println("\n");
		cricket.display();
		System.out.println("\n");
		
		Football_player football = new Football_player();
		System.out.println("<----- Enter football player details ----->");
		football.get_data();
		System.out.println("\n");
		football.display();
		System.out.println("\n");
		
		Hockey_player hockey = new Hockey_player();
		System.out.println("<----- Enter hockey player details ----->");
		hockey.get_data();
		System.out.println("\n");
		hockey.display();
	}
}
