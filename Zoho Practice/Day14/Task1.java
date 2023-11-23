import java.util.Scanner;

class Task1{

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter rows values...");
	int n=scan.nextInt();
	System.out.println("Enter cols values...");
	int m=scan.nextInt();
	
	int a[][]=new int[n][m];
	
	System.out.println("Enter the no of values...");
	
	int num=scan.nextInt();
	
	for(int i=0;i<num;i++)
	{
		System.out.println("Enter the values ");
		int x=scan.nextInt();
		
		int y=scan.nextInt();
		
		fun(a,x,y);
		
	}
	
	int ct=0;

	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(a[i][j]%2==1)
			{
				ct++;
			}
		}
		
	}
	
	System.out.println("Ans : "+ ct);
	
	
	}
	
	public static void fun(int a[][],int x,int y)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==x||j==y)
				{
					a[i][j]+=1;
				}
			}
		}
	
		a[x][y]++;
		
	}

}