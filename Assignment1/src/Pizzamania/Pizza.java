package Pizzamania;

import java.util.Random;
// This program makes very yummy pizzas
// @author John W Munyi
// On my honor, as a Carnegie-Mellon Rwanda student, I have neither given nor received unauthorized assistance on this work.

public class Pizza
{	
	static Random r = new Random();
	private int numSlice;
	private String topping;
	
	public enum meatChoices
	{
		BEEF, MUTTON, PORK
	}
	
	public enum vegChoices
	{
		CUCUMBER, LETTUCE, TOMATO, POTATO, CHILIAPPLE
	}
	
	public Pizza()
	{
		setNumSlice();
		topping = getRandomTopping();
	}
	
	public Pizza(String topping)
	{
		setNumSlice();
		setTopping(topping);
	}
	
	public void setTopping(String mytopping)
	{
		topping = mytopping;
	}
	
	public int getNumSlice()
	{
		return numSlice;
	}
	
	public void setNumSlice()
	{
		numSlice = 15;
	}
	
	public String getRandomTopping()
	{
		String meatTopping = (meatChoices.values()[r.nextInt(meatChoices.values().length)]).toString();
		String vegTopping = (vegChoices.values()[r.nextInt(vegChoices.values().length)]).toString();
		return meatTopping + " and " + vegTopping;
	}
	
	public String toString()
	{
		return "the slices are: " + numSlice + "\n" +
				"the Toppings are: " + topping;
	}
}
