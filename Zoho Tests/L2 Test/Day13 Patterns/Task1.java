import java.util.Scanner;

class Task1{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int sp=0;sp<i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<((n*2)-(i*2)-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		}
		}