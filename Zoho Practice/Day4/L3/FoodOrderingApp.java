import java.util.Scanner;
import java.util.HashMap;

class FoodOrderingApp{

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args){


	boolean loop=true;

	HashMap<Integer,Customer>usersList=new HashMap<Integer,Customer>();

	while(loop)
	{	
		System.out.println("Enter 1. Login  ...");
		System.out.println("Enter 2. Register New user...");
		System.out.println("Enter 3 to Exit....");
		int n=scan.nextInt();
		
		switch(n){
		case 1:
		{
			Customer c=new Customer();
			//validate(c,usersList);
			usersList.put(c.cId,c);
			
				System.out.println("Register Successfully....");
				
				menu();

			
			break;
		}
		case 2: 
		{
			System.out.println("  ");
			break;
		}
		case 3:
		{
			System.out.println("Exit..");
			loop=false;
			break;
		}
		default : 
			{
				System.out.println("Enter valid Input...");
				break;
			}
		
	

		}


	}
}
	public static boolean validate(Customer c,HashMap<Integer,Customer>usersList)
	{
		if(usersList.size() ==0)
		{
			return false;

		}
		for(Customer cust :usersList.values())
		{
			if(cust.name.equals(c.name)&&cust.Email.equals(c.Email))
			{
				return true;
			}


		}
		return false;


	}

	public static void menu()
	{
		while(true)
		{
		System.out.println("Enter 1. To Order ...");
		System.out.println("Enter 2. to Cancel...");
		System.out.println("Enter 3 to view ...");
		System.out.println("Enter 4 to Exit....");

		int m=scan.nextInt();
		
		switch(m){
		case 1:
		{
			System.out.println("ORDERING...");
			
			MenuCard();

			break;
		}
		case 2: 
		{
			System.out.println("Cancel....");
			break;
		}
		case 3:
		{
			System.out.println("View...");
			break;
		}
		case 4:
		{
			System.out.println("Exit");
			System.exit(0);
			break;
		}
		default : 
		{
			System.out.println("Enter VAlid Input....");
		}

		}

	}

}	

	public static void MenuCard(){
	
	System.out.println("pizza "+"  200 rs ");
	 
	System.out.println("Burger "+ "300 rs");
	
	System.out.println("Pasta "+" 250 rs ");

	System.out.println("Noodles "+ " 150 rs");

}
}

class Customer{

	static int id=0;
	 String name;
	 int age;
	 String Email;
	 String password;
	int cId;

	Scanner scan=new Scanner(System.in);
	Customer()
	{
		System.out.println("Enter your name ....");
		this.name=scan.nextLine();
		System.out.println("Enter your Age ...");
		this.age=scan.nextInt();
		System.out.println("Enter E mail...");
		this.Email=scan.next();
		System.out.println("Enter Password...");
		this.password=scan.next();
		this.cId=++id;
	}
}
	
