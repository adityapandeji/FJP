import java.util.Scanner;
class Player{
	private String name, game, game_type, gender;
	private int age;
	private Scanner sin;
	Player(){
		sin = new Scanner(System.in);
	}
	public void get_data() {
		System.out.print("Enter name of the player : ");
		name = sin.next();
		System.out.print("Enter age of the Player : ");
		age = sin.nextInt();
		System.out.print("Enter game which he/she plays : ");
		game = sin.next();
		System.out.print("Enter game type of the game : ");
		game_type = sin.next();
		System.out.print("Enter gender of the player : ");
		gender = sin.next();
		sin.reset();
	}
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
		System.out.println("Game : " + game);
		System.out.println("Game Type : " + game_type);
	}
}
class CricketPlayer extends Player{
	private String position;
	private int total_runs;
	private Scanner sin;
	CricketPlayer(){
		sin = new Scanner(System.in);
	}
	public void get_data() {
		super.get_data();
		System.out.print("Enter total runs player scored : ");
		total_runs = sin.nextInt();	
		sin.nextLine();
		System.out.print("Enter position of the player : ");
		position = sin.nextLine();
	}
	public void display() {
		super.display();
		System.out.println("Total Runs : " + total_runs);
		System.out.println("Position : " + position);
	}
}
class FootballPlayer extends Player{
	private String position;
	private int total_goals;
	private Scanner sin;
	FootballPlayer(){
		sin = new Scanner(System.in);
	}
	public void get_data() {
		super.get_data();
		System.out.print("Enter total goals player scored : ");
		total_goals = sin.nextInt();
		sin.nextLine();
		System.out.print("Enter position of the player : ");
		position = sin.nextLine();
	}
	public void display() {
		super.display();
		System.out.println("Total Goals : " + total_goals);
		System.out.println("Position : " + position);
	}
}
class HockeyPlayer extends Player{
	private String position;
	private int total_goals;
	private Scanner sin;
	HockeyPlayer(){
		sin = new Scanner(System.in);
	}
	public void get_data() {
		super.get_data();
		System.out.print("Enter total goals player scored : ");
		total_goals = sin.nextInt();
		sin.nextLine();
		System.out.print("Enter position of the player : ");
		position = sin.next();
	}
	public void display() {
		super.display();
		System.out.println("Total Goals : " + total_goals);
		System.out.println("Position : " + position);
	}
}
public class Main {

	public static void main(String[] args) {
		Player c1 = new HockeyPlayer();
		c1.get_data();
		c1.display();
	}

}