import java.util.Scanner;

class Task5{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Array Size...");
	int size=scan.nextInt();
	int i,j;
	int a[]=new int[size];

	for( i=0;i<size;i++)
	{
		a[i]=scan.nextInt();
	}

	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(a[i]<a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
	}
	System.out.println("Array in Descending order...");

	for( i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
}
}