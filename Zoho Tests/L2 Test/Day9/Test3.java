import java.util.Scanner;

class Test3{
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

	//int a[][]={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
	
	//int n=4;
	
	int ct=0;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(a[i][j]<0)
			{
				ct++;
			}
		}
	}
	System.out.println(ct);


	
	}
}