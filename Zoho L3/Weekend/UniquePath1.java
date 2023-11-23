import java.util.*;

class UniquePath1{
	
	public static void main(String[] args){
		
		String a="zabcxdbcd";
		int ans=fun(a);
		System.out.println(ans);
	}
public static int  fun(String s)
{
	int a[]=new int[26];
	int ct=0;
	
	
	for(int i=0;i<s.length();i++)
	{
		if(i>0 && (s.charAt(i)-s.charAt(i-1)==1 || s.charAt(i-1)-s.charAt(i)==25))
		{
			ct++;
		}
		else
		{
			ct=1;
		}
		
		int index=s.charAt(i)-'a';
		a[index]=Math.max(ct,a[index]);
		
	}
	int result=0;
	for(Integer i :a)
	{
		result+=i;
	}
	return result;
	
}

}