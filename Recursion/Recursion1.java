
class Recursion1{
	
	public static void main(String[] args){
	
		
		System.out.println(fun(5));
		System.out.println(pro(5));
		countDigits(12345,0);
		countDigits(12345,0);
	
	
	}
	
	public static void countDigits(int n,int ct)
	{
		if(n==0)
		{
			System.out.println(ct);
			return;
		}
		n/=10;
		countDigits(n,++ct);
		
	}
	
	// sum of numbers..........
	
	public static int fun(int n){
	if(n==0)
	{
			
			return 0;
	}
	
	return n+fun(n-1);
	}
	//product of Numbers........
	public static int pro(int n)
	{
		if(n==1)
			return 1;
		return n*pro(n-1);
	}
	
	
}