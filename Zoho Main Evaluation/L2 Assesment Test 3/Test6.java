import java.util.*;
class Test6{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter num");
	int n=scan.nextInt();
	
	while(true)
	{
		int ans=square(n);
		
		if(ans==1)
		{
		System.out.println("Happy Number...");
		break;
		}
		if(ans==2||ans==4)
		{
			System.out.println("Not a happy Number..");
			break;
		}
		n=ans;
		
	}
	
	
	}
	public static int square(int n)
	{
		int a[]=new int[10];
		int ct=0;
		int sum=0;
		int m=n;
		while(n!=0)
		{
			n=n/10;
			ct++;
		}
		n=m;
		for(int i=0;i<ct;i++)
		{
			a[i]=n%10;
			n=n/10;
		}
		n=m;
		for(int i=0;i<ct;i++)
		{
			sum+=a[i]*a[i];
		}
		return sum;
	}


}