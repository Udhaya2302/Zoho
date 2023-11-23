import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertUpper{
	public static void main(String[] args){

	try{
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter no of chars to change UpperCase");
	int num=Integer.parseInt(reader.readLine());
	
	if(num<=0)
	{
		System.out.println("Enter positive values only...");
		return;
	}
	
	System.out.print("Enter the Charaacters... : ");
	String inputText=reader.readLine();

	if(inputText.length()<num){
		System.out.println("Input is too short ...");
		return;
	}

	String converted=inputText.substring(0,num).toUpperCase();
	System.out.println("UpperCase "+converted);
}
catch(IOException e){
		System.out.println("Exception occured ");
	}


}


}