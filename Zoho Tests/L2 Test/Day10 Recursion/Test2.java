import java.util.Scanner;

class Test3{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the array size....");
		int m=scan.nextInt();
		
		int a[]=new int[m];
		
		for(int i=0;i<m;i++)
		{
			a[i]=scan.nextInt();
		}
		
		
		
		int n=a.length;
		int sum=((n*(n+1))/2);
		System.out.println(sum);
		
		int total= fun(a,0,0);
		
		int ans=sum-total;
		
		System.out.println("Missing : "+ans);
	
	}
	public static int fun(int a[],int n,int sum)
	{
		
		if(n==a.length)
		{
			return sum;
		}
		
		return sum+=a[n]+fun(a,n+1,sum);
		
		
	}
	
	
	}
	