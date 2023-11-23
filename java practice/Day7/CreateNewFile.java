import java.io.File;
import java.io.IOException;

public class CreateNewFile{
	public static void main(String[] args){

		String filePath="D:/FirstFile.txt";

		File file=new File(filePath);

		try{
			boolean created=file.createNewFile();
			if(created){
			System.out.println("File Created Successfully...");
			}
			else{
			System.out.println("File could not be created...");
			}
		}catch(IOException e){
		System.out.println("An Error Occured "+e.getMessage());
		}


	}


}