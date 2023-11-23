import java.util.Scanner;
class Task3{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		String s1="alex";
		String s2="aaeex";
		
		int i=0;
		int j=0;
		int ct=0;
		
		while(i<s2.length())
		{
			if(s2.charAt(i)==s1.charAt(j))
			{
				j++;
				ct++;
			}
			/*else
			{
				if(ct>0)
				{
					i++;
					ct=0;
				}else{
					break;
				}
			}*/i++;
		}
		if(ct==s1.length())
		{
			System.out.println(true);
			
		}
		else{
			System.out.println(false);
		}
		
		
	}
	
}