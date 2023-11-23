

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Task6{

	public static void main(String[] args){
	
	String s="asBBgShg SKS_As_aagsd_ AWEf_sd12g 21sdd_Dgdew";

	Pattern p=Pattern.compile("[a-zA-Z0-9_ ]+$");

	Matcher m=p.matcher(s);

	if(m.matches())
	{
		System.out.println("The String contains only a-z A-Z 0-9 ");
	}
	else
	{
		System.out.println("The String contains other chars Also... ");
	}

}


}