import java.util.*;
public class Sorting implements Comparator<Customer>{
	
	public int compare(Customer c1 , Customer c2){
		return (c1.balance -c2.balance);
	}
	
}