class Task8{
	public static void main(String[] args){

	int a[]={106,12,13,16};
	int b=6;
	int sum=0;


	for(int i=0;i<a.length;i++)
	{
		int ct=fun(a[i],b);
		if(ct==1)
		{
			sum+=i;

		}


	}
System.out.println(sum);

}

public static int fun(int a,int b)
	{
	int ct=0;
		while(a!=0)
		{
		int temp=a%10;

			if(temp==b)
			{
				ct++;

				return ct;
			}
		a=a/10;
			
		}
		return ct;
	}
}