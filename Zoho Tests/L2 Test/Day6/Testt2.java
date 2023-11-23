
import java.util.Scanner;

class Testt2{

public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter The Array Size...");
	int n=scan.nextInt();
	
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	
	int max=0;
	
	for(int i=0;i<n;i++)
	{
		int b[]=rotate(a,n);
		
			int sum=pro(b,n);
			
			if(max<sum)
			{
				max=sum;
			}
			
		
	}
	System.out.println(max);
	}
	
	
	public static int[] rotate(int a[],int n)
	{
		int m=n;
		int j=0;
		//for(int i=0;i<n;i++)
		{
			int temp=a[0];
			
			for(j=1;j<m;j++)
			{
				a[j-1]=a[j];
				
				
			}
			j--;
			
			a[j]=temp;
			
		}
		return a;
	}

	public static int pro(int a[],int n)
	{
		int prod=1;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			prod=1;
			
				prod=a[i]*i;
				sum=sum+prod;
				//System.out.print(a[i]);
		}
		//System.out.println();
		return sum;
	}
	
	
	}