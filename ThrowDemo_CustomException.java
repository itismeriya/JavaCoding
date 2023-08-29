package exceptionHandling;

class Validation
{
	public static void validate(int age) throws AgevValidationCustomException
	{
		if(age>18)
		{
			System.out.println("Eligible For Vaccination.");
		}
		else
		{
			throw new AgevValidationCustomException();
		}
	}
}
public class ThrowDemo_CustomException 
{
	public static void main(String[] args)
	{
		try
		{
			Validation.validate(12);
		}
		catch(Exception e)  //generic exception handler
		{
			System.out.println(e);
		}
		
		System.out.println("Visit Again");
	}
}