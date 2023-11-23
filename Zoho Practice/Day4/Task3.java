import java.util.Scanner;

import java.util.Scanner;

class Task3{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int a[]=new int[n];

	
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}

	int ct=0;
	for(int i=0;i<n;i++)
	{	ct=0;
		for(int j=0;j<n;j++)
		{
			if(a[i]==a[j])
			{
				ct++;
			}
			
		}
			if(ct==1)
			{
				
				System.out.println("  "+ a[i]);
			}
	}

}
}	