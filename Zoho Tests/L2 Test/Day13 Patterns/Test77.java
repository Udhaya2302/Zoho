import java.util.*;

class Test77{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int k=1;
		printSpiral(n);
	}
	public static void printSpiral(int n)
	{
		int a[][]=new int [n][n];
		
		int rowStart=0;
		int colStart=0;
		int rowEnd=n;
		int colEnd=n;
		
		int ct=0;
		
		while(rowStart<rowEnd&&colStart<colEnd)
		{
			for(int i=colStart;i<colEnd;i++)
			{
				a[rowStart][i]=++ct;
			}
			rowStart+=1;
			for(int i=rowStart; i<rowEnd;i++)
			{
				a[i][colEnd-1]=++ct;
			}
			colEnd-=1;
			
			for(int i=colEnd-1;i>=colStart;i--)
			{
				a[rowEnd-1][i]=++ct;
			}
			rowEnd-=1;
			for(int i= rowEnd;i>=rowStart;i--)
			{
				a[i][colStart]=++ct;
			}
			colStart+=1;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(Arrays.toString(a[i]));
		}
	}

}