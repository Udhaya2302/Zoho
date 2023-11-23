import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task1{
public static void main(String[] args){

String s="Hii This is Udhaya Kumar From ZOHO CORP ....with INC 3669.... ";
Pattern p=Pattern.compile("[a-zA-Z0-9 ]+$");

Matcher match=p.matcher(s);

	if(match.matches())
	{
		System.out.println("The String contains only a-z A-Z 0-9 ");
	}
	else
	{
		System.out.println("The String contains other chars Also... ");
	}

}


}
