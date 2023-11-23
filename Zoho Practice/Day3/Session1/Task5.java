class Task5{
	public static void main(String[] args){

		int i,j,k;
		int a[]={1, 2, 3,4};
		int sum=0;
		int max=0;

		for(i=0;i<a.length;i++)
		{
		
			for(j=i;j<a.length;j++)
			{	sum=0;

				for(k=i;k<=j;k++)
				{
					if((j-i)==2)
					{
						sum=sum+a[k];
						System.out.println(a[k]);
						
					}
				}
					if(max<sum)
						{
							max=sum;
						}
				
				
			}
		}		

		System.out.println(sum);

}



}