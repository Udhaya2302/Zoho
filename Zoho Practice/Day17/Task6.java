import java.util.Scanner;

class Task6{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Low Num ...");
	int low=scan.nextInt();
	
	System.out.println("Enter the high Num ...");
	
	int high=scan.nextInt();
	
	for(int i=low;i<=high;i++)
	{
		boolean digits=fun1(i);
		
		if(digits==true)
		{
			 System.out.println(i);
		}
		
	}
	
	
	
	}
	//public static boolean fun(int n)
	public static boolean fun1(int n)
	{
		int ct=0;
		int m=n;
		while(n!=0)
		{
			ct++;
			n=n/10;
		}
		
		if(ct%2!=1)
		{
		int temp=0;
		int sum=0;
		
		for(int i=0;i<ct/2;i++)
		{
			temp+=m%10;
			m=m/10;
		}
		//System.out.println("M is : " + m);
		for(int i=0;i<ct/2;i++)
		{
			sum+=m%10;
			m=m/10;
		}
		
		if(temp==sum)
			return true;
		else
			return false;
		}
		return false;
	}



}