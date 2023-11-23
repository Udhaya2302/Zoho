import java.util.Scanner;

class Test3{
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
	String a[]={"ab", "c"};
	String b[]={"a","cb"};
	
	String str1=fun(a,"",0);
	
	String str2=fun(b,"",0);
	
	if(str1.equals(str2))
	{
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}
	
	}
	public static String fun(String a[],String s,int n)
	{
		if(n==a.length)
		{
			return s;
		}
		
		return s+=a[n]+fun(a,s,n+1);
	}
	
	
	
	
}