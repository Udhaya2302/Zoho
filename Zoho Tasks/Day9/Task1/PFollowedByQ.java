import java.util.regex.Pattern;
import java.util.regex.Matcher;

class PFollowedByQ{

	public static void main(String[] args){
	
	String s="pppppqqpqqqpqqppqpqqppqqpqqp";

	Pattern p=Pattern.compile("[p+q*]+");

	Matcher m=p.matcher(s);

	System.out.println(m.matches());
	
	if(m.matches())
	{
		System.out.println("The string contains p followed by q");
	}else
	{
		System.out.println("The String does not contains p followed by q ...");
	}
}


}