import java.util.*;

class Test5{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	String s1="NSWW";
	String s2="NSEW";
	
	char a[]=s1.toCharArray();
	char b[]=s2.toCharArray();
	
	int ct=0;
	
	for(int i=0;i<b.length;i++)
	{
		ct=0;
		for(int j=0;j<a.length;j++)
		{
		
			if(b[i]==a[j])
			{
				ct++;
			}
		}
		if(ct==0)
		{
			System.out.println("False");
		return;
		}
	}

	
	
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			
			if(a[i]==a[j])
			{
				System.out.println("True");
				return;
			}
		}
	}
	System.out.println(false);
	
	
	
	
	
	}


}