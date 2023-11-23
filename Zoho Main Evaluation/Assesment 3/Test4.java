import java.util.Scanner;

class Test4{

static int ct=1;
	public static void main(String[] args){
		
		Scanner sca=new Scanner(System.in);
		
		
		
	int a[][]={{2,1,1},{1,1,0},{0,1,1}};
	
		
		fun(a,a.length,0,0);
		
		System.out.println(ct);
		
		
	}
	public static void fun(int a[][],int n,int i,int j)
	{
		if(i<0 && i<n || j<0 && j<n)
		{
			
		
			return;
		}
		
		if(a[i][j]==2)
		{
			//a[i+1][j+1]=2;
		fun(a, n,j+1,i);
		fun(a, n,j-1,i);
		fun(a, n,j,i-1);
		fun(a, n,j,i+1);
		
		}
		ct++;
		
	}
	
/*	public static int check(int a[][])
	{
		int ct=0;
		int n=a.length;
		int m=a[0].length;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			if( i<n-1 && a[i+1][j]!=1 )
			{
				ct++;
			}else if( i>0 && a[i-1][j]!=1 )
			{
				ct++;
			}else if( j<n-1 && a[i][j+1]!=1 )
			{
				ct++;
			}else if(j>0 && a[i][j-1]!=1  )
			{
				ct++;
			}
		}
	}
	return ct;
	}*/
}