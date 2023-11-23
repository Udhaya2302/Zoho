import java.util.Scanner;

class Task8{

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num....");
		int n=scan.nextInt();
		
	
		
		for(int i=0;i<n;i++)
		{
			int k=1;
			for(int sp=0;sp<i;sp++)
			{
				System.out.print(" ");
			}
				
			for(int j=i;j<n;j++)
			{
				System.out.print(" "+(k+j));
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++)
		{
			int k=n;
			for(int sp=i;sp<n;sp++)
			{
				System.out.print(" ");
			}
				
			for(int j=0;j<=i;j++)
			{
				System.out.print(((k++)-i)+" ");
			}
			System.out.println();
		}
		
		}
		
	}