class Employee{
	String name;
	int yearOfJoining;
	int salary;
	String address;

Employee(String name,int yearOfJoining,int salary,String address)
{
	this.name=name;
	this.yearOfJoining=yearOfJoining;
	this.salary=salary;
	this.address=address;
}
}
class Task3{
public static void main(String[] args)
{
	Employee e1=new Employee("Ashwin",1994,40000,"64D,WallStreet");
	Employee e2=new Employee("Robert",1996,44000,"68D, WallStreet");
	Employee e3=new Employee("john",1998,48000,"69D,WallStreet ");
	Employee e4=new Employee("Ashwin",1994,40000,"65D,WallStreet ");
	
	System.out.println("Name       Year        salary        Address");
	System.out.println(e1.name+"   "+e1.yearOfJoining+"   "+e1.salary+"   " +e1.address);
	System.out.println(e2.name+"   "+e2.yearOfJoining+"   "+e2.salary+"   " +e2.address);
	System.out.println(e1.name+"   "+e3.yearOfJoining+"   "+e3.salary+"   " +e3.address);

}
}