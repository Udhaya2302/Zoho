import java.util.Scanner;

class Task2{

public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int i,j;
	int a[][]=new int[n][n];
	int b[][]=new int[n][n];
	System.out.println("Enter the 1st Array Elements  ...");
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j]=scan.nextInt();
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(" "+a[i][j]);
		}
		System.out.println(" ");
	}
	
	System.out.println("Enter the 2 nd Array Elements  ...");

	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			b[i][j]=scan.nextInt();
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(" "+b[i][j]);
		}
		System.out.println(" ");
	}


	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j]+=b[i][j];
		}
	}

	System.out.println("Addition of two Arrays...");

	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(" "+a[i][j]);
		}
		System.out.println(" ");
	}
}

}