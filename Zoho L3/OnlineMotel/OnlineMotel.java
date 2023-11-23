import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


class OnlineMotel{
	
	static Scanner scan=new Scanner(System.in);	
	static ArrayList<UserSignIn>userDetails=new ArrayList<>();
	static ArrayList<Room>roomsList=new ArrayList<>();
	static ArrayList<User>bookingList=new ArrayList<>();
	
	static int roomId=0;
	
	
	public static void main(String[] args){
		
	System.out.println("\tWelcome to ABC Motel...");
	
	for(int i=0;i<20;i++)
	{
		if(i%2==0)
		{
			roomsList.add(new Room(1,"Ac",2,++roomId,true));
		}else{
			roomsList.add(new Room(1,"NonAc",1,++roomId,true));
		}
	}
	String path="C:\\Users\\Administrator\\Documents\\Zoho L3\\OnlineMotel\\RoomsListdb.txt";
			File createFile=new File(path);
			
	//...........	
		try
		{
		FileWriter fw=new FileWriter(path);
		for(Room r: roomsList)
		{
			fw.write((" "+r.roomNo+" "+ r.ac+" "+r.noOfBed+" "+r.available+"\n"));
		}
		fw.close();
		}	
		catch(IOException e){
		System.out.println(e.getMessage());
	}

	boolean loop=true;
	
	while(loop)
	{
		System.out.println("\t 1-> Sign up ...");
		System.out.println("\t 2-> Sign in ...");
		System.out.println("\t 3-> Exit ...");
		
		int userOpt=scan.nextInt();
		scan.nextLine();
		
		switch(userOpt)
		{
			case 1:
				System.out.println("Sign in"); 
				signIn();
				break;
			case 2:
				System.out.println("Sign up");
				signUp();
				break;
			case 3:
				System.out.println("Sign in");
				break;
			default:
				System.out.println("Enter valid Input ...");
				break;
		}
	}
		
		
		
		
	}
	
	// Sign Up...........................
	public static void signUp(){
		System.out.println("Enter your User Id ...");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter your password ...");
		String password=scan.nextLine();
		
		UserSignIn u=validateUser(id,password);
		
		if(u!=null)
		{
			boolean loop1=true;
			while(loop1)
			{
			System.out.println("\tWelcome to Hotel..\n.");
			System.out.println("\t 1 -> Booking...");
			System.out.println("\t 2 -> change Rooms");
			System.out.println("\t 3 -> Rooms Availability..");
			
			int opt=scan.nextInt();
			
			switch(opt)
			{
				case 1: 
				System.out.println("Booking...");
				 booking(u);
				break;
				case 2: 
				System.out.println("Booking...");
				break;
				case 3: 
				System.out.println("Rooms View ...");
				for(Room r: roomsList)
				{
					System.out.println("No : "+r.roomNo+" Ac : "+r.ac+" Beds : "+r.noOfBed);
				}
				break;
				default:
					System.out.println("Invalid Input....");
					break;
			}
		
			}
			
		}
		else{
			System.out.println("Invalid User Details...");
		}
	}
	public static void booking(UserSignIn u)
	{
		User bookUser=new User();
		for(Room r: roomsList)
		{
			if(bookUser.ac.equals(r.ac) && bookUser.peoples==r.noOfBed && r.available==true)
			{
				bookUser.alloted=r.roomNo;
				r.available=false;
				bookingList.add(bookUser);
			}
		}
		
		
	}
	
	
	// Validate User.............................................
	public static UserSignIn validateUser(int id,String password)
	{
		String encPwd=encPwd(password);
		for(UserSignIn u : userDetails)
		{
			if(u.uid==id && u.encPwd.equals(encPwd))
			{
				return u;
			}
		}
		return null;
		
	}
	// Password Encryption.......................
	public static String encPwd(String s)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char temp=s.charAt(i);
			
			{
				sb.append((char) (temp+1));
			}
		
		}
		
		return sb.toString();
	}
	
	// sign In....................................................................
	public static void signIn()
	{
		System.out.println("Enter your name ..");
		String name=scan.nextLine();
		System.out.println("Enter your Password ..");
		String password=scan.nextLine();
		System.out.println("Enter Re Enter Password..");
		String confirm=scan.nextLine();
		System.out.println("Enter your Aadhar Number...");
		String Aadhar=scan.nextLine();
		
		boolean validate=validatePassword(password,confirm);
		//System.out.println(validate);
		if(validate)
		{
			System.out.println("Sign In Successfully....");
			UserSignIn user =new UserSignIn(name,password,Aadhar);
			userDetails.add(user);
			System.out.println("Your Id id : "+ user.uid);
			String path="C:\\Users\\Administrator\\Documents\\Zoho L3\\OnlineMotel\\bookingdb.txt";
			File createFile=new File(path);
			
	//...........	
		try
		{
		FileWriter fw=new FileWriter(path,true);
		//BufferedWriter bfd=new BufferedWriter(fw);
		for(UserSignIn u: userDetails)
		{
			fw.write(("Name -> "+u.name+" Aadhar -> "+ u.Aadhar+"  Password -> "+u.encPwd+"\n"));
		}
		
		//bfd.close();
		fw.close();
		}	
	catch(IOException e){
		System.out.println(e.getMessage());
	}
	//...........		
		}
		else{
			System.out.println("Password MisMatch...");
			return;
		}
		
	}
	// Validate Password...........................................
	public static boolean validatePassword(String password,String confirm)
	{
		if(password.equals(confirm))
		{
			return true;
		}
		else
		{
			return false;
			
		}
	}

}
class Room{
	int floorNum;
	String ac;
	int noOfBed;
	int roomNo;
	boolean available;
	
	Room(int floorNum,String ac,int noOfBed,int roomNo,boolean available){

		this.floorNum=floorNum;
		this.ac=ac;
		this.noOfBed=noOfBed;
		this.roomNo=roomNo;
		this.available=available;
		
	}

} 
class User{
	
	Scanner scan=new Scanner(System.in);
	
	String name;
	String Aadhar;
	String mobileNo;
	int peoples;
	String ac;
	Date dateOfStay;
	String timeToFreeze;
	String prefered;
	int alloted;
	
	User()
	{
		System.out.println("Enter your name...");
		this.name=scan.nextLine();
		System.out.println("Enter your Aadhar No : ");
		this.Aadhar=scan.nextLine();
		System.out.println("Enter your Mobile No : ");
		this.mobileNo=scan.nextLine();
		System.out.println("EnterNo of Peoples Stay : ");
		
		this.peoples=scan.nextInt();
		System.out.println("EnterNo of Peoples Stay : ");
		this.ac=scan.next();
		
		System.out.println("Enter Date to Freeze  (DD-MM-YYYY): ");
		String userDate=scan.nextLine();
		this.timeToFreeze=scan.nextLine();
		System.out.println("Enter preferable Room ");
		this.prefered=scan.next();
		this.alloted=-1;
		
		
	//	DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
		//this.dateOfStay = df.parse(userDate);
		
		
		
	}	
	
}
class UserSignIn
{
	static int id=0;
	String name;
	String Aadhar;
	String password;
	String encPwd;
	int uid=++id;

	
	UserSignIn(String name,String password,String Aadhar)
	{
		this.name=name;
		this.password=password;
		this.Aadhar=Aadhar;
		this.encPwd=encPwd(password);
		System.out.println(encPwd);
		
	}
	public String encPwd(String s)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char temp=s.charAt(i);
			//if(temp!='Z'||temp!='z')
			{
				sb.append((char) (temp+1));
			}
		
		}
		
		return sb.toString();
	}
	
	
}