import java.util.Scanner;

class Task5{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the num of times ....");
		int n=scan.nextInt();
		
		
		int ans=fun(n);
		System.out.println(ans);
		
		
	}

	public static int fun(int n)
	{
		int sum=0;
	
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				sum+=i;
				n=n/i;
			}
		}
		return sum;
	}

}