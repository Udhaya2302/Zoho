import java.util.*;

class Task33{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	//System.out.println("Enter the String...");
	//String s=scan.nextLine();
	
	String s="civicbob";
	int ct=0;
	for(int i=2;i<s.length()-1;i++)
	{
			String s1=s.substring(0,i);
			String s2=s.substring(i,s.length());
			//System.out.println(s1);
			//System.out.println(s2);
			boolean str1=palindrome(s1);
			boolean str2=palindrome(s2);
			//System.out.println(str1);System.out.println(str2);
			if(str1 && str2)
			{
				ct++;
			}
			
			
	}
	if(ct>0)
	{
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}

	}
	public static boolean palindrome(String s1)
	{
		int n=s1.length();
		int ct=0;
		
		for(int i=0;i<s1.length()/2;i++)
		{
			if(s1.charAt(i)!=s1.charAt(n-1))
			{
				ct++;
			}
			n--;
		}
		return ct==0 ? true:false;
	}


}
