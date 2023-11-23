import java.util.Scanner;
import java.util.ArrayList;

class BankingTransaction{
	
	
	public static void main(String[] args){
		
		ArrayList<User>BankUserDetails=new ArrayList<>();
		BankUserDetails.add(new User("aaa"));
		BankUserDetails.add(new User("bbb"));
		BankUserDetails.add(new User("ccc"));
		BankUserDetails.add(new User("ddd"));
		BankUserDetails.add(new User("eee"));
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome To the ABC Bank...");
		
		boolean loop=true;
		
		while(loop)
		{
			System.out.println("Enter 1 to withdraw...");
			System.out.println("Enter 2 to Deposit...");
			System.out.println("Enter 3 to Exit...");
			int n=scan.nextInt();
			switch(n)
			{
				case 1:
				{
					System.out.println("Withdrawal...");
					System.out.println("Enter your name ...");
					String s=scan.nextLine();
					//boolean verify=toVerify(id,BankUserDetails);
					scan.nextLine();
					
					//if(verify)
					{
						System.out.println("Enter Amount to Withdraw...");
					int am=scan.nextInt();
					User u=new User("aaa");
					
					u.withdrawal(am);
					u.start();
					}
					
					
					
					break;
				}
				case 2:
				{
					System.out.println("Deposit...");
					String s=scan.nextLine();
					scan.nextLine();
					System.out.println("Enter your name ...");
					System.out.println("Enter Amount to Deposit...");
					int am=scan.nextInt();
					User u=new User("aaa");
					u.deposit(am);
					break;
				}
				case 3:
				{
					System.out.println("Exit...");
					loop=false;
					break;
				}
				default :{
					System.out.println("Invalid Input...");
					break;
				}
			}
		}
		
		
	}
	/*public static boolean toVerify(int  id,ArrayList<User>BankUserDetails)
	
	{
		for(User u: BankUserDetails)
		{
			
			if(u.id==id)
			{
				return true;
			}
		}
		return false;
	}*/


}

class User extends Thread{
	static int balance=100;
		
		String name;
	//String password;
	int currentbalance;
	
	
	User(String name)
	{
		this.name=name;
		
	}
	
	
	
	public void withdrawal(int amount)
	{
		
			
		balance=balance-amount;
		
		System.out.println(name+" Withdrawn :  "+amount+" Current Balance : "+balance);
		
	}
	public void deposit(int amount)
	{
		balance=balance+amount;
		
		System.out.println(name+" Deposited : "+amount+"Current Amount : "+balance);
		
	
	}
	

	
}