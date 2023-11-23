import java.util.Scanner;

class Task1{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	//System.out.println("Enter the String...");
	String s1="ab";
	
//	System.out.println("Enter the goal...");
	String s2="ba";
	
	StringBuilder sb=new StringBuilder(s1);
	
	for(int i=1;i<s1.length();i++)
	{
		char temp=sb.charAt(0);
		sb.deleteCharAt(0);
		sb.append(temp);
		
		s1=sb.toString();
		
		if(s1.equals(s2))
		{
			System.out.println(true);
			return;
		}
		
	}
	System.out.println(false);
	
	
	
	
	}


}