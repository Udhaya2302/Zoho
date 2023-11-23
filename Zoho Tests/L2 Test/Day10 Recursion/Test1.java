import java.util.Scanner;

class Test1{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the num....");
		int n=scan.nextInt();
		
		fun(n,4);
	
	}
	public static void fun(int n,int pow)
	{
		
		if(n==1)
		{
			System.out.println(true);
			return ;
		}
		
		if(n==pow)
		{
			System.out.println(true);
			return;
			
		}
		
		if(pow>n)
		{
			System.out.println(false);
			return;
		}
		fun(n,pow*4);
		
		
	}
}