import java.util.Scanner;

class Task9{

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num....");
		int n=scan.nextInt();
		
		
		
		for(int i=0;i<n;i++)
		{
			char a='A';
			for(int j=i;j<n;j++)
			{
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++)
		{
				char a='A';
				
			for(int j=0;j<=i;j++)
			{
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
		
		}
		
	}