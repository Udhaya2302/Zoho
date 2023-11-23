import java.util.Scanner;

class Task5{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the no of rows...");
		int n=scan.nextInt();
		System.out.println("Enter the no of cols...");
		int m=scan.nextInt();
		
		int a[][]=new int [n][m];
		
		System.out.println("Enter the Elements...");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		int ct=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i][j]==1)
				{
					ct++;
				}
			}
		}
		System.out.println(ct);
	
	}

}