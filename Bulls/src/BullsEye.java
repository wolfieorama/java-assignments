import java.awt.Color;
import java.awt.Point;

// This program draws a BullsEye 
// @author John W Munyi

public class BullsEye
{	
	private int number_of_circles, step, width;
	private Point center;
    private Color color1, color2;
	private boolean isOutLine;
			
	public BullsEye()
	{
//		center = new Point();
//		number_of_circles = 4;
//		color1 = Color.blue;
//		color2 = Color.red;
//		isOutLine = true;
		setStep();
	}
	
	public BullsEye(int number_of_circles, int step)
	{
		setStep(step);
		setNumber_of_circles(number_of_circles);
	}
	
	public Point getCenter()
	{
		return center;
	}
	
	public Color getColor1()
	{
		return color1;
	}
	
	public void setColor1(Color color1)
	{
		this.color1 = color1;
	}
	
	public int getStep()
	{
		return step;
	}
	
	public void setStep()
	{
		step = 60;
	}

	public void setStep(int step)
	{
		this.step = step;
	}
	
	public int getNumber_of_circles()
	{
		return number_of_circles;
	}

	public void setNumber_of_circles(int number_of_circles)
	{
		this.number_of_circles = number_of_circles;
	}
	
	public int getWidth()
//	(int number_of_circles, int step)
	{
//		width = number_of_circles * step;
//		return width;
		return getNumber_of_circles();
	}
	
	public String toString()
	{
		return "the step is " + step;
//				"the center is: " + center + "\n" 
//	+ "the step size is: " + step + "3\n"  
//    + "the number of cirlces are: " + number_of_circles + "\n"
//    + "color1 is: " + color1 + "\n"
//    + "color2 is: " + color2 + "\n" 
//    + "The width is: " + getWidth() + "\n";    
	}

	public static void main(String[] args)
	{
		
		BullsEye b1 = new BullsEye();
//		b1.setStep(50);
		b1.center = new Point(50, 60);
		b1.setColor1(Color.blue);
		b1.isOutLine = true;
		System.out.println(b1);
		
		BullsEye b2 = new BullsEye(50, 100);
		System.out.println(b2);

	}
}