import java.util.Scanner;
class Test5{	
	public static void main(String [] args)
	{
			Scanner scan=new Scanner(System.in);
			
			int n=38;
			fun(n);
			
			
}
public static int fun(int n)
{
	
	
		int ans=fun1(n,0);
		System.out.println(ans);
		return 0;
	
	
}
public static int fun1(int n,int ct)
{
	//System.out.println(n);
	
	if(n==0)
	{
		return ct;
	}
	
	
	ct+=1;
	n=n/10;
	
	return fun1(n,ct);
	
	//return -1;
	
}
}