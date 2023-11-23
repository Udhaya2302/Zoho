class Test2{
	public static void main(String[] args){

	int[] a = {1,0,2,3,0,4,5,0};
	int j;
	
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==0)
		{
			for( j=a.length-1;j>i;j--)
			{
				a[j]=a[j-1];
			}
			a[j]=0;
			i++;

		}

	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);

	}

	


}

}