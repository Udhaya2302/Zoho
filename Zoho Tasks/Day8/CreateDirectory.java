import java.io.File;

public class CreateDirectory{
	public static void main(String[] args){
	
	String Path="D:/java/newDirectory";
	File  directory=new File(Path);


	if(directory.mkdirs()){
	System.out.println("Directory Created ....");
	}
	else{
	System.out.println("Directory Not created...");
	}
}


}