
class Taskk6{
	public static void main(String [] args){
	
	int a[][]={{0,0,1,1,0},
				{1,1,0,1,1},
				{0,1,1,1,0},
				{0,0,0,0,0},
				{0,1,1,0,1}};
	
	
	int maxcount=0;
	
	
	
	for(int i=0;i<5;i++)
	{
		int currentcount=0;
		int count=0;
		
		for(int j=0;j<5;j++)
		{
			if(a[i][j]==1)
			{
				count++;
			}
			else if(count>0)
			{
				currentcount++;
				count=0;
			}
			
			
		}
		if(count>0)
			{
				maxcount++;
				
			}
			maxcount+=currentcount;
			
	}
	System.out.println(maxcount);
	
	}
}