import java.util.Scanner;

class Task5{

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num....");
		int n=scan.nextInt();
		
		int spaces=n;
		int num=1;
		
		for(int i=0;i<n;i++)
		{
			
				
				for(int sp=1;sp<=spaces;sp++)
				{
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++)
				{
					System.out.print(ans(i,j)+" ");
				}
			
			spaces--;
			System.out.println();
		}
		
		}
		public static int ans(int i,int j)
		{
			return fact(i)/(fact(j)*fact(i-j));
			
		}
		
		public static int fact(int n)
		
		{
			int f=1;
			for(int i=1;i<=n;i++)
			{
				f*=i;
			}
			return f;
		}
		
	}