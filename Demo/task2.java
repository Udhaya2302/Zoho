import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


class task2{
	public static void main(String[] args){
	
		try{
		File file=new File("C:\\Users\\Administrator\\Documents\\Demo\\test2.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw =new BufferedWriter(fw);
		
		bw.write("TAmil ");
		bw.newLine();
		bw.write("English");
		bw.newLine();
		bw.write("Maths");
		bw.close();
		
		
		FileReader fr=new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		
		String line=br.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		}
		catch(IOException e)
		{
			System.out.println(e); 
			
		}
	
	
	
	}

}