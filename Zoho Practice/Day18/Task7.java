import java.util.Scanner;

class Task7{

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num....");
		int n=scan.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
			}
			System.out.println();
		}
		
		
		}
	}