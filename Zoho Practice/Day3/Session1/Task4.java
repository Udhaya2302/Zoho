class Task4{
	public static void main(String[] args){

	int a[]= {-1,5,4,2,0,3,1};

	int n=a.length;
	int max=a[0];
	int min=a[0];
	int sum=0;
	
	for(int i=0;i<n;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
		if(min>a[i])
		{
			min=a[i];
		}
		sum+=a[i];
	
	}
	

	double val=((n)*(min+max)/2);
	

	if(val==sum)
	{
		System.out.println("The Array contains consecutive elements ");
	}
	else{
		System.out.println("The Array does not contains consecutive elements ");

		}




}



}