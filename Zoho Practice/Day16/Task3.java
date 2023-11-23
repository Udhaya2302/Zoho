import java.util.Scanner;

class Task3{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	String s="1-23-45 6";
	
	StringBuilder sb=new StringBuilder();
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			sb.append(s.charAt(i));
		}
	}
	System.out.println(sb);
	
	StringBuilder sb2=new StringBuilder();
	int n=sb.length()-3;
	
	for(int i=0;i<sb.length();i++)
	{
		if(i<=3)
		{
			sb2.append(sb.charAt(i));
		}else 
		{	
			if(n==3)
			{
				sb2.append(sb.charAt(i));
			}
			else{
				sb2.append(sb.charAt(i));
			}
		}
		
		if(i==2)
		{
			sb2.append("-");
		}
	}
	
	System.out.println(sb2.toString());
	}
	


}