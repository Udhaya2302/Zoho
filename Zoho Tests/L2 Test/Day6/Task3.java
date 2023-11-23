import java.util.Scanner;

class Test2{

public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter The Array Size...");
	int n=scan.nextInt();
	
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	
	System.out.println("Enter the sum...");
	int sum=scan.nextInt();
	
	int close=0;
	int min=0;
	int val=1000;
	int ival=0;
	int jval=0;
	
	for(int i=0;i<n-1;i++)
	{
		min=a[i]+a[i+1];
		
		int close=Math.abs(sum-min);
		
		if(val>close)
		{
			val=close;
			ival=a[i];
			jval=a[i+1];
		}
		
	}
	System.out.println(ival+jval)
	
	
	
}
	
}