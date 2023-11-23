class Maxsum
{
	public static void main(String[] args){
	
	int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
	
	
	int end=0;
	int max=Integer.MIN_VALUE;
	
	for(int i=0;i<a.length;i++)
	{
		end=end+a[i];
		if(max<end)
		{
			max=end;
		}
		if(end<0)
		{
			end=0;
		}
	}
	System.out.println(max);
	}
}