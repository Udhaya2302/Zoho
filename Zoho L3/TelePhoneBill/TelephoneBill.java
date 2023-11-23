

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneBill {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Welcome to Telephone Bill Generator Application.....");
		
		ArrayList <User>userDetails=new ArrayList<User>();
		
		File file=new File("C:\\Users\\Administrator\\Documents\\Zoho L3UserDetails.txt");
		
		//ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file,true));
		
	    //ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file)); 
		
		FileWriter fw=new FileWriter(file);
		try (BufferedReader bfd = new BufferedReader(new FileReader(file))) {
			boolean loop=true;
			while(loop)
			{ 
				System.out.println("Enter 1 to generate Bill ....");
				System.out.println("Enter 2 Display...");
				System.out.println("Enter 3 to Exit...");
				
				int n=scan.nextInt();
				
				switch(n) {
				case 1:
				{
					System.out.println("Enter the User name...");
					String name=scan.next();
					
					System.out.println("Enter the Usage in mins ...");
					int usage=scan.nextInt(); 
					
					User user=new User(name,usage);
					
					int bill=generateBill(user.getUsage());
					
					user.setBill(bill);
					System.out.println(bill);
					userDetails.add(user);
					
					fw.write(" user Name : "+user.getName()+" Usage : "+user.getUsage()+" Bill : "+user.getBill());
					fw.close();
					//oos.writeObject(user);
					//oos.close();
					
					break;
				}
				case 2: 
				{
					System.out.println("Displaying....");
					System.out.println("Enter name to display....");
					String name=scan.next();
					String str="";
					
					while((str=bfd.readLine())!=null)
					{
						System.out.println("Name   Usage   Bill" );
						if(str.startsWith(name))
						{
							System.out.println( str );
						}
						
					}
					//ArrayList<User> users1=new ArrayList<User>(); 
					//users1=(ArrayList<User>) ois.readObject();  
					//ois.close();
					
					display(userDetails);
					break;
				}
				case 3:
				{
					System.out.println("Exit....");
					loop=false;
					break;
				}
				default:
				{
					System.out.println("Invalid Input......");
				}
				}
			}
		}
		
		
	}

	private static void display(ArrayList<User> userDetails) {
		for(User u:userDetails)
		{
			System.out.println(u.getName()+"  "+u.getUsage()+ " "+ u.getBill());
			
		}
		
	}

	public static int  generateBill(int usage) {
		
		int price=2;
		
		usage=price*usage;
		return usage;
		
	
		
	}
}

class User implements Serializable{
	private String name;
	private int usage;
	private int bill;
	
	User(String name, int usage){
		 this.setName(name);
		 this.setUsage(usage);
		 this.setBill(0);
		 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUsage() {
		return usage;
	}

	public void setUsage(int usage) {
		this.usage = usage;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}
	
}