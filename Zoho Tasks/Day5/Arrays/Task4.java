import java.util.Scanner;

class Task4{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int i,j;
	int a[]=new int[n];

	for(i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}

	for(i=0;i<n;i++)
	{
	int ct=0;
		for(j=i;j<n;j++)
		{
			if(a[i]<a[j])
			{
				ct++;
			}
		}
		if(ct==0)
		{
			System.out.println(a[i]);
		}
	}
}
}