import java.io.Serializable;
import java.io.PrintStream;
import  java.io.FileNotFoundException;
import java.io.File;


class ObjectWrite{
	public static void main(String[] args)
	{
		String path="C:\\Users\\Administrator\\Documents\\File Handling Practice\\newFileReadAndWrite.txt";
		File file=new File(path);
		
		User u1=new User(1,"Udhay",true);
		User u2=new User(1,"Karuna",true);
		try{
			PrintStream ps=new PrintStream(path);
			ps.print(u1.toString()+" User Obj\n");
			ps.print(u2.toString()+" User Obj\n");
			
			System.out.println("Objects writes Successfully");
			
			
			
		}
		catch(Exception e)
		{
			
		}
	}

}
class User implements Serializable{
	
	int id;
	String name;
	boolean come;
	
	User(int id,String name,boolean come)
	{
		this.id=id;
		this.name=name;
		this.come=come;
	}
	
	
}