import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class reverseTask6{
	public static void main(String[] args){
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	al.add(3);
	al.add(1);
	al.add(7);
	al.add(4);
	al.add(6);
	al.add(0);

	System.out.println(al);

	//Comparator cmp=new comparator<Integer>();
	
	Collections.sort(al,new Comparator<Integer>()

	{
		public int compare(Integer o1,Integer o2){
			return o2.compareTo(o1);
		}
	});
	System.out.println("After Sorting...");
	System.out.println(al);


}



}