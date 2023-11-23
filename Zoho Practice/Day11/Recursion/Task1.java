import java.util.Scanner;


class Task1{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the value....");
	int n=scan.nextInt();
	int m=1;
	
	System.out.println(rec(n,m));
	
	}
	public static boolean rec(int n,int m)
	{
		if(n==1||n==m)
		{
			return true;
		}import java.util.Scanner;


class Task1{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the value....");
	int n=scan.nextInt();
	int m=1;
	
	System.out.println(rec(n,m));
	
	}
	public static boolean rec(int n,int m)
	{
		if(n==1||n==m)
		{
			return true;
		}
		if(m>n)
		{
			return false;
		}
		
		
			
			
			
	
		return rec(n,m*4);
	}
}
		if(m>n)
		{
			return false;
		}
		
		
			
			
			
	
		return rec(n,m);
	}
}