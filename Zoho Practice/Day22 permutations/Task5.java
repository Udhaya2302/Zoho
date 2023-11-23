import java.util.*;

class Task5{
	public static void main(String[] args){
		
		
		int a[][]={{ 1,1,0,0,1},
					{0,1,0,0,1},
					{1,1,1,1,1},
					{0,0,0,0,0},
					{1,0,1,0,1}};
		
		int ans=fun(a);
		System.out.println(ans);
		
	}
	public static int fun(int a[][])
	{
		int ct=0;
		int n=a.length;
		int m=a[0].length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i][j]==1)
				{
					ct++;
					dfs(a,i,j);
				}
			}
		}
		return ct;
	}
	public static void dfs(int a[][],int i,int j)
	{
		if(i<0 || i>=a.length || j<0 || j>=a[i].length || a[i][j]!=1)
		{
			return;
		}
		
		a[i][j]=0;
		
		dfs(a,i+1,j);//
		dfs(a,i,j+1);//
		dfs(a,i+1,j+1);//
		dfs(a,i+1,j-1);//
		dfs(a,i-1,j+1);//
		dfs(a,i,j-1);//
		dfs(a,i-1,j);
		dfs(a,i-1,j-1);//
		
	}




}