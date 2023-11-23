class Task7{
	public static void main(String[] args){

		int a[] ={1, -1, -3, -2, 7, -55, 11, 6};
	int i,j;
	int n=a.length;

		for( i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				int temp=a[i];
				
				for( j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}	
				a[j]=temp;
				n--;
				i--;
				
					

			}
		}
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);


	}





}



}