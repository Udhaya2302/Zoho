import java.util.Scanner;

class Test3{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Array size...");
		int n=scan.nextInt();
		int a[][]=new int[n][n];
		
		int i,j;
		System.out.println("Enter the elements...");
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		int k=n-1;
		
		for(i=0;i<n/2;i++)
		{
			k=n-1;
			for(j=0;j<n/2;j++)
			{
				int temp=a[i][j];
				
				a[i][j]=a[i][k];
				a[i][k]=temp;
				k--;
				
			}
			
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}