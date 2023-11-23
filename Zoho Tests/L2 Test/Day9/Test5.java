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
	}
	}