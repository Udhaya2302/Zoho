import java.util.Scanner;

class Task11{
	public static void main(String[] args)
	{
		String s="abc";
		
		fun(s,"",0);
	}
	public static void fun(String s,String s1,int i)
	{
		if(i==s.length())
		{
			System.out.println(s1);
			return;
		}
		
		for(int j=0;j<s.length();j++)
		{
			fun(s,s1+s.charAt(j),i+1);
		}
		
	}



}