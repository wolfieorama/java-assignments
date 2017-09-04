// This program plays with strings and returns modified versions
// @author John W Munyi
import java.util.Scanner;

public class PlayStrings
{

	public static void main(String[] args)
	{
		String word1, word2;
		Scanner input = new Scanner(System.in);
		
		//collect words
		System.out.print("Enter the first word: ");
		word1 = input.next();
		System.out.print("Enter the second word: ");
		word2 = input.next();
		
		//first string output
		int word1len = word1.length();
		String subword1 = word1.substring(0, 2);
		System.out.println("The first string is: " + word1);
		System.out.println("It is " + word1len + " characters long");
		System.out.println("The substring of the first two letters is: " + subword1);
		
		//second string output
		int word2len = word2.length();
		String subword2 = word2.substring(word2len - 2, word2len);
		System.out.println("The first string is: " + word2);
		System.out.println("It is " + word2len + " characters long");
		System.out.println("The substring of the first two letters is: " + subword2);
		
		String wordplus = word1 + word2;
		System.out.println("The two strings concatenated together are: " + wordplus);
		System.out.println("It is " + wordplus.length() + " characters long");
				//index of the first c
		for(int i = 0; i < wordplus.length(); i++)
		{
			if (wordplus.charAt(i) == 'c')
			{
				System.out.println("The index of the first c in the concatenated string is " + i);
			}
		}
		
		//The combined string with every e replaced with Q
		
		for(int i = 0; i < wordplus.length(); i++)
		{
			if (wordplus.charAt(i) == 'e')
			{
				System.out.println("The combined string with every e replaced with Q is: " + wordplus.replace('e', 'Q'));
			}
		}
		
		//The two strings concatenated and in all caps
		System.out.println("The two strings concatenated and in all caps is: " + wordplus.toUpperCase());
		
		//The two strings concatenated and in all lower case
		System.out.println("The two strings concatenated and in all lower case is: " + wordplus.toLowerCase());
	}	

}
