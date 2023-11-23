import java.util.ArrayList;

public class SpaceSeperatedTask8{

	public static void main(String[] args){
	
	ArrayList<Integer> al=new ArrayList<>();
	
	al.add(2);
	al.add(3);
	al.add(5);
	al.add(7);
	al.add(9);
	al.add(1);


	for(int i=0;i<al.size();i++)
	{
		System.out.print(al.get(i));
		
		if(i<al.size()-1)
		{
			System.out.print(" ");
		}
	
	}


}

}