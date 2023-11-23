import java.util.Scanner;

class Test1{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			for(int sp=0;sp<(n-i-1);sp++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}



}