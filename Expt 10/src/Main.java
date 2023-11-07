import java.io.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sin = new Scanner(System.in);
		try {
			File f1 = new File("Demo1.txt");
			if(!f1.createNewFile()) {
				f1.delete();
				f1.createNewFile();
			}
			FileWriter fout = new FileWriter(f1);
			
			do {
				System.out.print("Do you want add data to file? (y / n) ");
				char choice = sin.next().charAt(0);
				sin.nextLine();
				if(choice == 'y' || choice == 'Y') {
					System.out.print("Enter data here : ");
					String s = sin.nextLine();
					fout.write(s + "\n");
				}
				else
					break;
			}while(true);
			
			fout.close();
			
			Scanner fin = new Scanner(f1);
			File f2 = new File("Demo2.txt");
			if(!f2.createNewFile()) {
				f2.delete();
				f2.createNewFile();
			}
			fout = new FileWriter(f2);
			while(fin.hasNextLine()) {
				String data = fin.nextLine();
				fout.write(data+"\n");
			}
			fin.close();
			fout.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		sin.close();
	}
}