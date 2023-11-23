import java.util.Scanner;
import java.util.regex.*;

class Test6{

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	String s="aabcbc";
	
	Pattern p=Pattern.compile("abc");
	Matcher match=p.matcher(s);
	
	while(match.find())
	{
		s=match.replaceAll("");
		match=p.matcher(s);
	
	}
	if(s.length()==0)
	{
		System.out.println(true);
	}else
	{
		System.out.println(false);
	}
	
	
	
	
	}


}