/*****************************************************************************
DATE:5-2-17
NAME:ALPESH SONDAGAR
INSTITUTE:ACADGILD
ASSIGNMENT:SESSION 1
ASSIGNMENT:
Write a program to print the sum of two numbers without using + operator. 
Other operators have to be used.
******************************************************************************/




public class Assignment1
 {

    	public static void main(String args[]) 
	{
                System.out.println("----------ASSIGNMENT 1------------");
      
        	int x,y,z=0;                                    //declearation of two variables 
        	System.out.println("ADDITIONS OPERATIONS");
//---------------------------------------------------------------------        
        	System.out.print("Enter first number:");
        	x=Integer.parseInt(System.console().readLine());  //first variable value from systems console
//---------------------------------------------------------------------
        	System.out.print("Enter secound number:");
        	y=Integer.parseInt(System.console().readLine());   //secound variable value from systems console
//---------------------------------------------------------------------
        	z=x-(-y);
        	System.out.println("Answer of Additions is:"+z);    //Answer of additions 
//---------------------------------------------------------------------
	}
  
}
