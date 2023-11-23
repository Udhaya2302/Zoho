import java.io.File;

public class DeleteFile{
	public static void main(String[] args){
	
	String name="D:\\newName123";
	
	File file=new File(name);

	if(file.exists())
	{
		if(file.delete())
		{
			System.out.println("File deleted Successfully..");
		}
		else{
			System.out.println("Unable to delete...");
		}	
	}else{
		System.out.println("File not exists...");
	}	
	
}
}
