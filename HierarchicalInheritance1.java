package inheritance;

abstract class Bank1
{
	abstract float rateOfInterest();
	abstract void msg();
	void fun()
	{
		System.out.println("hi...");
	}
}
class Sbi1 extends Bank1
{
	float rateOfInterest() //overridden
	{
		return 6.75f;
	}

	@Override
	void msg() 
	{
		// TODO Auto-generated method stub
		System.out.println("We are providing less interest in home loan");
	}
}
class Axis1 extends Bank1
{
	float rateOfInterest() //overridden
	{
		return 10.00f;
	}

	@Override
	void msg() {
		// TODO Auto-generated method stub
		
	}
}
public class HierarchicalInheritance1
{
	public static void main(String args[])
	{
		Bank1 b; //reference variable type parent
		b = new Sbi1();
		System.out.println(b.rateOfInterest()+"%");
		System.out.println("SBI "+b);
		
		b = new Axis1();
		System.out.println(b.rateOfInterest()+"%");
		System.out.println("Axis "+b);
	}
}
