package exceptionHandling;


import java.io.IOException;

class abc
{
	void fun() throws IOException
	{
		System.out.println("Fun method of parent class.");
	}
}

class bcd extends abc
{

	@Override
	void fun() //throws IOException 
	{
		System.out.println("Fun method of child class.");
	}
}

public class ExceptionInOverridingMethodIncludingOverloading 
{
	public static void main(String[] args)
	{
		
	}
}