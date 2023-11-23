import java.util.Stack;
import java.util.LinkedList;

public class Stack1{
	public static void main(String[] args){

	Stack<String> stack=new Stack<String>();

// Adding elements...............

	stack.add("Uday");
	stack.add("Dinesh");
	stack.add("Hari");
	stack.add("Ganesh");

	System.out.println(stack);

//remove elements at front ...................

	System.out.println(stack.pop());

	System.out.println(stack);

// Searching elements.........................

	System.out .println(stack.contains("Kumar"));

}


}