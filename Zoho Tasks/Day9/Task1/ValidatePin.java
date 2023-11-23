import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class ValidatePin{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Pin...");
	String Pin=scan.next();

	Pattern p=Pattern.compile("(\\d{4}|\\d{6}|\\d{8})");
	Matcher m=p.matcher(Pin);
	
	if(m.matches())
	{
		System.out.println("Valid Pin...");
	}
	else
	{
		System.out.println("InValid Pin...");
	}
	
	
	






}
}