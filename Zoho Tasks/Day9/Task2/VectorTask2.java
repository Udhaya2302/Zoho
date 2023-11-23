import java.util.Vector;

public class VectorTask2{
	public static void main(String[] args){
	
	Vector<String> v1=new Vector<>();
	v1.add("aaa");
	v1.add("bbb");
	v1.add("ccc");
	System.out.println(v1);
	
	v1.remove(1);
	System.out.println("Remove index : "+v1);
	
	v1.add(1,"ddd");
	System.out.println("add index : "+v1);

	v1.set(2,"EEE");
	System.out.println("Set index : "+v1);

	System.out.println(v1.size());

}



} 