import java.util.Scanner;
import java.util.ArrayList;

public class ElectricBill{
	public static void main(String[] args){
	
	ArrayList <Customer>customerdetails=new ArrayList<Customer>();
	customerdetails.add(new Customer("A",0));
	customerdetails.add(new Customer("B",0));
	customerdetails.add(new Customer("C",0));


	System.out.println("Welcome to Electri Bill");

	boolean loop=true;

	int domesticprice=12;
	int commercialprice=20;

	Scanner scan=new Scanner(System.in);
	while(loop)
	{
		System.out.println("Enter 1 to calculate Domestic use ");
		System.out.println("Enter 2 to calculate Commercial use ");
		System.out.println("Enter 3 to Display Customers...");
		System.out.println("Enter 4 to Exit...");

		int n=scan.nextInt();
		
		switch(n){
			case 1 : 
				{
					System.out.println("Domestic Use ...");
					System.out.println("Enter the Amount of units consumed in KWH :");
					int use=scan.nextInt();
					int bill=calculate(use,domesticprice);
					System.out.println(bill);
					break;
				}
			case 2 : 
				{
					System.out.println("Commercial Use ...");
					System.out.println("Enter the Amount of units consumed in KWH :");
					int use=scan.nextInt();
					int bill=calculate(use,commercialprice);
					System.out.println(bill);
					break;
				}

			case 3: {
					System.out.println("To Display ");
					display(customerdetails);
					break;


				}
			case 4 : 
				{
					System.out.println("Exit ...");
					loop=false;
					break;
				}
			default : 
				{
					System.out.println("Enter Valid Input...");
					break;
				}
		}

	}
}
	public static int calculate(int use,int price)
	{
		return (use*price);
	
	}

	public static  void display(ArrayList <Customer>customerdetails){

	for(Customer c: customerdetails)
	{
		System.out.println(" Customer Id : "+c.customerId+" Customer Name : "+c.name+" "+" Usage "+c.usage);
	}

}
}


class Customer{
	static int id=0;
	String name;
	int customerId;
	int usage;
	
	
	
	Customer(String name,int usage){
		this.name=name;
		this.customerId=++customerId;
		this.usage=usage;
		


	}



}



