import java.util.*;

 class LibrayManagement{
	
	static ArrayList<Admin>admin=new ArrayList<>();
	static ArrayList<Book>bookList=new ArrayList<>();
	static ArrayList<Member>userList=new ArrayList<>();
	
	
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args){
		
		admin.add(new Admin("abc","123"));

		while(true)
		{
			System.out.println("\t 1 -> Admin..");
			System.out.println("\t 2 -> Member..");
			System.out.println("\t 3 -> Exit..");
			
			int n=scan.nextInt();
			
			switch(n)
			{
				case 1:
					admin();
					break;
				case 2:
					member();
					break;
				case 3:
					return;
				default:
					System.out.println("Enter Valid Input...");
			}
			}
	}
	
	public static void member()
	{
		System.out.println("Enter the User name : ");
		String name=scan.next();
		
		System.out.println("Enter the User Password : ");
		String password=scan.next();
		
		
		Member valid=verifyUser(name,password);
		
		if(valid!=null)
		{
			boolean loop3=true;
			while(loop3){
			System.out.println("\t 1-> Search Book");
			System.out.println("\t 1-> Issue book");
			System.out.println("\t 1-> Return Book");
			
			int bookopt=scan.nextInt();
			
			switch(bookopt)
			{
			
			case 1:
				searchBook();
				break;
			case 2:
				issueBook(valid);
				break;
			case 3:
				returnBook(valid);
				break;
			case 4:
				loop3=false;
				break;
			default:
				System.out.println("Enter the valid Input ...");
			}
		}
		}
		
		
	}
	
	public static void returnBook(Member m)
	{
		System.out.println("Enter the Book Id");
		int bookId=scan.nextInt();
		
		
		
		for(Book b:bookList)
		{
			if(b.Bid==bookId)
			{
				b.count++;
				
				System.out.println("Book Returned Successfully...");
				return;
			}
		}
	}
	
	
	
	public static void issueBook(Member m)
	{
		System.out.println("Enter the Book Id...");
		int BookId=scan.nextInt();
		
		if(m.books.size()>=6)
		{
			System.out.println("Sorry Maximum Book is Reached....");
			return;
		}
		else{
		
		for(Book b:bookList)
		{
			if(b.Bid==BookId)
			{
				if(b.count>0)
				{
				b.count--;
				m.books.add(BookId);
				
				System.out.println("Book Issued Successfully...");
				return;
				}
				else{
					System.out.println("unable to give...");
				}
			}
			else{
				System.out.println("Sorry The Book is Not available in the library...");
				return;
			}
		}
		
		}
	}
	
	public static void searchBook()
	{
		for(Book b:bookList)
		{
			System.out.println("Book Id : "+b.Bid+" Book Name"+b.title+" Author  :"+b.author);
		}
	}
	
	public static  Member verifyUser(String name,String password)
	{
		for(Member u:userList )
		{
			if(u.name.equals(name) && u.password.equals(password))
			{
				return u;
			}
		}
		return null;
	}
	
	
	public static void admin(){
		
		
		System.out.println("Enter your User Id...");
		String name=scan.next();
		System.out.println("Enter your Password...");
		String password=scan.next();
		
		boolean ans=verify(name,password);
		
		if(ans==true)
		{
			boolean loop2=true;
			while(loop2){
			System.out.println("\t 1-> Add new Book");
			System.out.println("\t 2-> RemoveBook");
			System.out.println("\t 3-> List Book");
			System.out.println("\t 4-> add new User");
			System.out.println("\t 5-> Remove user");
			System.out.println("\t 6->  List of User..");
			System.out.println("\t 7->  Exit..");
			
			int adminopt=scan.nextInt();
			
			switch(adminopt)
			{
				case 1:
					addNewBook();
					break;
				case 2:
					removeBook();
					break;
				case 3:
					printBookList();
					break;
				case 4:
					addNewUser();
					break;
				case 5:
					removeUser();
					break;
				case 6:
					printUserList();
					break;
				case 7: 
				{
					loop2=false;
					break;
				}
				default:
					System.out.println("Invalid Input..");
					
			}	
		}
		
	}
	else{
		System.out.println("Invalid input...");	
		}
	}
	
	public static void printUserList()
	{
		for(Member m: userList)
		{
			System.out.println("User Id : "+m.uid+" User Name : "+m.name +" Age : "+ m.age+" Gender : "+m.gender);
		}
	}
	
	
	public static void removeUser(){
		
		System.out.println("Enter the user Id ...");
		int userid=scan.nextInt();
		
		for(Member m:userList)
		{
			if(m.uid==userid)
			{
				
				userList.remove(m);
				System.out.println("Member "+userid +"Removed Successfully....");
				return;
			}
		}
		
		
	}
	
	
	public static void addNewUser()
	{
		Member m=new Member();
		
		userList.add(m);
		System.out.println("Member Added Successfully....");
	}	
	
	
	public static void removeBook()
	{
		System.out.println("Enter Book Id to remove...");
		int removeId=scan.nextInt();
		
		for(Book b:bookList)
		{
			if(b.Bid==removeId)
			{
				Book Remove =b;
				bookList.remove(Remove);
				System.out.println("Member "+removeId +"Removed Successfully....");
				return;
			}
		}
	}
	
	
	public static void printBookList()
	{
		for(Book b:bookList)
		{
			System.out.println("Book Id : "+b.Bid+" Author "+ b.author+" count : "+b.count);
		}
	}
	
	
	public static void addNewBook(){
		
		Book book=new Book();
		
		bookList.add(book);
		System.out.println("Book added Successfully....");
		
	}
	
	
	public static boolean verify(String name,String password)
	{
		for(Admin a: admin)
		{
			if(a.name.equals(name)&& a.password.equals(password))
			{
				return true;
			}
		}
		return false;
	}
	


}



class Admin{
	
	String name;
	String password;
	
	Admin(String name,String password)
	{
		this.name=name;
		this.password=password;
	}
	
}

class Member{
	static int id=0;
	int uid;
	String name;
	String password;
	int age;
	String gender;
	String date;
	ArrayList<Integer> books;
	
	Member()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name..");
		this.name=scan.nextLine();
		System.out.println("Enter the password..");
		this.password=scan.nextLine();
		System.out.println("Enter the age..");
		this.age=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the gender..");
		this.gender=scan.nextLine();
		System.out.println("Enter the date..");
		this.date=scan.nextLine();
		this.uid=++id;
		this.books=new ArrayList<>();
	}
	
}
class Book{
	
	static int id=0;
	String title;
	String desc;
	String author;
	String date;
	int price;
	int count;
	int Bid;
	
	Book()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("\n Title ");
		this.title=scan.next();
		
		System.out.println("\n Desc ");
		this.desc=scan.next();
		
		System.out.println("\n author");
		this.author=scan.next();
		
		System.out.println("\n publication date ");
		this.date=scan.next();
		
		System.out.println("\n price ");
		this.price=scan.nextInt();
		
		System.out.println("\n Count ");
		this.count=scan.nextInt();
		
		this.Bid=++id;
	}
	
	
	
}