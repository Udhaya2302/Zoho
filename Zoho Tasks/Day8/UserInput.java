import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class UserInput{
	public static void main(String[] args)
	{
		try{
			BufferedReader bfd=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the text to save on file ...");

			String userInput=bfd.readLine();
			String fileName="D:\\newFile.txt";

			BufferedWriter writer=new BufferedWriter(new FileWriter(fileName, true));
			writer.write(userInput);

			writer.close();
			System.out.println("data has been written on the file...");
			
		}catch(IOException e){
			System.out.println("An error occured");
			}

	}


}