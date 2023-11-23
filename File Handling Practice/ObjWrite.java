import java.util.*;
import java.io.*;


class ObjWrite {
    public static void main(String[] args) {
        String path = "C:\\Users\\Administrator\\Documents\\File Handling Practice\\newFileReadAndWrite.txt";
        File file = new File(path);
 
        User u1 = new User(1, "Udhay", true);
		try{
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
		
		oos.writeObject(u1);
		oos.close();
		}
		catch(Exception e)
		{
			
		}
		
		}
		}

class User implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;
    boolean come;

    User(int id, String name, boolean come) {
        this.id = id;
        this.name = name;
        this.come = come;
    }
	public String toString()
	{
		return("id"+id+" "+name+""+come);
	}
}
