package inheritance;

class User2
{
	int id;
	String name;
	int x=12;
	public User2(int id, String name)
	{
		super();//will parent class default constructor
		this.id=id;
		this.name=name;
	}
	void setData(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.print("Id : "+this.id+"\nName : "+this.name);
	}
}
class Person2 extends User2
{
	float salary;
	int x=50;
	
	public Person2(int id, String name, float salary)
	{
		super(id,name); //invoke immediate parent class parameterized constructor
		this.salary=salary;
	}
	public float getSalary()
	{
		return salary;
	}
	void display()
	{
		int x=100;
		super.display();//invoking super class display method
		System.out.print("\nSalary : ");
	}
}
class Empl extends Person2
{
	String companyName;
	public Empl(int id, String name, float salary, String companyName)
	{
		super(id,name,salary);
		this.companyName = companyName;
	}
}
public class InheritanceDemo2 
{
	public static void main(String args[])
	{
		Empl p = new Empl(101,"Deesha",78000.0f,"TCS");
		p.setData(101,"Deesha");
		p.display();
	}
}