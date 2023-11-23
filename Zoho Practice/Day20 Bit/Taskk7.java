class Taskk7{
	public static void main(String[] args)
	{
		int n=1023;
		int ct=0;
		while(n!=0)
		{
			if((n&1)==1)
			{
			ct++;
			}
			n=n>>1;
		}
		System.out.println(ct);
	}

}