import java.util.Scanner;

class Test2{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Matrix size...");
	int n=scan.nextInt();
	
	int a[][]=new int [n][n];

	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j]=scan.nextInt();
		}
	}	

 
	//int a[][]={{1,2,3},{3,1,2},{2,3,1}};
	//int n=3;
	int b[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		b[i]=i+1;
	}
	
	
	
	
	
	int sum=0;
	for(int i=0;i<n;i++)
	{
		sum+=fun(a[i],b);
	}	
	
		if(sum/n==n)
		{
			System.out.println(true);
		}else
		{
			System.out.println(false);
		}

	}
	
	public static int  fun (int a[],int b[])
	{
		int ct=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					ct++;
					break;
				}
			}
		}
		return ct;
	}
	
}