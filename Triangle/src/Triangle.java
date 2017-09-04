// This program prints a 
// @author John W Munyi
import java.util.Scanner;
public class Triangle
{

	public static void main(String[] args)
	{
		int num;
		String myshape;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
        num = input.nextInt();
        
        if (num <= 0)
		{
			System.out.println("*** That is not a valid entry.***");
		}else
		{
			printTriangle(num);
		}

	}
	
	//prints a single line of * depends on the number entered
	public static void printStars(int numStars)
	{
		for(int i = 1; i <= numStars; i++)
		{
			System.out.print("*");
		}
	}
	
	//prints a triangle with the highest point being the number entered 
	public static void printTriangle(int stars)
	{
		for (int i = 1; i <= stars; i++)
			{
				printStars(i);
				System.out.println();
			}
		
		for (int j = stars -1 ; j >= 1; j--)
		{
			printStars(j);
			System.out.println();
		}
	}
}
