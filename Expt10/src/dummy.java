import java.io.*;
import java.util.*;

public class dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj= new File ("Apple.txt");
		Scanner scan= new Scanner(System.in);
		try {
			if (obj.createNewFile())System.out.println("created"+obj.getName());
			else {System.out.println("already exists");}
		}
		catch (IOException e) {e.printStackTrace();}
		try {
			FileWriter writte = new FileWriter("Apple.txt");
			 final String s;
			 s=scan.next();
			
			writte.write(s);writte.close();
			
		}
		catch (IOException e) {e.printStackTrace();}
		try {
		Scanner reader =new Scanner(obj);
		String Data =reader.nextLine();
		System.out.println(Data);
		reader.close();}
		catch (IOException e) {e.printStackTrace();}
		
		  try {
	            FileInputStream in = null;
	            FileOutputStream out = null;

	            try {
	                in = new FileInputStream("Apple.txt");
	                out = new FileOutputStream("Apple1.txt");

	                int n;
	                while ((n = in.read()) != -1) {
	                	// System.out.println(n);
	                    out.write(n);
	                }
	            } finally {
	                if (out != null)
	                    out.close();

	                if (in != null)
	                    in.close();
	            }

	            System.out.println("successfull");
	        } catch (IOException e) {
	        	 System.out.println("exception");
	        } 
	}

}
