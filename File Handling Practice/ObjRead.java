import java.util.Scanner;
import java.io.*;

class ObjRead{
	public static void main(String[] args)
	{
		String path = "C:\\Users\\Administrator\\Documents\\File Handling Practice\\newFileReadAndWrite.txt";
        File file = new File(path);
		try{
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(path));
		User u=(User)ois.readObject();
		ois.close();
		System.out.println(u.toString());
		
		System.out.println(u.name);
		}
	catch(Exception e){
		
	}
	}

}