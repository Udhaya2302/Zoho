
class Task4{
	public static void main(String [] args){
	
	int a[][]={{0,0,1,1,0},
				{1,0,1,0,0},
				{0,0,1,0,1},
				{1,0,1,0,0},
				{1,0,0,0,0}};
				
				
				int result=consecutiveones(a);
				System.out.println(result);
				
				
	}
	
	public static int consecutiveones(int grid[][])
	{
		if(grid==null||grid.length==0)
		{
			return 0;
		}
		
		int rows=grid.length;
		int cols=grid[0].length;
		int count=0;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
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
		int rows=grid.length;
		int cols=grid[0].length;
		
		if(i<0||i>=rows||j<0||j>=cols||grid[i][j]==0)
		{
			return;
		}
		
		grid[i][j]=0;
		
		dfs(grid,i+1,j);
		dfs(grid,i-1,j);
		dfs(grid,i,j+1);
		dfs(grid,i,j-1);
	}
}
