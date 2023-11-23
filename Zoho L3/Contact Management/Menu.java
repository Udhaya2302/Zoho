
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		ArrayList<Contact>contactList=new ArrayList<Contact>();

		System.out.println("Welcome to the Contact Management System...");
		boolean loop =true;
		
		while(loop)
		{
			System.out.println("Enter 1 call...");
			System.out.println("Enetr 2 Add Contact....");
			System.out.println("Enter 3 to Search Contact...");
			System.out.println("Enter 4 to Delete Contact...");
			System.out.println("Enter 5 to Update Contact...");
			System.out.println("Enter 6 to view Call History...");
			System.out.println("Enter 7 to Exit.....");
			
			int n=scan.nextInt();
			
			switch(n)
			{
				case 1:
				{
					System.out.println("Calling ");
					System.out.println("Enter name to search the Contact ....");
					String name=scan.next();
					if(toCall(name,contactList))
					{	
						System.out.println("Calling........");
						System.out.println();
						
					}
					else
					{
						System.out.println("The Contact Was not in your contact List......");
					}

					
					
					break;
				}
				case 2:
				{
					System.out.println("Enter the phone num ...");
					String num=scan.next();
					System.out.println(num);
					System.out.println("Enter the name....");
					String s1=scan.next();
					System.out.println(s1);
					Contact c=new Contact(s1,num);
					contactList.add(c);
					System.out.println("Added Successfully...");
					
							
					break;
				}
				case 3:
				{
					System.out.println("Searching   ");
					System.out.println("Enter name to search the Contact ....");
					String name=scan.next();
					if(!toSearch(name,contactList))
					{
						System.out.println("The name Not in your Contact List....");
						System.out.println();
					}
					
					break;
				}
				case 4: 
				{
					System.out.println("Deleting...");
					System.out.println("Enter the name to Delete....");
					String name=scan.next();
					Contact c=toDelete(name,contactList);
					if(c!=null)
					{
						contactList.remove(c);
						System.out.println("Deleted Successfully.....");
					}else
					{
						System.out.println("Enter valid Contact Name.....");
					}
						
					
					break;
					
				}
				case 5:
				{
					System.out.println("Updating...");
					System.out.println("Enter name to Change....");
					String oldName=scan.next();
					System.out.println("Enter new Name ");
					String newName=scan.next();
					if(toUpdate(oldName,newName,contactList))
					{
						System.out.println("Name Changed Successfully.....");
					}
					else
					{
						System.out.println("Unable to change .....");
					}
					break;
					
				}
				case 6:
				{
					System.out.println("Display Call History....");
					System.out.println("Enter Name to view ");

					String name=scan.next();
					if(history(name,contactList))
					{
						System.out.println("Success");	
					}else
					{
						System.out.println("No such Contact is Present...");
					
					}
					
					break;
				}
				case 7:
				{
					System.out.println("Exit...");
					loop=false;
					break;
				}
				default : 
				{
					System.out.println("Enter the valid Input...");
				}
			}
		}
	}

	public static boolean history(String name,ArrayList<Contact>contactList)
	{
		for(Contact c: contactList)
		{
			if(c.getName().equals(name))
			{
				System.out.println("Name : "+c.getName()+" Num : "+ c.getNumber()+" Count : "+c.count);
				return true;

			}

		}
		return false;


	}

	public static boolean toUpdate(String oldName, String newName, ArrayList<Contact> contactList) {
		for(Contact c:contactList)
		{
			if(c.getName().equals(oldName))
			{
				c.setName(newName);
				return true;
			}
		}
		return false;
		
	}

	public static Contact toDelete(String name, ArrayList<Contact> contactList) {
		
		for(Contact c:contactList)
		{
			if(c.getName().equals(name))
			{
				
				return c;
			}
		}
		return null;
		
	}

	public  static boolean toSearch(String name, ArrayList<Contact> contactList) {
		
		
			for(Contact c:contactList)
			{
				
				if(c.getName().equals(name))
				{
					System.out.println("Name  :  "+c.getName()+":  Number  : "+ c.getNumber());
					return true;
				}
			}
			return false;
		
		
	}
	public  static boolean toCall(String name, ArrayList<Contact> contactList) {
		
		
			for(Contact c:contactList)
			{
				
				if(c.getName().equals(name))
				{
					System.out.println("Name  :  "+c.getName()+":  Number  : "+ c.getNumber());
					c.count+=1;
					return true;
				}
			}
			return false;
		
		
	}
	

}

class Contact{
	
	private String number ;
	private String name;
	int count;
	
	Contact(String name,String number)
	{
		this.setName(name);
		this.setNumber(number);
		this.count=0;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}


