import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead{
	public static void main(String[] args){
	
	String path="D:/newFile.txt";
try{
	FileReader read=new FileReader(path);

	BufferedReader bfd=new BufferedReader(read);
	String line;
	while((line=bfd.readLine())!=null){
	System.out.println(line);
	}
	

	read.close();
	bfd.close();
	System.out.println("File Reads Successfully...");
}catch(IOException e){
	System.out.println(e.getMessage());
	}



}


}
