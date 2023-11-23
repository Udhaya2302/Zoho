import java.util.Scanner;

class Task1{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the String...");
	
	String s=scan.nextLine();
	
	String a[]=s.split(" ");
	for(int i=0;i<a.length;i++)
	{
		fun(a[i],i);
		
	}

}
	public static void fun(String s,int i)
	{
		String s1="";
		if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u')
		{
			s1=s+"ma";
			for(int j=0;j<i;j++)
			{
				s1+="a";
			}
			
			System.out.println(" "+s1);
		}
		else
		{
			String str=rev(s);
			str+="ma";
			
			for(int j=0;j<i;j++)
			{
				str+="a";
			}
			System.out.print (" "+str);
		}
		}
		
		public static String rev(String s){
			
			String str="";
			for(int i=1;i<s.length();i++)
			{
				str+=s.charAt(i);
			}
			str+=s.charAt(0);
			
			return str;
			
		}

}