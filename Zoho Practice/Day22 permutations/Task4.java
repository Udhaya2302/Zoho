import java.util.*;

class Task4{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		String s="123"; 
		int ct=0;
		
		if(s.charAt(0)=='0')
		{
			System.out.println(0);
		}
		else
		{
			for(int i=0;i<s.length()-1;i++)
			{
				if((s.charAt(i)-'0')*10+s.charAt(i+1)>=26)
				{
					ct++;
				}
			}
		}
		System.out.println(ct);
		
	
	}
	
	
}