class Taskk10{
	public static void main(String[] args){

	int m=5;

	int n=6;
	int k=0,j=0;

	
	int b[]={m,n};
	int c[]=new int[10];
	

	int a[]={1,2,3,4,5,6,7};

	
	for(int i=0;i<2;i++)
	{
		for( j=k;j<a.length;j++)
		{
			if(b[i]%a[j]==0)
			{
				int temp=a[j];
				for(int l=j;l>k;l--)
				{
					a[l]=a[l-1];
				}
				a[k]=temp;
				k++;

			}
		}

	}

for(int i=0;i<a.length;i++)
	{

	System.out.println(a[i]);
	}

}


}