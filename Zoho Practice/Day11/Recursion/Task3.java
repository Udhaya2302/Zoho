import java.util.Scanner;

class Task3{
	public static void main(String[] args){
	
	Node n1=new Node(1);
	
	System.out.println(n1.data);
	
	}


}
class Node{
	int data;
	Node next;
	
	Node(int data){
	
		this.data=data;
		this.next=null;
	
	}

}