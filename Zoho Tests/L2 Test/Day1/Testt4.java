class Testt4{

	public static void main(String[] args){

	int a[]={1,2,3};
	int i,j,k;
	

	for(i=0;i<a.length;i++)
	{
		for(j=i;j<a.length;j++)
		{
			for(k=i;k<=j;k++)
			{
				System.out.print(a[k]);
			}
			System.out.println();
		}
	}

}


}