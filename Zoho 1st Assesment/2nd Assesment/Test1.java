import java.util.Scanner;

class Test1{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the String...");
	String s=scan.nextLine();
	int k=0;
	String s2="";
	
	int ct=0;
	for(int i=0;i<s.length();i++)
	{
			if(s.charAt(i)==' ')
			{
				ct++;
			}
	}
	int m=0;
	
	for(int i=0;i<=ct;i++)
	{
		s2="";
		
		while(true)
		{
			if(s.charAt(m)!=' ')
			{
				s2+=s.charAt(m++);
				
			}
			else 
			{
				break;
			}
			
		}

		System.out.println("aa"+s2);
	}
		
		
		
		
		
		
		
	
	
	
	
	}
}
	
	