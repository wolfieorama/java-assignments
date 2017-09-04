package john;

import java.util.Scanner;
/** 
* MinAndMax is a application that reads 5 intergers and returns
* minimum and Maximum number
* @author John Munyi
*/

class MinAndMax
{
    public static void main(String[] args)
    {
        int min, max, int1, int2, int3, int4, int5;
        Scanner input = new Scanner(System.in);

      
        System.out.print("Enter first Interger: ");
        int1 = input.nextInt();
        System.out.print("Enter second Interger: ");
        int2 = input.nextInt();
        System.out.print("Enter third Interger: ");
        int3 = input.nextInt();
        System.out.print("Enter fourth Interger: ");
        int4 = input.nextInt();
        System.out.print("Enter fifth Interger: ");
        int5 = input.nextInt();

        max = 0;

        if (int2 > max)
            max = int2;
        if (int3 > max)
            max = int3;
        if (int4 > max)
            max = int4;
        if (int5 > max)
            max = int5;
        if (int1 > max)
            max = int1;
        
        System.out.println("the largest number is " + max);
        
        min = int1;
        if (int2 < min)
            min = int2;
        if (int3 < min)
            min = int3;
        if (int3 < min)
            max = int4;
        if (int5 < min)
            min = int5;
        
        System.out.println("the smallest number is " + min);
    }
}

