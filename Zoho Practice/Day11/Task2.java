import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Task2{
	public static void main(String[] args){
	
	StringBuilder a=new StringBuilder("a");
	StringBuilder b=new StringBuilder("b");
	StringBuilder c=new StringBuilder("");

	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();
	String str=fibonacii(n);
	System.out.println(str);
	
	int m=scan.nextInt();
	String s[]=new String[m];
	
	System.out.println("Enter the Strings...");
	for(int i=0;i<m;i++)
	{
		s[i]=scan.next();
	}
	for(int i=0;i<m;i++)
	{
		System.out.println(s[i]);
	}
	
	for(int i=0;i<m;i++)
	{
		Pattern p=Pattern.compile(s[i]);
		Matcher match=p.matcher(str);
		
		int ct=0;
		
		while(match.find())
		{
			ct++;
			
		}
		
		System.out.println(ct);
		ct=0;
		
	}
	
	
	
	}
	public static String fibonacii(int n)
	{
		String a="a";
		String b="b";
		
		for(int i=0;i<n-2;i++)
		{
			String temp=b;
			b+=a;
			a=temp;
		}
		return b;
	}
}
