/************************************************************
DATE:5-2-17
NAME:ALPESH SONDAGAR
INSTITUTE:ACADGILD
ASSIGNMENT:SESSION 1
Write a program to print the result of the following expressions 
provided the integer variable a is
20 and b is 10.

int b= a-- - --a;
int c=a--;
int d=a>>2;
int e=a&b;
*************************************************************/
public class Assignment_2 {

    	public static void main(String args[]) 
	{
                System.out.println("----Assignment 2----");
		int a=20,b=10;
      		b= a-- - --a;
        	System.out.println("Answer Int b is:-"+b);
		a=20;
                int c=a--;
        	System.out.println("Answer int c is:-"+c);
		a=20;
                int d=a>>2;
        	System.out.println("Answer Int d is:-"+d);
		a=20;
		b=10;
                int e=a&b;
                System.out.println("Answer Int e is:-"+e);

	}
  
}
