package exceptionHandling;

import java.util.Scanner;
public class NestedTryBlock 
{
	public static void main(String[] args) 
	{
		try 
		{   //outer try block
			Scanner sc=new Scanner(System.in);
			int a,b;
			System.out.println("Enter first number : ");
			a=sc.nextInt();
			System.out.println("Enter second number : ");
			b=sc.nextInt();
			try 
			{	//inner
				int c=a/b;
				System.out.println("Result : "+c);
			}
			
			catch (Exception e) 
			{	//inner catch
				System.out.println(e);
			}
			
			int arr[]=new int[5];
			
			try 
			{   //inner try
				System.out.println("\nEnter elements : ");
				for(int i=0;i<=arr.length;i++)
				{
					arr[i]=sc.nextInt();
					System.out.println(arr[i]);
				}
			}
			catch (ArrayIndexOutOfBoundsException e) 
			{   //inner catch
				System.out.println(e.getMessage());
			}
			
		}
		catch (Exception e) 
		{	//outer catch
			System.out.println(e.getMessage());
		}		
	}
}