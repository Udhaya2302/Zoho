//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.


class Node{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		next=null;
		
	}
}

class LinkedList {

	Node head;

	LinkedList()

	{
		this.head=null;
	}
	
	public void add(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		else{
			
			Node n=head;
			
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newNode;
		}
	}
	public void traverse()
	{
		Node n=head;
		
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}
		System.out.println("");
	}

}

class Task3{
	
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		
		l1.add(1);
		l1.add(7);
		l1.add(7);
		l1.add(7);
		l1.add(7);
		l1.add(7);
		l1.add(7);
		
		l1.traverse();
		Node prev=null;
		remove(l1.head,7,prev);
		l1.traverse();
		
	}
	
	public static void remove(Node l,int val,Node prev)
	{
		
		if(l==null)
		{
			return;
		}
		if(l.data==val)
		{
			
			prev.next=l.next;
			l=prev;
			
			//l=l.next;
			
		}
		prev=l;
		
		remove(l.next,val,prev);
		
	}
	
	
	
}

