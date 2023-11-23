import java.util.regex.Pattern;
import java.util.regex.Matcher;

class DecimalnumsTask9{

	public static void main(String[] args){
		
	double a=1.12345623;
	
	String s=Double.toString(a);

	Pattern p=Pattern.compile("\\.\\d+");

	Matcher m=p.matcher(s);

	if(m.find()){
	
	String decimalPart=m.group();
	System.out.println(decimalPart.length()-1);

	}
}


}