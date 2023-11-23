import java.util.ArrayList;
import java.util.Collections;

public class SortTask5{
	public static void main(String[] args){
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	al.add(3);
	al.add(1);
	al.add(7);
	al.add(4);
	al.add(6);
	al.add(0);

	System.out.println(al);

	Collections.sort(al);
	System.out.println("After Sorting...");
	System.out.println(al);


}



}