import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


class FileHandling{
	public static void main (String[] args) throws IOException
	{
		String path="C:\\Users\\Administrator\\Documents\\File Handling Practice\\newFile.txt";
		
		
		try{
		
		File file=new File(path);
		if(file.createNewFile())
		{
			System.out.println("File Creates...");
		}
		else
		{
			System.out.println("File Already Exists...");
		}
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		try{
		FileWriter fw=new FileWriter(path,true);
		fw.write("abcd sdk \n");
		fw.close();
		}
		catch(IOException e)
		{
			
		}
		
		int n=System.in.read();
		System.out.println(n);
		
		try{
		FileReader fr=new FileReader(path);
		BufferedReader bfd=new BufferedReader(fr);
		
		String line;
		while((line=bfd.readLine())!=null)
		{
			System.out.println(line);
		}
		fr.read();
		fr.close();
		}
		catch(IOException e)
		{
			
		}
		
	}
	
		
		
	


}