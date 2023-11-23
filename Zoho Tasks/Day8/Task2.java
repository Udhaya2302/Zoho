import java.io.File;
import java.io.IOException;

public class Task2{
	public static void main(String[] args)
	{
	File file = null;
	try{
		String path="D:\\abc.txt";
		file=new File(path);
		
		boolean create=file.createNewFile();

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
		
// check..............................................


	if(file.exists()){
		System.out.println("File Exists...");
	
		if(file.isDirectory()){
			System.out.println("It is a Directory...");
		}else
		{
			System.out.println("It is not a directory...");
		if(file.isFile())
		{
			System.out.println("It is a file...");
		}else{
			System.out.println("It is not a file...");
		}
		
		String fileName=file.getName();
		System.out.println("File Name : "+ fileName);
		
		String absolutePath=file.getAbsolutePath();
		System.out.println("Absolute Path : "+absolutePath);
		}

	}else{
		System.out.println("File does not exists...");
	}

	
}
}