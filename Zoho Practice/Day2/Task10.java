class Task10{
	public static void main(String[] args){

	int m=5;

	int n=6;
	int k=0,j=0;

	
	int b[]={m,n};
	int c[]=new int[10];
	

	int a[]={1,2,3,4,5,6,7};

	for(j=0;j<2;j++)
	{
	for(int i=0;i<a.length;i++)
	{
		if(b[j]%a[i]==0)
		{

			c[k]=a[i];
			k++;
			
		}

	}

	}
	for(int i=0;i<k;i++)
	{
		System.out.println(c[i]);

	}

}


}