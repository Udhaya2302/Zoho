import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class Test11{

	public static void main(String[] args)
	{
		File file =new File("C:\\Users\\Administrator\\Documents\\Dem0\\test.txt");
		try{
		FileWriter fw=new FileWriter(file);
		fw.write("Hi This is UdhayaKumar");
		fw.close();
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}
	

}