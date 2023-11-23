
import java.util.Scanner;

class Test5{

public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter The Array Size...");
	int n=scan.nextInt();
	
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	
	
	for(int i=1;i<n-1;i++)
	{
		if(a[i-1]<a[i]&&a[i]>a[i+1])
		{
			System.out.println("Ans :  "+a[i]);
		}
	}
	
	
	}
	}