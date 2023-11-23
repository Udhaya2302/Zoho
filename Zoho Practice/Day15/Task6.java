import java.util.Scanner;

class Task6{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	String s="1.1.1.1";

	//String s2=s.replace(".","[.]");
	//System.out.println(s2);
	
	//StringBuilder sb=new StringBuilder(s);
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='.')
		{
			System.out.print("["+s.charAt(i)+"]");
		}else
		{
			System.out.print(s.charAt(i));
		}
	}
	
	
	}

}