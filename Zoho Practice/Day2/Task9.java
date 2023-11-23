class Task9{
	public static void main(String[] args){

	
	int a[]={57, 13,96};
	int b[]={75,31,69};
	int c;
	for(int i=0;i<a.length;i++)
	
	{
			 c=rev(a[i]);

			for(int j=0;j<b.length;j++)
			{
				if(c==b[j])
				System.out.println(a[i]+" " +b[j]);

			}

	}

}
public static int rev(int a)
	{
	int temp=0;
		while(a!=0)
		{
			temp*=10;
			temp+=a%10;
			a/=10;
		}
	return temp;
	}

	


}