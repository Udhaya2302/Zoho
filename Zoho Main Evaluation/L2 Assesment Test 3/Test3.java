import java.util.Scanner;
class Test3{	
	public static void main(String [] args)
	{
			Scanner scan=new Scanner(System.in);
		
		String[] s={"one","two","three","four","five","six","seven","eight","nine","ten"};
		
		
		
		String s1=scan.next();
		char a[]=s1.toCharArray();
		
		for(int i=0;i<s.length;i++)
		{
			boolean ans=fun(s[i],a);
			if(ans)
			{
				System.out.println(s[i]);
			}
			a=s1.toCharArray();
		}
	
	
	
	
	}
	public static boolean fun(String s,char [] a)
	{
		int ct=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(s.charAt(i)==a[j])
				{
					ct++;
					//a[j]=' ';
					break;
				}
			}
		}
		if(ct==s.length())
		{
			return true;
		}
		return false;
	}




}