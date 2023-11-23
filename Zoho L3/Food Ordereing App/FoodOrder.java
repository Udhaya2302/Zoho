import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FoodOrder {
	public static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		
		ArrayList<User>userDetails=new ArrayList<>();
		System.out.println("Welcome to the Food Ordering App.........");
		
		//File file=new File("C:\Users\Administrator\Documents\\user.txt");
		//ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file,true));
		
		//ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
				
		boolean loop=true;
		
		while(loop)
		{
			System.out.println("Enter 1 to Register....");
			System.out.println("Enter 2 to login....");
			System.out.println("Enter 3 to Exit....");
			
			int n=scan.nextInt();
			switch(n)
			{
			case 1:
			{
				System.out.println("Register...");
				User user=getDetails();
				userDetails.add(user);		
				System.out.println("Register Successfully....");
				break;
			}
			case 2:
			{
				System.out.println("Login...");
				System.out.println("Enter the User Name : ");
				String userName=scan.next();
				System.out.println("Enter the Password ...");
				String password=scan.next();
				if(loginVerification(userName,password,userDetails))
				{
					System.out.println("login Successfully.....");
					
					FoodCourt();
				}
				else
				{
					System.out.println("Unable to Login Please Verify Login Details.....");
				}
				break;
			}
			case 3:
			{
				System.out.println("Exit...");
				loop=false;
				break;
			}
			}
		}
		
		
	}

	private static void FoodCourt() {
		
		System.out.println("Welcome to The Food Court ....");
		boolean loop1=true;
		while(loop1)
		{
			System.out.println("Enter 1 to order ....");
			System.out.println("Enter 2 to view orders...");
			System.out.println("Enter 3 to exit ...");
			
			int n=scan.nextInt();
			switch(n)
			{
			case 1:
			{
				System.out.println("Ordering...");
				
				Items item=new Items();
				
				int bill=getItemDetails(item);
				
				System.out.println("Your Order Bill is : "+bill);
				
				
				
				
				break;
			}
			case 2:
			{
				System.out.println("View orders...");
				break;
			}case 3:
			{
				loop1=false;
				
				break;
			}default:
			{
				System.out.println("Enter valid Input...");
			}
			}
		}
		
				
	}

	private static int  getItemDetails(Items item) {
		
		System.out.println("Enter Item no to Order...");
		int bill=0;
		
		boolean loop3 =true;
		while(loop3)
		{
		System.out.println("Item 1 "+ item.item1+" Price : "+item.item1Price);
		System.out.println("Item 2 "+ item.item2+ " Price : "+item.item2Price);
		System.out.println("Item 3 "+ item.item3+" Price : "+item.item3Price);
		System.out.println("Item 4 "+ item.item4+" Price : "+item.item4Price);
		System.out.println("Enter 5 to Go Previous Menu...");
		
		int order=scan.nextInt();
		switch(order)
		{
		case 1:
		{
			
			bill+=item.item1Price;
			break;
		}
		case 2:
		{
			bill+=item.item2Price;
			break;
			
		}case 3:
		{
			bill+=item.item3Price;
			break;
		}
		case 4:
		{
			bill+=item.item4Price;
			break;
		}
		case 5:
		{
			loop3=false;
			break;
		}
		default:
		{
			System.out.println("Enter Valid Input...");
			break;
		}
		}
		}
		return bill;	
		
	}

	private static boolean loginVerification(String userName, String password, ArrayList<User> userDetails) {
		
		for(User u :userDetails)
		{
			if(u.getUsername().equals(userName)&&u.getPassword().equals(password))
			{
				return true;
			}
		}
		return false;
		
	}

	public static User getDetails() {
		
		System.out.println("Enter your name  : ");
		String name=scan.next();
		
		System.out.println("Enter your Age : ");
		int age=scan.nextInt();
		
		System.out.println("Enter your Email : ");
		
		String email=scan.next();

		if(isValidEmail(email))
		{
			System.out.println("Valid Email ");

			
		System.out.println("Enter Your Password  : ");
		String password=scan.next();
		
		System.out.println("Re Enter your Password to confirm : ");
		String confirmPassword=scan.next();
		
		if(password.equals(confirmPassword))
		{
			User user=new User(name,age,email,password,confirmPassword);
			System.out.println("Password Matches.....");
			return user;
			
			
			
		}else
		{
			System.out.println("Password does not Match....");
		}
		
		
		
		}
		else{
			System.out.println("Invalid E-Mail ");
			getDetails();
		}
		return null;
		
		
	}
	public static boolean isValidEmail(String email)
	{
		String regex="^[A-Za-z0-9+_.-]+@(.+)$";
		
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(email);

		return match.find();

	}

}

class User implements Serializable{
	
	private String username;
	private int age;
	private String Email;
	private String Password;
	private String confirmPassword;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public User(String username, int age, String email, String password,String confirmPassword) {
		
		this.username = username;
		this.age = age;
		Email = email;
		Password = password;
		this.confirmPassword=confirmPassword;
	}
	
	
	
}
class Restarunt{
	
	String RestaruntName;
	
	Restarunt(String name)
	{
		this.RestaruntName=name;
	}
	
	
}
	class Items extends Restarunt{
		
		String item1;
		String item2;
		String item3;
		String item4;
		int item1Price;
		int item2Price;
		int item3Price;
		int item4Price;
		
		Items()
		{
			super("C Salt Kitchen....");
			this.item1="Pizza";
			this.item2="Burger";
			this.item3="Ice Cream";
			this.item4="Juice";
			this.item1Price=200;
			this.item2Price=250;
			this.item3Price=150;
			this.item4Price=50;
		}
		 
		
		
		
	}
