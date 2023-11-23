import java.util.Map;
import java.util.HashMap;

class MapTask10{
public static void main(String[] args){

	Map<Integer,String>map1=new HashMap<Integer,String>();
	
	map1.put(1,"Uhay");
	map1.put(2,"Chandru");
	map1.put(3,"Praveen");
	map1.put(4,"Kumar");
	
	System.out.println(map1);
	
	map1.remove(3);
	
	System.out.println(map1);

	System.out.println("Contains Key : "+map1.containsKey(4));
	
	System.out.println("Size : "+map1.size());
	

}


}