class Task6{
	public static void main(String[] args){


	int a[]={2, 3, 3, 4, 5, 7, 9};
	int b[]={1, 2, 4, 5, 6, 7, 9};
	int c[]=new int[30];
	int i=0,j=0;
	int k=0;

	for( i=0;i<a.length;i++)
	{
		
		c[k]=a[i];
		k++;

	}


	
	for(i=0;i<b.length;i++)
	{
		c[k]=b[i];
		k++;

	
	}
	

int n=a.length+b.length;



for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(c[i]<c[j])
			{
				int temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			}
		}

	
	}



int ct=0;

	for(i=0;i<n;i++)
	{
		if(c[i]==c[i+1])
		{
			for(j=i;j<n;j++)
			{
				c[j]=c[j+1];
				ct++;	

			}
		}
		
	}
for(i=0;i<n-ct;i++)
	{

	System.out.println(c[i]);
	}
	
	

}



}