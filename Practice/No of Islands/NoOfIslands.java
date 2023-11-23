import java.util.Scanner;

class NoOfIslands{
	public static void main(String[] args){
		
	int a[][]={ {0,0,1,1,0},
				{1,0,1,0,0},
				{0,0,1,0,1},
				{1,0,1,0,0},
				{1,0,0,0,0}};
				
				
				int result=consecutiveones(a);
				System.out.println(result);		
		
	}
	public static int consecutiveones(int grid[][])
	{
		int n=grid.length;
		int m=grid[0].length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(grid[i][j]==1)
				{
				count++;
				dfs(grid,i,j);
				}
			}
		}
		return count;
		
	}
	public static void dfs(int grid[][],int i,int j)
	{
		if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0)
		{
			
			// System.out.println(i+" "+j);
			return ;
		}
		
		grid[i][j]=0;
		
		dfs(grid,i+1,j);
		dfs(grid,i-1,j);
		dfs(grid,i,j+1);
		dfs(grid,i,j-1);
		
		
	}



}