class SumOfDigits{
	public static void main(String[] args){
	
	rev(12345);
	System.out.println(sum);
	
	
	}
	static int sum=0;
	public static void rev(int n)
	{
		if(n==0)
		{
			return ;
		}
		
		int m=n%10;
		sum=(sum*10)+m;
		
		rev(n/10);
		//return sum;
	}


}