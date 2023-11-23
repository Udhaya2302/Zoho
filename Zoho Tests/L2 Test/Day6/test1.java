
import java.util.Scanner;

class Test1{

public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter The Array Size...");
	int n=scan.nextInt();
	
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	
	int ct=0;
	int rep=0;
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]==a[j])
			{
				ct++;
				rep=a[i];
				break;
			}
			
		}
		if(ct==1)
		{
			break;
		}
	}
	System.out.println(" Repeating... : "+rep);
	
	int max=0;
	int min=1000;
	
	for(int i=0;i<n;i++)
	{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
	}
	
	//System.out.println(max +""+min);
	ct=0;
		for(int j=min;j<max;j++)
		{
			ct=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]==j)
			{
				ct++;
			}
			
			}
		if(ct==0)
			{
				System.out.println(" Missing : "+j);
			}
	}
	
} 
}