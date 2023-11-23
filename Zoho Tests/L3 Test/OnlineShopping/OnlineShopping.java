import java.util.*;
import java.io.*;

public class OnlineShopping{
	
	
		static  boolean loop1=true;
		static boolean loop2=true;
		static Scanner scan=new Scanner(System.in);
		
	public static void main(String[] args) throws IOException{
		
		ArrayList<Admin>adminDetails=new ArrayList<>();
		ArrayList<User>userDetails=new ArrayList<>();
		
		ArrayList<Product>productList=new ArrayList<>();
		
		userDetails.add(new User("aaa","aaa","aaa"));
		
		adminDetails.add(new Admin("abc","abc@gmail.com",123,1));
		
		
		System.out.println("Welcome to Online Shopping....");
		
		
		boolean loop=true;
		
		while(loop)
		{
			System.out.println();
			System.out.println("	1  Admin 	");
			System.out.println("	2  User 	");
			System.out.println("	3  Exit		");
			int n=scan.nextInt();
			scan.nextLine();
			
			switch(n)
			{
				case 1:
				{
					loop1=true;
					System.out.println("	Admin Access....");
					
					System.out.println("Enter user Id...");
					int id=scan.nextInt();
					//scan.nextLine();
					System.out.println("Enter the Password");
					int password=scan.nextInt();
					
					
					
					
					if(isValidAdmin(id,password,adminDetails))
					{
						
						adminInterface(productList);
					}
					else
					{
						System.out.println("Invalid User Details..");
					}
					
					break;
				}
				case 2:
				{
					loop2=true;
					System.out.println("	User Access....");
					
					System.out.println("Enter user name...");
					String name=scan.nextLine();
					//scan.nextLine();
					System.out.println("Enter the Password");
					String password=scan.nextLine();
					
					User user=isValidUser( name, password,userDetails);
					if(user!=null)
					{
					
					userInterface(productList,user);
					}
					else{
						System.out.println("Enter valid User Details");
					}
					
					break;
				}
				case 3: 
				{
					System.out.println("Exit...");
					loop=false;
					break;
				}
				default : 
				{
					System.out.println("Enter valid Input......");
				}
			}
			
			
			
		}
		
	}
	public static User isValidUser(String name,String password,ArrayList<User>userDetails)
	{
		for(User u : userDetails)
		{
			System.out.println(u.name.equals(name));
			if(u.name.equals(name)&&u.password.equals(password))
			{
				return u;
			}
		
		}
		return null;
	}
	public static boolean isValidAdmin(int id,int password,ArrayList<Admin>adminDetails)
	{
			for(Admin a:adminDetails)
			{
				System.out.println(a.name);
				System.out.println(a.password);
				
				if(a.id==id&&a.password==password)
				{
					System.out.println("dd");
					return true;
				}
			}
			return false;
	}
	
	
	public static void adminInterface(ArrayList<Product>productList)throws IOException,FileNotFoundException
	{
		while(loop1)
		{
			System.out.println();
			System.out.println(" 	1   Add products	");
			System.out.println("	2   Create Coupoun 	");
			System.out.println("	3	Shopping History ");
			System.out.println("	4	Quantities 	");
			System.out.println("	5	View Products	");
			System.out.println("	6 	Exit");
			
			int m=scan.nextInt();
			switch(m)
			{
				case 1:
				{
					System.out.println("Add products  ");
					
					Product p=new Product();
					productList.add(p);
					
					break;
				}
				case 2:
				{
					System.out.println("Coupouns  ");
					System.out.println("Enter the Coupon name...");
					String name=scan.nextLine();
					scan.nextLine();
					System.out.println("Enter the Discount Percent..");
					int discount=scan.nextInt();
					Coupon c=new Coupon(name,discount);
					System.out.println("Coupon Added Successfully...");
					
					
					
					break;
				}case 3:
				{
					System.out.println("History  ");
					
					File file=new File("History.txt");
					FileReader fr=new FileReader(file);
					BufferedReader br=new BufferedReader(fr);
					String product=" ";
					
					while((product=br.readLine())!=null)
					{
						System.out.println(product);
					}
					break;
				}case 4:
				{
					System.out.println("Product Search...... ");
					scan.nextLine();
					String name=scan.nextLine();
					
					for(Product p:productList)
					{
						//System.out.println(p.name.equals(name));
						if(p.name.equals(name))
						{
							System.out.println(p.name+" -> "+p.quantity);
						}
					}
					
					break;
				}
				case 5:
				{
					System.out.println("Productn Search......");
					
					
					for(Product p:productList)
					{
						System.out.println(p.name+"  "+p.price+"  "+p.quantity);
					}
				}
				break;
				case 6:
				{
					System.out.println("Exit  ");
					loop1=false;
					break;
				}
				default:
				{
					System.out.println("Enter valid Input");
					
				}
			}
		}
	}
	public static void userInterface(ArrayList<Product>productList,User user) throws IOException
	{
		int item=0;
		while(loop2)
		{
			System.out.println(" 	1   List Of Products	");
			System.out.println("	2  See the Products 	");
			System.out.println("	3	Add to wishList		");
			System.out.println("	4	Order 	");
			System.out.println("	5 	cancel			");
			System.out.println("	6 	Discount		");
			System.out.println("	7	Amount			");
			System.out.println("	8 	Exit		");
			
			
			int m=scan.nextInt();
			scan.nextLine();
			switch(m)
			{
				case 1:
				{
					System.out.println("List Of Products  ");
					for(Product p:productList)
					{
						if(p.quantity!=0)
						{
							System.out.println(p.name+" -> "+p.price);
						}
						
					}
					
					break;
				}
				case 2:
				{
					System.out.println("Search....  ");
					
					String name=scan.nextLine();
					System.out.println("List Of Products  ");
					
					System.out.println();
					System.out.println("Product 	price ");
				
					for(Product p:productList)
					{
						if(p.name.equals(name))
						{
							System.out.println(p.name+" -> "+p.price);
						}
						
					}
					break;
				}case 3:
				{
					System.out.println("Add to wishList  ");
					break;
				}case 4:
				{
					System.out.println("Order....  ");
					
					System.out.println();
					
					System.out.println("Product 	price    Quantity .");
					
					for(Product p:productList)
					{
						if(p.quantity!=0)
						{
							System.out.println(p.productId+"  "+p.name+" -> "+p.price+"  "+p.quantity);
							
						}
						else 
						{
							System.out.println("No products arae available...");
						}
						
					}
					System.out.println("Enter  Id to place Order....");
					int id=scan.nextInt();
					
					System.out.println("Enter Number of items ...");
					int no=scan.nextInt();
					item=no;
					
					Product order=productList.get(id-1);
					if(order.quantity<no)
					{
						System.out.println("Insufficient Product.....");
						break;
					}
					
					order.quantity=order.quantity-no;
					
					user.Amount+=order.price*no;
					
					
					user.orderList.add(order);
					
					
					
					String productDetails=" Product :  "+order.name+" Price  : "+order.price+"\n ";
					
					String userinfo ="User Id : "+user.userid+" User Name :  "+user.name+" -> ";
					
					File file = new File("History.txt");
					
					FileWriter fw =new FileWriter(file,true);
					fw.write(userinfo+productDetails);
					fw.close();
					
					
					System.out.println("Order Placed Successfullly ....");
					
				
					break;
				}
				case 5:
				{
					System.out.println("cancel  ");
					
					if(productList.size()==0)
					{
						System.out.println("No Products available in your Order List...");
						break;
					}
					for(Product p:user.orderList)
					{
						System.out.println(p.productId+" ->  "+p.name);
					}
					System.out.println("Enter Id to cancel....");
					int proId=scan.nextInt();
					
					
					for(Product p:user.orderList)
					{
						if(p.productId==proId)
						{
							user.orderList.remove(proId-1);
							//order.quantity=++order.quantity;
							System.out.println(" Order Cancelled Successfully.....");
							
							break;
						}
					}
					
					break;
				}
				case 6:
				{
					System.out.println("Coupon  ");
					
					break;
				}
				case 7:
				{
					System.out.print(" Total : Amount  ");
					System.out.println(user.Amount);
					
					
					
					break;
				}
				case 8:
				{
					System.out.println("Exit  ");
					loop2=false;
					break;
				}
				default:
				{
					System.out.println("Enter valid Input");
					
				}
			}
		}
	}


}


class Admin{
	int id;
	String name;
	String email;
	int password;
	//String confirmPassword;
	
	
	Admin(String name,String email,int password,int id)
	{
		this.name=name;
		this.email=email;
		this.password=password;
		this.id=id;
	}

}

class User{
	static int id=0;
	String name;
	String email;
	String password;
	int userid;
	int Amount;
	//String confirmPassword;
	ArrayList<Product>orderList;
	
	
	User(String name,String email,String password)
	{
		this.name=name;
		this.email=email;
		this.password=password;
		this.userid=++id;
		this.Amount=0;
		orderList=new ArrayList<Product>();
	}

}

class Product{
	Scanner scan=new Scanner(System.in);
	static int id=0;
	String name;
	int price;
	int quantity;
	int productId;
	
	Product()
	{
		System.out.println("Enter Product Name ");
		this.name=scan.nextLine();
		
		System.out.println("Enter the product Price  ");
		this.price=scan.nextInt();
		System.out.println("Enter the Product Quantity...");
		this.quantity=scan.nextInt();
		this.productId=++id;
	
	}	
}
class Coupon{
	
	String name;
	int discount;
	
	Coupon(String name ,int discount)
	{
		this.name=name;
		this.discount=discount;
	}
	
	
	
}