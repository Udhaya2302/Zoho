import java.util.Scanner;

class Task2{
	public static void main(String[] args){
	
	int grid[][]={	{0,0,0,0,0,0},
				{0,0,0,1,0,0},
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				{2,0,0,0,0,0}};
				
				
				minSteps(grid);
	}
	public static void minSteps(int grid[][])
	{
		if(grid==null||grid.length==0)
		{
			return ;
		}
		
		int rows=grid.length;
		int cols=grid[0].length;
	
		
		int count1=dfs(grid,1,3);
		System.out.println(count1);

		
		}
		public static int  dfs(int grid[][],int i,int j)
	{
		int rows=grid.length;
		int cols=grid[0].length;
		int count=0;
		
		if(i<0||i>=rows||j<0||j>=cols)
		{
			
			return 0;
		}
		
		count=1;
		grid[i][j]=1;
		
		dfs(grid,i+2,j+1);
		dfs(grid,i+2,j-1);
		dfs(grid,i+1,j-2);
		dfs(grid,i-1,j-2);
		dfs(grid,i-2,j-1);
		dfs(grid,i-1,j+2);
		dfs(grid,i+1,j+2);
		dfs(grid,i-2,j+1);
		
		grid[i][j]=0;
		return count;
		
		
	}
		
	}
	

