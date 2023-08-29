package inheritance;

interface A1
{
	void fun();
	
	static void checkEquality(String a, String b)
	{
		if(a != null && b != null)
		{
			if(a.equals(b))
			{
				System.out.println("Both are same.");
			}
			else
			{
				System.out.println("Both are not same.");
			}
		}
		else
		{
			System.out.println("Both are null.");
		}
	}
}

interface B1 extends A1
{
	int x=34;
	void method1();
	default void say()
	{
		System.out.println("Sice java B, we can have a default method in interface.");
	}
}

interface C1 extends A1
{
	int x=90;
	void method2();
	//int say();
}

class D1 implements B1,C1
{

	@Override
	public void fun() 
	{
		// TODO Auto-generated method stub
		System.out.println("Hiii, we are doing fun");
	}

	@Override
	public void method2() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is method 2 from interface C");
	}

	@Override
	public void method1() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is method 1 from interface B");
	}
	
	@Override
	public void say() 
	{
		// TODO Auto-generated method stub
		System.out.println("We are overriding default method");
	}
}

public class MultipleInheritance1 
{
	public static void main(String[] args)
	{
		D1 obj = new D1();
		obj.fun();
		obj.method1();
		obj.method2();
		System.out.println(C1.x);
		obj.say();
		A1.checkEquality("hi", "hello");
	}
}