import java.util.Scanner;

public class Task1{

public static void main(String[] args)
{
	Scanner scan=new  Scanner(System.in);
	System.out.println("Enter the Array Size... ");
	int n=scan.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the Array Elements...");

	for(int i=0;i<n;i++)

	{
		a[i]=scan.nextInt();

	}



	for(int i=0;i<n;i++)
	{
		for(int j=i;j<n;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}

		}
	}

	System.out.println("The Sorted Array...");

	for(int i=0;i<n;i++)

	{
		System.out.println(a[i]);

	}

}
}