import java.io.*;

public class Bad4
{
	public static void main (String args[]) throws IOException
	{
	
	    BufferedReader keyboard =
	         new BufferedReader(new InputStreamReader(System.in));
	
	    String   name = "";
	    System.out.print("Enter your name: ");
	    name = keyboard.readLine();
	    int len;
	
	    len =  name.length();
	
	    System.out.println("The 5th letter of your name is: " + name.substring(4,5));
	    System.out.println("The second letter of your name is: " + name.substring(1,2));
	    System.out.println("The last letter of your name is: " + name.substring(len - 1, len));
	}
}
