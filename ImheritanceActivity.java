package inheritance;


class Employee{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	
	
public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
	}

	public void calculateSalary(double basicSalary){
		double salary;
		salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary *Hra/100);
		System.out.println("Salary:" +salary);
	}
	public void calculateTransportAllowance() {
	       double transportAllowance = (this.basicSalary*10)/100;
	       System.out.println("Transport Allowance:"+transportAllowance);
	    }
}
class Manager extends Employee{

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
		// TODO Auto-generated constructor stub
	}
	public void calculateTransportAllowance() {
        double transportAllowance = (this.basicSalary*15)/100;
        System.out.println("Transport Allowance:"+transportAllowance);
     }
}
class Trainee extends Employee{

	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
		// TODO Auto-generated constructor stub
	}
	
}
public class ImheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager(126534, "Peter","Chennai India",237844 , 65000);
	    m.calculateSalary(65000);
	    Trainee t=new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
	    t.calculateSalary(1000.0);
	    m.calculateTransportAllowance();
	    t.calculateTransportAllowance();
	}
}