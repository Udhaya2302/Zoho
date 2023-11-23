import java.util.*;
public class Task4
{
	public static void main(String[] args)
{
	String s = " ";
	char[] c =s.toCharArray();
	String s1 = "";
	String s2 = "";


	for(int i=c.length-1;i>=0;i--)
	{

		if( (c[i]>='a' && c[i]<='z') || (c[i]>='A' && c[i]<='Z') )
		{
		s1 +=Character.toLowerCase(c[i]);
		}
	}
	for(int i=0;i<c.length;i++)
	{
		if( (c[i]>='a' && c[i]<='z') || (c[i]>='A' && c[i]<='Z') )
		{
			s2 +=Character.toLowerCase(c[i]);
		}
	}
	if(s1.equals(s2))
	{
	System.out.println(true);
	}
	else
	{
	System.out.println(false);
	}

	}
}
