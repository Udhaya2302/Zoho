
class LinkedList{
	Node head;
	
	LinkedList()
	{
		head=null;
		
	}
	class Node{
		int val;
		Node next;
	
	Node(int val)
	{
		this.val=val;
		this.next=null;
	}

	}

	public void add(int val)
	{
		Node newNode=new Node(val);
	
		if(head==null)
		{
			// if this node is the first node in the LinkedList................

			head=newNode;
			
		}
		else{
			// If the list contains already values...
    			
			Node n=head;

			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newNode;
		}

	}
	
	public void show()
		{
			Node node= head;
			while(node.next!=null)
			{
				System.out.println(node.val);
				node=node.next;
			}
				System.out.println(node.val);
			
		}

	
}

public class LinkedListTask1{
	public static void main(String[] args){
	
	LinkedList l=new LinkedList();
	l.add(5);
	l.add(10);
	l.add(15);
	l.show();


}



}
