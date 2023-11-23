import java.util.Scanner;

class Task4{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	
	String s1="AB";
	
	String s2="CD";
	
	String s3="";
	printInterLeavingStrings(s1,0,s2,0,s3);
	
	
	}
	public static void printInterLeavingStrings(String s1,int i,String s2,int j,String s3)
	{
		if(s1.length()==i && s2.length()==j)
		{
			System.out.println(s3);
			return;
			
		}
		
		if(s1.length()>i)
		{
			printInterLeavingStrings(s1,i+1,s2,j,s3+s1.charAt(i));
		}
		
		if(s2.length()>j)
		{
			printInterLeavingStrings(s1,i,s2,j+1,s3+s2.charAt(j));
		}
	}

}