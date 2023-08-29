package exceptionHandling;

import java.util.Scanner;

public class FinallyBlockAlwaysExecutedNotExit 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		System.out.println("Enter first number : ");
		a=sc.nextInt();
		System.out.println("Enter second number : ");
		b=sc.nextInt();
		try 
		{	
			int c=a/b;
			System.out.println("Result : "+c);
		}
				
		catch (Exception e) 
		{	
			e.printStackTrace();
			System.exit(0);
		}
		
		finally
		{
			System.out.println("Finally Block Will Always Execute.");
		}
	}
}