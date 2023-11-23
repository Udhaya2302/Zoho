import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;

public class RenameFile{

	public static void main(String[] args)  throws FileNotFoundException {
		String oldPath="D:\\newFile.txt";
		File file=new File(oldPath);
		
		String newPath="D:\\";
		System.out.println(file.renameTo(new File(newPath+args[0])));
		System.out.println("Renamed successfully...");

}

}