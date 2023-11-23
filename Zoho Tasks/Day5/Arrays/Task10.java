import java.util.Scanner;

class Task10{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int a[]=new int[n];
	int i,j;

	System.out.println("Enter the Array Elements....");
	for(i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	for(i=0;i<n;i++)
	{
		for(j=i;j<n;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}

	int sum=0;

	for(i=0;i<n;i++)
	{
		sum*=10;
		sum+=a[i];
		
	}

	System.out.println("Largest number using the said array numbers : "+sum);
	
	


}
}