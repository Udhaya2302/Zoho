import java.util.*;


class FaceBook{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	boolean loop=true;
	boolean loop1=true;
	
	//ArrayList<User>userDetails=new ArrayList<>();
	
	HashMap<Integer,User>LoginDetails=new HashMap<>();
	
	System.out.println("Welcome to FaceBook Login ...");
	
	while(loop1)
	{
		System.out.println("Enter 1 to Register...");
		System.out.println("Enter 2 to login ...");
		System.out.println("Enter 3 to Exit....");
		
		int m=scan.nextInt();
		if(m==1)
		{
			System.out.println("Welcome to FaceBook ...");
			
			User u=new User();
			userDetails.add(u);
			LoginDetails.put(u.userId,u);
			
			
			
			
			
		while(loop)
		{
			System.out.println("Enter 1 to create Post...");
			System.out.println("Enter 2 Get news Feed...");
			System.out.println("Enter 3 to Follow...");
			System.out.println("Enter 4 to UnFollow ...");
			System.out.println("Enter 5 to Delete Post..");
			System.out.println("Enter 6 to Get news Feed Paginated...");
			System.out.println("Enter 7to Exit ...");	
	 	
			int n=scan.nextInt();
		
				switch(n)
			{
				case 1:
				{
		 			System.out.println("Creating...");
					
					System.out.println("Enter the post ....");
					String s1=scan.next();
					Post p=new Post(s1);
					u.posts.push(p);
					
					break;
				}
				case 2:
				{
					System.out.println("News Feed...");
					for(user u:userDetails)
					{
						
						u.posts
					}
					
					break;
				}
				case 3:
				{
					System.out.println("Follow...");
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
					break;
				}
				case 6:
				{
					System.out.println("Get News Feed Paginated...");
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
					System.out.println("Enter Valid Input....");
				}
			}
		
		}
		}
		else if(m==2)
		{
			System.out.println("Exit...");
			loop1=false;
			
		}
		else{
			System.out.println("Enter valid Input...");
		}
		
		
	}
	
	
	
	
	}

}
class User{
	static int  id=0;
	String name;
	int userId;
	int age;
	String password;
	
	Stack<Post>posts;
	ArrayList<Integer>followers;
	ArrayList<Integer>followee;
	
	User()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your name...");
		this.name=scan.nextLine();
		System.out.println("Enter your Age  ...");
		this.age=scan.nextInt();
		this.userId=++id;
		
		System.out.println("Enter your Password...");
		this.password=scan.next();
		
		this.posts=new Stack<Post>();
		//followers=null;
		//followee=null;	
	}
	
	
	
}

class Post{
	static int id=100;
	
	int  postId;
	String post;
	
	Post(String post){
		
		this.postId=++id;
		this.post=post;
		
	}
	
	
	
}