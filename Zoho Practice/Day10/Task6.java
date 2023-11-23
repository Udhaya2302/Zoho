
class Task6{
	public static void main(String [] args){
	
	int a[][]={{0,0,1,1,0},{1,1,0,1,1},{0,1,1,1,0},{0,0,0,0,0},{0,1,1,0,1}};
	
	
	int ct=0;
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(a[i][j]==1)
			{
				ct++;
				j+=1;
				
				System.out.println(i);
				while(j>5&&a[i][j]!=0)
				{
					j++;
				}
				
				
			}
		}
	}
	System.out.println(ct);
	
	}
}