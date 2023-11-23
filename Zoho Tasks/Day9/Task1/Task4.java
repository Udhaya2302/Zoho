//Write a Java program to match a string that contains only upper and lowercase letters, numbers, and underscores

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Task6{

	public static void main(String[] args){
	
	String s="asBBShSKS_As_aasd_AWEf_sd1221sdd_Ddew";

	Pattern p=Pattern.compile("[a-zA-Z0-9_]");

	Matcher m=p.matcher(s);

	while(m.find()){
		
	System.out.println(m.group()+" "+ m.start());
	}
}


}