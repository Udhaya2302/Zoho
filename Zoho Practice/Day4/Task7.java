import java.util.Scanner;

class Task7{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array Size...");

	int n=scan.nextInt();
	int a[][]=new int[n][n];

	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=scan.nextInt();

			}
		}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" "+a[i][j]);

			}
			System.out.println();

		}
		int max=-1;
		int ct=0;

		for(int i=0;i<n;i++)
		{
			ct=0;
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==1)
				{
					ct++;
				}

			}
			if(max<ct)
			{
				max=i;
			}
		}
	System.out.println(max);

}
}