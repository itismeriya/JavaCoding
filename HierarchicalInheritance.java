package inheritance;

class Bank
{
	float rateOfInterest()
	{
		return 8.0f;
	}
}
class Sbi extends Bank
{
	float rateOfInterest() //overridden
	{
		return 6.75f;
	}
}
class Axis extends Bank
{
	float rateOfInterest() //overridden
	{
		return 10.00f;
	}
}
public class HierarchicalInheritance 
{
	public static void main(String args[])
	{
		Bank b; //reference variable type parent
		b = new Sbi();
		System.out.println(b.rateOfInterest()+"%");
		System.out.println("SBI "+b);
		
		b = new Axis();
		System.out.println(b.rateOfInterest()+"%");
		System.out.println("Axis "+b);
	}
}