class Task6{
	public static void main(String[] args){
	
	int a[] ={2, 6, 0, 9, 7, 3, 1, 4, 1, 10}  ;
	int i,j,k;
	int ct=0,m=0;

	int b=15;
	int sum=0; 
	for(i=0;i<a.length;i++)
	{
		
		for(j=i;j<a.length;j++)
		{sum=0;
			for(k=i;k<=j;k++)
			{
				sum=sum+a[k];
				if(ct==1)
				{
					System.out.print(a[k]);
					
					m++;
				}
			
				
			}
			ct=0;
				
			if(sum==b&&ct==0&&m==0)
			{
				System.out.println(true);
				ct++;
				j--;
			}		

		}
		

	}


}


}