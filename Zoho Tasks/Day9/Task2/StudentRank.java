import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class StudentRank{

	public static void main(String[] args){
	
	
	Map<Integer,Student> RankList=new HashMap<Integer,Student>();
	
	ArrayList<Student>stud=new ArrayList<Student>();
	stud.add(new Student("Udhaya ",90));
	stud.add(new Student("Kumar ",85));
	stud.add(new Student("Hari ",95));
	
	Compare(stud);

	

	for(Student s:stud)
	{
		System.out.println("Name "+s.Name+"Marks : "+s.Marks);
	}


}
	
}

class Student{
	
	String Name;
	int Marks;
	
	Student(String Name,int Marks)
	{
		this.Name=Name;
		this.Marks=Marks;
	}



}