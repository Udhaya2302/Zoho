class Test1{
	public static void main(String[] args){


	int a[] = {2,-1,6,1};	
	int c,b=0,min=1000;

		
	for(int i=0;i<a.length;i++)
	{
		
		if(a[i]<0)
			{
			//int b=a[i];
			b=a[i];
			a[i]*=-1;
			
			
			}
		
		if(a[i]!=0 && a[i]<min)
		{
			
			
			min=a[i];
			
		}
	}
	System.out.println(min);


}
}