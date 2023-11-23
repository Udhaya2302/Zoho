import java.io.IOException;
import java.io.File;

 class NewFile{

	public static void main(String[] args){
	
	String path="D:\\File1.txt";
	File file=new File(path);

	try{
		System.out.println(file.createNewFile());

	}catch(IOException e){
	
	System.out.println(e.getMessage());
	
	}

}
}