package inheritance;

interface Aa
{
	void fun();
}

interface Bb extends Aa
{
	int x=34;
	void method1();
	//void say();
}

interface C extends Aa
{
	int x=90;
	void method2();
	//int say();
}

class D implements Bb,C
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
}

public class MultipleInheritance 
{
	public static void main(String[] args)
	{
		D obj = new D();
		obj.fun();
		obj.method1();
		obj.method2();
		System.out.println(C.x);
	}
}