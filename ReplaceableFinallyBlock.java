package exceptionHandling;

import java.util.Scanner;
public class ReplaceableFinallyBlock 
{
	public static void main(String[] args) 
	{
		//try with resource
		try(Scanner sc=new Scanner(System.in))
		{   
			//outer try block
			int a,b;
			System.out.println("Enter first number : ");
			a=sc.nextInt();
			System.out.println("Enter second number : ");
			b=sc.nextInt();
			try 
			{	
				//inner
				int c=a/b;
				System.out.println("Result : "+c);
			}
				
			catch (Exception e) 
			{	
				//inner catch
				System.out.println(e);
			}
				
			int arr[]=new int[5];
				
			try 
			{   
				//inner try
				System.out.println("\nEnter elements : ");
				for(int i=0;i<=arr.length;i++)
				{
					arr[i]=sc.nextInt();
					System.out.println(arr[i]);
				}
			}
			catch (ArrayIndexOutOfBoundsException e) 
			{   
				//inner catch
				System.out.println(e.getMessage());
			}
				
		}
		catch (Exception e) 
		{	
			//outer catch
			System.out.println(e.getMessage());
		}
			
		finally
		{
			System.out.println("Finally Block Will Always Execute.");
			try
			{
				String name = null;
				System.out.println(name.length());
			}
				
			catch(Exception e)
			{
				e.printStackTrace();	
			}
		}
	}
}