public class Loops
// These Loops print the number of time a loop has been executed
// @author John W Munyi
{

	public static void main(String[] args)
	{
		int loopc = 0;

		// loop 1
		for(int i = 1; i <= 10; i++)
	        loopc++;
		{
			System.out.println("Loop 1 executes " + loopc + " times.");
		}
		
		// loop 2
		loopc = 0;
		for(int i = 0; i < 10; i++)
	        loopc++;
		{
			System.out.println("Loop 2 executes " + loopc + " times.");
				
		}
		
		// loop 3
		for(int i = 10; i > 0; i--)
	        loopc++;
		{
			System.out.println("Loop 3 executes " + loopc + " times.");
		}
		
		// loop 4
		loopc = 0;
		for(int i = -10; i <= 10 ; i++)
			loopc ++;
		{
			System.out.println("Loop 4 executes " + loopc + " times");
		}
		
		// loop 5			
		System.out.println("Loop 5 is an Infinite Loop.");
		
		// loop 6
		loopc = 0;
		for(int i = -10; i <= 10 ; i = i + 2)
			loopc ++;
		{
			System.out.println("Loop 6 executes " + loopc + " times.");
		}
		
		// loop 7
		loopc = 0;
		for(int i = -10; i <= 10 ; i = i + 3)
			loopc ++;
		{
			System.out.println("Loop 7 executes " + loopc + " times.");
		}
	}

}
