package Pizzamania;
// This program makes very yummy pizzas objects and makes you choose
// @author John W Munyi
//On my honor, as a Carnegie-Mellon Rwanda student, I have neither given nor received unauthorized assistance on this work.
import java.util.Scanner;
public class PizzaTester
{

	public static void main(String[] args)
	{
		Pizza pizza1 = new Pizza();
		System.out.println("The Random Pizza you got is: \n" + pizza1);
		
		int orderNumber = Integer.parseInt(args[0]);
		Scanner input = new Scanner(System.in);
		String pizzaName;
		for(int i = 1; i <= orderNumber; i++)
		{
			boolean gotOrder = false;

			do 
			{
				System.out.println("Kindly select Pizza number " + i);
				pizzaName = input.next();
			
				try 
				{
					for (Pizza.meatChoices m : Pizza.meatChoices.values()) 
					{
						if (m.name().equalsIgnoreCase(pizzaName))
						{
							Pizza pizza = new Pizza(pizzaName);
							System.out.println("The Pizza you got is: \n" + pizza);
						}
					}
					
					for (Pizza.vegChoices v : Pizza.vegChoices.values()) 
					{
						if (v.name().equalsIgnoreCase(pizzaName))
						{
							Pizza pizza = new Pizza(pizzaName);
							System.out.println("The Pizza you got is: \n" + pizza);
						}
					}
					gotOrder = true;
				}
				catch(Exception e)
				{
					System.out.println("Not such meat choice");
				}
			}
			while (gotOrder == false);
		}
	}

}
