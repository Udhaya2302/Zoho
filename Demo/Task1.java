import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
class Task1{

	public static void main(String[] args)
	{
		File file =new File("C:\\Users\\Administrator\\Documents\\Demo\\test.txt");
		try{
		FileWriter fw=new FileWriter(file);
		fw.write("Hi This is Udhaya\n hii");
		fw.flush();
		fw.close();
		}catch(IOException e)
		{
			System.out.println(e);
		}
		try{
		FileReader fr=new FileReader(file);
		char[] ch=new char[(int)file.length()];
		
		fr.read(ch);
		
		for(char c:ch)
		{
			System.out.print(c);
		}
		}
		
		
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
	

}