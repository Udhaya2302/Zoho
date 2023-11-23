import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task8{
public static void main(String[] args){

String s="Now a days developers are using mostly python language..";

String search="\\bpython\\b";

Pattern p=Pattern.compile(search,Pattern.CASE_INSENSITIVE);

Matcher match=p.matcher(s);

	if(match.find())
	{
		System.out.println("java");
	}
	else
	{
		System.out.println("c++");
	}

}


}
