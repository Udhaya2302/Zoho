import java.util.Queue;
import java.util.LinkedList;

public class Queue1{
	public static void main(String[] args){

	Queue<String> queue=new LinkedList<>();

	queue.add("Uday");
	queue.add("Dinesh");
	queue.add("Hari");
	queue.add("Ganesh");

	System.out.println(queue);

//remove elements at front ...................
	System.out.println(queue.poll());

	System.out.println(queue);

// Searching elements.........................

	System.out .println(queue.contains("Kumar"));

}


}