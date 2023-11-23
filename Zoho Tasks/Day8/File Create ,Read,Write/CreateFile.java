import java.io.File;
import java.io.IOException;

public class CreateFile{

public static void main(String[] args){

	String path="D:/newFile.txt";

	File createFile=new File(path);
	
	try{
	boolean create=createFile.createNewFile();	
	
	if(create)
	{
		System.out.println("File Created Successfully...");
	}
	else{
	System.out.println("File cannot Created Successfully...");
	}
	
	}catch(IOException e)
	{
		System.out.println(e.getMessage());
	}

	

}

}