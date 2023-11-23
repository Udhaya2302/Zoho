import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileWrite{

	public static void main(String[] args){
	

	String path="D:/newFile.txt";

	try{
	FileWriter write=new FileWriter(path);

	BufferedWriter bfd=new BufferedWriter(write);
	
	String Text="Hello This is a new text on the new File....";
	
	bfd.write(Text);
	
	bfd.close();
	write.close();

	System.out.println("Writes Successfully....");

	}
	catch(IOException e){
		System.out.println(e.getMessage());
	}

}
}