import java.util.Scanner;

class Task2{

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num....");
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(n-j);
			}
			
			for(int k=i;k<n-1;k++)
			{
				System.out.print(n-i);
			}
			
			
			for(int j=1;j<n-i;j++)
			{
				System.out.print(n-i);
			}
			
			int k=n-i+1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++);
			}
			
			System.out.println();
		}
		
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(n-j);
			}
			
			for(int k=i;k<n-1;k++)
			{
				System.out.print(n-i);
			}
			
			
			for(int j=1;j<n-i;j++)
			{
				System.out.print(n-i);
			}
			
			int k=n-i+1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++);
			}
			
			System.out.println();
		}
		
	}
}