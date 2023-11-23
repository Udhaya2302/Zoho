import java.util.Scanner;

class BarCode{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" N ");
		
		int n=scan.nextInt();
		System.out.println(" M ");
		int m=scan.nextInt();
		System.out.println(" X ");
		int x=scan.nextInt();
		System.out.println(" Y ");
		int y=scan.nextInt();
		
		char a[][]=new char[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=scan.next().charAt(0);
			}
		}
		
		
		
		
		
	}


}