import java.util.Scanner;
//import java.util.IOException;

class Salary{
	public static void main(String [] args){

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Salary in $ : ");
	
	
	int BS=scan.nextInt();
	

	int DA=(12/100)*BS;

	int HRA=150;

	int TA=120;

	int others=450;

	int PF=(14/100)*BS;

	int IT=(15/100)*BS;

	int Net=BS+DA+HRA+TA+others-(PF+IT);
	
	System.out.println("Net Salary is : "+Net);
	}
	

}

}

class Employee{
	
	static int id;
	String name;
	int empId;
	int salary;
	
	Employee(String name,int salary){
	this.name=name;
	this.empId=++id;
	this.salary=salary;
	}


}

class Employer{
	
	String name;
	String company;
	
	Employer(String name,String company)
	{
		this.name=name;
		this.company=company;

	}




}