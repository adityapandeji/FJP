import java.util.Scanner;
public class FirstNprimenumbers {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int  i,n,j,count;
		boolean flag=true;
		
		System.out.println("Roll No: 32358");
		System.out.println("Name: Om Shinde");
		System.out.println("Batch: M7\n");

		System.out.println("Enter the number of prime numbers you want: ");
    	n=obj.nextInt();
    		
    	System.out.println("First "+n+" prime numbers are :-"); 
    	j=2;
    	i=1; 
	    while(i<=n)
    	{
        	flag=true;
        	for(count=2;count<=j-1;count++)
        	{
            	if(j%count==0)  //Will be true if p is not prime
            	{
	            	flag=false;
	            	break;      //Loop will terminate if p is not prime
            	} 	 
        	}
            	if(flag==true)
            	{
               	 	System.out.print(j+" ") ;
	            	i++;
            	}
            	j++;
    	}
	}
}
