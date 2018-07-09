import java.util.*;

class Employee{
	Scanner sn = new Scanner(System.in);
	String firstName;
	String lastName;
	double salary;
	double newSalary;
	Employee(){
		firstName="";
		lastName="";
		salary=0.0;	
	}
	void setFirstName(){
		System.out.print("Enter your first name :");
		firstName = sn.nextLine();
	}
	void setLastName(){
		System.out.print("Enter your last name :");
		lastName = sn.nextLine();
	}
	void setSalary(){
		System.out.print("Enter your salary :");
		salary = sn.nextDouble();
	}
	void calcNewSalary(){
		newSalary = (salary + (salary*10/100));
	}
	
	String getFirstName(){
		return firstName;
	}
	String getLastName(){
		return lastName;
	}
	Double getSalary(){
		return salary*12;
	}
	Double getNewSalary(){
		return newSalary*12;
	}	
}

class EmployeeTest{
	public static void main(String a[]){
	Employee a1 = new Employee();
	a1.setFirstName();
	a1.setLastName();
	a1.setSalary();
	a1.calcNewSalary();
	System.out.println("Your first name is :"+a1.getFirstName());
	System.out.println("Your last name is :"+a1.getLastName());
	System.out.println("Your yearly salary is :"+a1.getSalary());
	System.out.println("Your new yearly salary is :"+a1.getNewSalary());
	}
}
