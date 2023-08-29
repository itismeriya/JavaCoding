package final_keyword;

class Demo
{
	final int a=10;
	String userName="Deesha";
	String password="123";
	final void login(String userName,String password) 
	{
		if((this.userName.equals(userName))&&(this.password.equals(password)))
		{
			System.out.println("Login");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}

/*class Emp1 extends Demo
{
	void login(String userName,String password)
	{
		
	}
	
} */

class Indian
{
	final long adharNo;//blank or unutilized non static field
//	blank variable left without initialization
//	with final we can only set in constructor so we don't need to add setter method 
	
	final static int a;//blank or unutilized non static field and we have declared the variable here
	static 
	{
		//(static block) whenever we use static method we have to use static block
		a=34;
        // if we use static field we need to initialize it
 	}
	
	//constructor
	public Indian(long adharNo) 
	{
		this.adharNo=adharNo;
	}
	public long getAdharNo() 
	{
		return adharNo;
	}
}

public class FinalDemo 
{
	public static void main(String[] args) 
	{
		//TODO Auto-generated method stub
		//Demo d=new Demo();
		//d.a=56;
		Indian in=new Indian(25647895);
		System.out.println(in.getAdharNo()+" "+Indian.a);
	}
}