//Write a Java program to find sequences of lowercase letters joined with a underscore.

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Task3{

	public static void main(String[] args){
	
	String s="asBBShSKS_As_aasd_AWEf_sd";

	Pattern p=Pattern.compile("_[a-z]+");

	Matcher m=p.matcher(s);

	while(m.find()){
		
	System.out.println(m.group()+" "+ m.start());
	}
}


}