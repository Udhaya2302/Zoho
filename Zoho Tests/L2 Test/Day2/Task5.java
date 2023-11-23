class Task5{

	public static void main(String[] args){

	
	int a[]={98,78,81,83,98,93,98,65,76,97};
	int max=0;	
	int ct=0;
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])	
		{
			max=a[i];
		}
	}
		for(int i=0;i<a.length;i++)
	{
		if(max==a[i])	
		{
			ct++;
		}
	}

	System.out.println(ct);

}


}