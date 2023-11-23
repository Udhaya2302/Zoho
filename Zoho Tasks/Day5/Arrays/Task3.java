import java.util.Scanner;

class Task3{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int[] a=new int[n];
	int i,j;

	for(i=0;i<n;i++)

	{
		a[i]=scan.nextInt();
	}
	System.out .println("Enter the Target Value...");

	int target=scan.nextInt();

	for(i=0;i<n;i++)
	{
		for(j=i;j<n;j++)
		{
			if(a[i]+a[j]==target)
			{
				System.out.println(a[i]+"+"+a[j]+"="+(a[i]+a[j]));
			}	
		}
	}
}
}