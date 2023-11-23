//Write a Java program to match a string that contains only upper and lowercase letters, numbers, and underscores
//Write a Java program that matches a word containing 'g', not at the start or end of the word.



import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Task5{

	public static void main(String[] args){
	
	String s="asBBgShg SKS_As_aagsd_ AWEf_sd12g 21sdd_Dgdew";

	Pattern p=Pattern.compile("\\b\\w*g\\w*\\b");

	Matcher m=p.matcher(s);

	while(m.find()){
		
	System.out.println(m.group()+" "+ m.start());
	}
}


}