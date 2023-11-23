import java.io.File;
import java.io.IOEXception;

public class Task2{
	public static void main(String[] args)
	{
	try{
		String path="c:\java\abc.txt";
		File file =new File(path);
		
		boolean create=file.CreateNewFile();

		if(create){
		System.out.println("File Created Successfully...");
		}
		else{
		System.out.println("Cannot create File...");
		}
	}catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
		

	}

}