abstract class Animal{
	abstract void  cats();
	 abstract void dogs();

}

class Cats extends Animal{

	void cats()
	{
		System.out.println("Cat Meows....");
	}
}

class Dogs extends Animal{

	void Dogs()
	{
		System.out.println(" Dog Barks....");
	}
}
public class Task4{
public static void main(String[] args){

	Animal A1=new Cats();
	A1.cats();
}}