import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteDataOnFile{
	public static void main(String[] args){

	String path= "D://abc.txt";
	String data="This is the Text by using OutputStream";


	try{
	OutputStream os=new FileOutputStream(path);

	byte[] dataBytes=data.getBytes();

	os.write(dataBytes);
	
	System.out.println("Data has been written to the file");
	}
	catch(IOException e){
	System.out.println("An error occured "+e.getMessage());
	}

}

}