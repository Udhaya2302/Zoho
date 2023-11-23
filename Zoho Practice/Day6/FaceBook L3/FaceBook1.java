import java.util.*;

class FaceBook1{
	static Scanner scan=new Scanner(System.in);
	static boolean loop1=true;
	
	public static void main(String[] args) {
	
		HashMap <Integer,User>userList=new HashMap<>();
		ArrayList<User>userDetails=new ArrayList<>();
		
		System.out.println("Welcome to the FaceBook App.........");
		
		
		boolean loop=true;
		
		
		while(loop)
		{
			System.out.println("     1	 Register....");
			System.out.println("	 2 	 login....");
			System.out.println("	 3 	 Exit....");
			
			int n=scan.nextInt();
			switch(n)
			{
			case 1:
			{
				System.out.println("Register...");
				User user=getDetails();
				if(user!=null)
				{
					userDetails.add(user);		
				userList.put(user.userId,user);
				System.out.println("Register Successfully....");
				}
				
				break;
			}
			case 2:
			{
				loop1=true;
				System.out.println("Login...");
				System.out.println("Enter the User Name : ");
				String userName=scan.next();
				System.out.println("Enter the Password ...");
				String password=scan.next();
				
				
				User verify=loginVerification(userName,password,userDetails);
				if(verify!=null)
				{
					System.out.println("login Successfully.....");
					
					userLogin(verify,userDetails,userList);
					
					
				}
				else
				{
					System.out.println("Unable to Login Please Verify Login Details.....");
					break;
					
						
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
	private static User loginVerification(String userName, String password, ArrayList<User> userDetails) {
		
		for(User u :userDetails)
		{
			if(u.getUsername().equals(userName)&&u.getPassword().equals(password))
			{
				return u;
			}
		}
		return null;
		
	}
	
	
	public static User getDetails() {
		
		System.out.println("Enter your name  : ");
		String name=scan.next();
		
		System.out.println("Enter your Age : ");
		int age=scan.nextInt();
		
		System.out.println("Enter your Email : ");
		
		String email=scan.next();


			
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
		
		
		return null;
		}
		
		
		public static void userLogin(User user,ArrayList<User>userDetails,HashMap<Integer,User>userList){
			
			while(loop1)
		{
			System.out.println("	 1 to create Post...");
			System.out.println("	 2 Get news Feed...");
			System.out.println("	 3 to Follow...");
			System.out.println("	 4 to UnFollow ...");
			System.out.println("	 5 to Delete Post..");
			System.out.println("	 6 to view Posts...");
			System.out.println("	 7 to Get news Feed Paginated...");
			System.out.println("	 8 to Exit ...");	
	 	
			int n=scan.nextInt();
		
				switch(n)
			{
				case 1:
				{
		 			System.out.println("Creating...");
					
					System.out.println("Enter the post ....");
					scan.nextLine();
					String s1=scan.nextLine();
				
					Post p=new Post(s1);
					user.posts.add(p.post);
					System.out.println(s1);
					
					break;
				}
				case 2:
				{
					System.out.println("News Feed...");
					
					System.out.println(user.followers.size());
					
					break;
				}
				case 3:
				{
					System.out.println("Follow...");
					
					
					
					user.following.add(follow(user,userDetails,userList));
					System.out.println("Followed Successfully...");
					
					
					
					
					break;
				}
				case 4:
				{
					System.out.println("Unfollow...");
					break;
				}
				case 5:
				{
					System.out.println("Delete Post...");
					
					int postId=deletePost(user);
					user.posts.remove(postId-1);
					System.out.println("Post Removed Successfully.....");
					
					break;
				}
				case 6:
				{
					System.out.println("To see All the Posts That You have Posted...");
					
					viewPost(user);
					
					
					break;
				}
				case 7:
				{
					System.out.println("Get News Feed Paginated...");
					break;
				}
				case 8:
				{
					System.out.println("Exit...");
					loop1=false;
					break;
				}
				default : 
				{
					System.out.println("Enter Valid Input....");
					break;
				}
			}
		
		}
		}
		
		
		public static int deletePost(User user)
		{	int i=0;
			for(String p: user.posts)
			{
				
				System.out.println(++i + "  ->  " +p);
			}
			System.out.println("Enter post id to remove...");
			int n=scan.nextInt();
			return n;
		}
		
		
		public static void viewPost(User user)
		{	int i=0;
			for(String p: user.posts)
			{
				
				System.out.println(++i + "  ->  " + p );
			}
			
		}
		public  static User follow(User user, ArrayList<User>userDetails,HashMap<Integer,User>userList)
		{
			int i=0;
			for(User u:userDetails)
			{
				System.out.println(++i +" -> "+ u.getUsername());
			}
			System.out.println("Enter Id to Follow ...");
			int id=scan.nextInt();
			
			
			User toFollow=userList.get(id-1);
			
			toFollow.followers.add(user);
			
			//followerCount++;
			
			//User u=userDetails.get(id-1);
			
			return toFollow;
			
		}
		
		

	}
	
	class User{
		Scanner scan=new Scanner(System.in);
	static int id=0;
	int userId;
	private String username;
	private int age;
	private String Email;
	private String Password;
	private String confirmPassword;
	int followerCount;
	ArrayList<User>followers;
	ArrayList<User>following;
	ArrayList<String>posts;

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
		this.userId=++id;
		followers=new ArrayList<>();
		following=new ArrayList<>();
		posts=new ArrayList<>();
		followerCount=0;
	}
	
	
		
}

class Post{
	static int id=100;
	String post;
	int postid;
	
	Post(String post)
	{
		this.post=post;
		this.postid=++id;
	}
	
}
	