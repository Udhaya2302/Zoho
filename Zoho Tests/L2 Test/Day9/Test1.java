import java.util.Scanner;

class Test1{
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
	
	
	//int a[][]={{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
	
	//int n=4;
	
	int ct=0;
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j||(i+j)==(n-1))
			{
				if(a[i][j]==0)
				{
					
					ct++;
					//System.out.println(a[i][j]+" aa"+ct);
				}
			}
		}
	}		
	
	if(ct==0)
	{
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}
	

	}
}