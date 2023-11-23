import java.util.ArrayList;

public class ArrayListTask3{
	public static void main(String[] args){
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(5);
	al.add(10);
	al.add(15);
	al.add(20);
	al.add(2,33);
	System.out.println(al);

	al.remove(0);
	System.out.println(al);

	al.add(1,50);
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.contains(5));
	System.out.println(al.get(3));


}



}