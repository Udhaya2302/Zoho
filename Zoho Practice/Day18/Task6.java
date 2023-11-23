import java.util.Scanner;

class Task6{

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num....");
		int n=scan.nextInt();
		
	
		
		for(int i=0;i<n;i++)
		{
				int k=n;
			for(int j=0;j<=i;j++)
			{
				System.out.print(k--+" ");
			}
			System.out.println();
		}
		
		}
		
	}