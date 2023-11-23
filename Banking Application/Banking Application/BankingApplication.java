 import java.util.*;
 
 class BankingApplication{
	 
	 static int id=10;
	 static int acNo=112233;
	 static Scanner scan=new Scanner(System.in);
	 static ArrayList<Customer>customersList=new ArrayList<>();
	 
	 
	public static void main(String[] args){
		
		customersList.add(new Customer(11,11011,"Kumar","ABcdef123","ABcdef123"));
		customersList.add(new Customer(22,22022,"Kumar","BAcdef123","BAcdef123"));
		customersList.add(new Customer(33,33044,"Kumar","AcdeF123","AcdeF123"));
		customersList.add(new Customer(23,33055,"Kumar","asd","asd"));
		customersList.add(new Customer(24,33066,"Kumar","asd","asd"));
		
		
		
		
		System.out.println("Welcome to Banking Application");
		
		boolean loop=true;
		
		while(loop)
		{
			System.out.println("\t 1-> New Customer ...");
			System.out.println("\t 2-> Login ...");
			System.out.println("\t 3-> View Customers ...");
			System.out.println("\t 4-> Exit ...");
			
			int useropt=scan.nextInt();
			scan.nextLine();
			switch(useropt)
			{
				case 1:
					System.out.println("New Customer...");
					newCustomer();
					break;
				case 2:
					System.out.println("Login...");
					
					login();
					break;
				case 3:
					System.out.println("View Customers List...");
					
					printCustomersList();
					break;
				case 4:
					System.out.println("Top Rank List...");
					//customersList.sort((Customer c1 , Customer c2) -> { return -1 *(c1.balance - c2.balance);});
					//customersList.sort(sort1(c1,c2));
					Collections.sort(customersList,new Sorting());
					printCustomersList();
					
					
					break;
				case 5:
					System.out.println("Exit...");
					loop=false;
					break;
				default:
					System.out.println("Enter valid Input...");
					break;
				
				}
			
		}
	
	}
	
	public static int sort1(Customer c1 ,Customer c2){
		return -1*(c1.balance - c2.balance);
	}
	public static void rankList()
	{
		
		
		
		
	}
	
	
	
	public static void login()
	{
		System.out.println("Enter your Id");
		int cid=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Password");
		String pwd=scan.nextLine();
		
		Customer c=validateUser(cid,pwd);
		if(c!=null)
		{
			System.out.println("Account Login Successfully...");
			
			operations(c);
			
		}
		else{
			System.out.println("Invalid User");
			return;
		}
	}
	
	public static void operations(Customer c)
	{
		boolean loop1=true;
		while(loop1)
		{
		System.out.println("\t 1-> Atm Withdrawal...");
		System.out.println("\t 2-> Balance Check...");
		System.out.println("\t 3> Cash Deposit..");
		System.out.println("\t 4-> Bank Transfer...");
		System.out.println("\t 5-> History...");
		System.out.println("\t 6-> Password Change...");
		
		
		System.out.println("\t 7-> Exit...");
		
		int operations=scan.nextInt();
		scan.nextLine();
		
		
		
		
		switch(operations)
		{
			case 1: 
				System.out.println("Atm Withdrawal...");
				
				withdrawal(c);
				break;
			case 2: 
				System.out.println("Balance check...");
				
				System.out.println("Balance : "+c.balance);
				
				break;
			case 3: 
				System.out.println("cash deposit...");
				cashDeposit(c);
				
				break;
			case 4: 
				System.out.println("Bank Transfer...");
				bankTransfer(c);
				
				break;
			case 5: 
				System.out.println("History...");
				
				System.out.println("\t Name :"+c.name);
				System.out.println("\t Cust Id :"+c.custId);
				System.out.println("\t Account No :"+c.accountNo);
				
				
				
				for(String s :c.history)
				{
					System.out.println(s);
				}
				//System.out.println(c.history);
				
				break;
			case 6: 
				System.out.println("Password Change");
				// passwordChange();
				
				break;
			case 7: 
				System.out.println("Exit...");
				loop1=false;
				break;
			default:
				System.out.println("Enter valid option....");
				break;
		}
		}
		
		
		
	}
	//public static void passwordChange()
	public static void bankTransfer(Customer c)
	{
		System.out.println("Enter Amount to  Transfer...");
		int transferAmount=scan.nextInt();
		System.out.println("Enter Id  to  Transfer...");
		int transferAccount=scan.nextInt();
		
		System.out.println("\t History...");
		for(Customer t:customersList)
		{
			if(t.custId==transferAccount)
			{
				t.credit(transferAmount);
				c.getAmount(transferAmount);
				
				
			}
		}
		
		c.history.add("Bank Transfer "+ transferAccount+" : "+transferAmount+" "+c.balance);
		System.out.println("Amount Transfer Successfully  ");
		
	}
	
	
	
	public static void withdrawal(Customer c)
	{
		System.out.println("Enter the amount to withdraw...");
		int amount=scan.nextInt();
		
		System.out.println("Enter Password....");
		String atmPwd=scan.next();

		if(c.password.equals(atmPwd))
		{
			c.debit(amount);
			c.history.add("Withdraw  -> "+ amount+" "+ c.balance);
			
		}
		else{
			System.out.println("Invalid Password...");
			return;
		}
	}
	
	
	public static void cashDeposit(Customer c){
		
		System.out.println("Enter the amount to deposit...");
		int amount=scan.nextInt();
		
		System.out.println("Enter Password....");
		String atmPwd=scan.next();

		if(c.password.equals(atmPwd))
		{
			c.credit(amount);
			c.history.add("Credit : "+amount+" "+c.balance);
		}
		else{
			System.out.println("Invalid Password...");
			return;
		}
		
		
	}
	
	
	
	
	public static Customer validateUser(int cid,String pwd)
	{
		for(Customer c : customersList)
		{
			if(c.custId==cid && c.password.equals(pwd))
			{
				return c;
			}
			
		}
		return null;
	}
	
	
	//.............................................
	public static void printCustomersList()
	{
		System.out.println("Id\t Ac No \t Name \t Balance \t EncPwd ");
		for(Customer c:customersList)
		{
			System.out.println(c.custId+" \t"+c.accountNo+ "\t " +c.name+" \t"+c.balance+" \t"+c.encPwd);
		}
		
		
		
	}
	
	//........................................
	public static void newCustomer()
		{
			System.out.println("Enter your Name...");
		 String name=scan.nextLine();
		 
		 System.out.println("Enter your Password...");
		String password=scan.next();
		 
		 System.out.println("Enter your Confirm Password...");
		String confirm=scan.next();
		 id+=10;
		 acNo+=10000;
		 
		 boolean validate=validatePassword(password,confirm);
		 if(validate)
		 {
			 Customer c=new Customer(id,acNo,name,password,confirm);
			 customersList.add(c);
			 System.out.println(c.custId+" is Your Id..");
			 System.out.println("Account Created Successfully....");
		 }
		 else 
		 {
			 System.out.println("Password Mis Match...");
			 return;
		 }
		 
		}
		
		public static boolean validatePassword(String password,String confirm)
		{
			if(password.equals(confirm))
			{
				return true;
			}
			else{
				return false;
			}
		}
		
 
 
 
 }
 class Customer{
	 
	 
	 int custId;
	 int accountNo;
	 String name;
	 int balance;
	 String encPwd;
	 String password;
	 String confirm;
	 ArrayList<String>history;
	 
	 Customer(int id,int accountNo,String name,String password,String confirm )
	 {
		 Scanner scan=new Scanner(System.in);
		this.name=name;
		this.password=password;
		this.confirm=confirm;
		 this.balance=100000 +accountNo;
		 this.accountNo=accountNo;
		 this.custId=id;
		 this.encPwd=encrypt(password);
		 this.history=new ArrayList<>();
		 history.add("opening   : "+balance+" "+balance);
		 
		 
		 
	 }
		 
		 public String encrypt(String s)
		 {
			 StringBuilder sb=new StringBuilder();
			 
			// System.out.println(s);
			 for(int i=0;i<s.length();i++)
			 {
				 char a=s.charAt(i);
				 
				 sb.append( (char) (a+1));
				
			 }
			
			 return sb.toString();
			 
			 
		 }
		 
		 
		 public  void credit(int amount)
	 {
		balance+=amount;
		System.out.println("Amount Added  Successfully.... ");
	 }
	 
	 	 public  void debit(int amount)
	 {
		if(balance-amount>1000)
		{
			balance-=amount;
			System.out.println("Withdrawal Successfully.... ");
			if(amount>5000)
			{
				balance-=10;
				history.add("Operational fee : "+ 10);
			}
		}
		else
		{
			System.out.println("Account must Contain At Least 1000");
			return;
		}
	 }
	 
	  public  void getAmount(int amount)
	 {
		if(balance-amount>1000)
		{
			balance-=amount;
			if(amount>5000)
			{
				balance-=10;
				
			}
			System.out.println("Operational fee : "+10);
			
			
		}
		else
		{
			System.out.println("Account must Contain At Least 1000");
			return;
		}
	 }
 
 }
 