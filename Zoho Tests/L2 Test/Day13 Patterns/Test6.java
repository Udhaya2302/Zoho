import java.util.Scanner;

class Test6{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int sp=0;sp<n-i+1;sp++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(i*2-1);j++)
			{
				if(i==0||j==0|| j==(i*2)-2)
				System.out.print("*");
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int sp=0;sp<i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=(n*2)-((i*2));j++)
			{
				if(i==0 || j==0|| j==(n*2)-((i*2)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		}
		}