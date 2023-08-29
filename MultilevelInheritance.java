package inheritance;

class User1{
	int id;
	String name;
	int x=12;
	public User1(int id,String name) {//constructor are not inherited
		//super() //compiler will write for us ..will call parent class that is object class
		this.id=id;
		this.name=name;
	}
	void setData(int id,String name) {
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.print("Id: "+this.id+" Name: "+this.name);
	}
	void test() {
		System.out.println("test");
	}
}
class Person1 extends User1{// person is inheriting user
float salary;
int x=50;
	public Person1(int id, String name,float salary) {
		super(id, name);//invoke immediate parent call parameterized constructor
		//memory of user class will we help by super
		this.salary=salary;
		
	}
	public float getSalary() {
		return salary;
	}
	//super.test(); variable and constructor only exit outside method.
	void display()
	{
		int x=100;
		super.test();
		super.display();
		System.out.println(" salary "+salary);
		System.out.println(x);// to print 50 use this to print 12 use super
	}
}
class Emp extends Person1{

	String companyName;
	public Emp(int id, String name, float salary,String companyName) {
		super(id, name, salary);
		this.companyName=companyName;
	}
	void display()
	{
		super.display();//Invokes person class display.
		System.out.println("company name: "+companyName );
	}
	
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Emp p=new Emp(101,"riya",10000.0f,"TCS");
		System.out.print(p.getSalary());
		p.display();
		
	}

}