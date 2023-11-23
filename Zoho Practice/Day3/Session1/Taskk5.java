class Taskk5{
	public static void main(String[] args){
	
	int a[] ={1, 2, 3, 1, 4, 5, 2, 3, 6 };
	int max=0;
	int sum=0;
	int i,j;
	int k=3;
	
	int n=a.length;

	for(i=0;i<a.length-k;i++)
	{
		sum=0;

		for(j=i;j<i+k;j++)
		{
			sum+=a[j];
			

		}
		if(max<sum)
		{	
			max=sum;
		}
	}
	System.out.println(max);


}


}