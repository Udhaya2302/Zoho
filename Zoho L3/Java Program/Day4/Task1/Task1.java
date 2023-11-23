abstract class Parent{

	abstract void message();
}

class Subclass1 extends Parent{
	
	void message()
	{
		System.out.println("This is from subclass 1");
	}

}
class Subclass2 extends Parent{
	
	void message()
	{
		System.out.println("This is from subclass 2");
	}

}
public class Task1{
public static void main(String[] args){

	Parent s=new Subclass2();
	s.message();
	Parent s1=new Subclass1();
	s1.message();

}



}
