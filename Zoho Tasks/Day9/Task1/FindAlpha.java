import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindAlpha{

	public static void main(String[] args){
	
	String s="Hii This is The Anonimous Message";
	Pattern p=Pattern.compile("[a-zA-Z0-9 .]+$");

	Matcher m=p.matcher(s);
	
	if(m.matches()){
		System.out.println("It contains only chars A-Z a-z");

	}
	else
	{
		System.out.println("It contains others");
	}

}


}