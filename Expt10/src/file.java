import java.io.*;
import java.util.Scanner;
public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File Obj = new File("Apple.txt");

		 try {
	            if (Obj.createNewFile()) 
	                System.out.println("File created: " + Obj.getName());
	            
	            else 
	                System.out.println("File already exists.");
	            
	        }
	        catch (IOException e) {
	            System.out.println("An error has occurred.");
	            e.printStackTrace();
	        }
		  try {
	            FileWriter Writer
	                = new FileWriter("Apple.txt");
	            Writer.write("Pande Aditya is seriously good");
	            Writer.close();
	            System.out.println("Successfully written.");
	        }
	        catch (IOException e) {
	            System.out.println("An error has occurred.");
	            e.printStackTrace();
	        }
		  try {
	           
	            Scanner Reader = new Scanner(Obj);
	            while (Reader.hasNextLine()) {
	                String data = Reader.nextLine();
	                System.out.println(data);
	            }
	            Reader.close();
	        }
	        catch (FileNotFoundException e) {
	            System.out.println("An error has occurred.");
	            e.printStackTrace();
	        }
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