import java.util.Scanner;

class Task4{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the num ...");
		int n=scan.nextInt();
		
		int ans=fun(n);
		System.out.println(ans);
		
		
	}
	
	public static int fun(int n){
		
		if(n==0)
		{
			return 0;
		}
		else if(n==1||n==2)
		{
			return 1;
		}
		
		int [] memo=new int[n+1];
		memo[0]=0;
		memo[1]=1;
		memo[2]=1;
		
		return helper(n,memo);
		
	//	return fun(n-1)+fun(n-2)+fun(n-3);
		
		
	}
	public static int helper(int n,int memo[])
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1||n==2)
		{
			return 1;
		}
		
		
		if(memo[n]!=0)
			return memo[n];
		
		memo[n]=helper(n-1,memo)+helper(n-2,memo)+helper(n-3,memo);
		
		return memo[n];
	}


}