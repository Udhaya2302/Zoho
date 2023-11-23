import java.util.*;
class Test1{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter n");
	//int n=5;
	int n=scan.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int sp=0;sp<n-i-1;sp++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
	
	n=(n/2)+1;
	
	 for(int i=0;i<n;i++)
	{
		for(int sp=0;sp<n-i-1;sp++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print(" R");
		}
		System.out.println();
	  }
	  
	  
	 for(int i=1;i<n;i++)
	{
		for(int sp=0;sp<i;sp++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<n-i;j++)
		{
			System.out.print(" R");
		}
		System.out.println();
	  }
	}
	  
	 

}