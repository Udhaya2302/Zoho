import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Practice{

	public static void main(String[] args){
	
	String s="ppqpp pqqpqqq pqqppqpq qppqqpqqp";

	Pattern p=Pattern.compile("pq*+");

	Matcher m=p.matcher(s);

	if(m.find())
	{
		System.out.println("a:  "+m.start());
	}

	while(m.find()){
		
	System.out.println(m.group()+" "+ m.start());
	}


	}
	
	



}