import java.util.Scanner;

class Test4{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	
	System.out.println("Enter the Matrix row size...");
	int n=scan.nextInt();
	System.out.println("Enter the Matrix col size...");
	int m=scan.nextInt();
	
	
	int a[][]=new int [n][m];

	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			a[i][j]=scan.nextInt();
		}
	}
	
	
	//int a[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
	
	//int n=4;
	//int m=3;
	int b[]=new int[n*3];
	int c[]=new int[n*3];
	int x=0;
	int y=0;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(a[i][j]==0)
			{
				b[x++]=i;
				c[y++]=j;
			}
		}
	}
	
	for(int i=0;i<x;i++)
	{
		fun(a,b[i],c[i]);
	}
	
	for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}
	
	
	
	public static void fun(int a[][],int x,int y)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==x||j==y)
				{
					a[i][j]=0;
				}
			}
		}
	}
}