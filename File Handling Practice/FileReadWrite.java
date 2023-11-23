import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.BufferedReader;

class FileReadWrite{
	public static void main(String [] atgs) throws IOException
	{
		String path="C:\\Users\\Administrator\\Documents\\File Handling Practice\\newFileReadAndWrite.txt";
		File file=new File(path);
		try{
		
		boolean create=file.createNewFile();
		
		if(create)
		{
			System.out.println("File Created....");
		}
		else
		{
			System.out.println("File Already Created...");
		}
		
		}
		catch(IOException e)
		{
			System.out.println("");
		}
		
		FileWriter fw=new FileWriter(path,true);
		//BufferedWriter bfw=new BufferedWriter(fw);
		
		
		fw.write("Hi this is UdhayaKumar From Zoho Corp....\n");
		//bfw.close();
		
		
		//FileReader fr=new FileReader(path);
		
	//	System.out.println(fr.read());
		//fr.close();
		
		BufferedWriter bfw=new BufferedWriter(fw);
		bfw.write("Hii welcome to Zoho Corp");
		bfw.close();
		fw.close();
		
		FileReader fr=new FileReader(path);
		BufferedReader bfr=new BufferedReader(fr);
		
		while(bfr.ready())
		{
			System.out.println(bfr.readLine());
		}
		bfr.close();
		
		Scanner scan=new Scanner(file);
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}
		
	}




}