package inheritance;
class User
{
int id;
String name;

public User(int id,String name)
{
	super();//will parent class default constructor 
	this.id=id;
	this.name=name;
}
void setData(int id,String name)
{
	
this.id=id;
this.name=name;
}

void display()
{
System.out.print("Id:"+this.id+" Name:"+this.name);	
}
}

class Person extends User{
float salary;
	public Person(int id, String name,float salary) {
		super(id, name); //invoke immediate parent class parameterized constructor
	    this.salary=salary;
	}
	public float getSalary() {
		return salary;
	}
	
	void getData()
	{
		super.display();//invoking super class display method
	System.out.println(id);	
	}
	
}


public class InheritanceDemo {

	public static void main(String[] args) {
		Person p=new Person(101,"koyel",78000.0f);
		//p.setData(101, "riya");
		p.display();
		System.out.println(" salary:"+p.getSalary());
	

	}

}
