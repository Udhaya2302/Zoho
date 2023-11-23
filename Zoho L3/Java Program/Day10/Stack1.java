class LinkedList{

	Node head;
	
	LinkedList()
	{
		this.head=null;
	}

	class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data=data;
				this.next=null;
			}

		}
// Adding Elements ...................

	public void insert(int data)
	{
		Node newNode=new Node(data);

		// if no nodes present in the list.........

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

// To show the Elements in the Linked List........

	public void traverse(){
	
			Node n=head;

			while(n.next!=null)
			{
				System.out.println(n.data);
				n=n.next;
			}
			System.out.println(n.data);

	}

//Delete at pos................................

public void remove(int pos){

	Node n=head;
	if(head==null)
	{	
		System.out.println("List is Empty......");
	}
	else{
		
		Node m=null;
		for(int i=0;i<pos;i++)
		{
			m=n;
			n=n.next;
			
		}
		m.next=n.next;
	}
	}
// Update Element at given pos.................

	public void update(int pos,int data)
	{
		Node newNode=new Node(data);
		Node n=head;
		Node m=null;

		if(head==null&&pos>1)
		{
			System.out.println("Enter Valid Input...");
		}
		else{
			for(int i=0;i<pos;i++)
			{
				m=n;
				n=n.next;
			}
			newNode.next=n;
			m.next=newNode;
			
		}
		


	}

// find Elements in the Linked List..........................

public int find(int data)
	{
		int ct=0;
		Node n=head;
		while(n!=null)
		{
			if(n.data==data)
			{
				return ct;
			}
			n=n.next;
			ct++;

		}
		return -1;
		
	}

public int pop(){
	Node n=head;
	Node m=null;
	
	while(n.next!=null)
	{
		m=n;
		n=n.next;
	}
	m.next=null;
	
	return n.data;

}
}

// Pop Elements in the stack.....................................



public class Stack1
{

	public static void main(String[] args){
	
	LinkedList l1=new LinkedList();
	
	System.out.println("After Insert : ");
	l1.insert(1);
	l1.insert(2);
	l1.insert(3);
	l1.insert(4);
	l1.traverse();
	System.out.println();
	System.out.println("After remove : ");
	l1.remove(2);
	l1.traverse();
	System.out.println();
	System.out.println("After Update : ");
	l1.update(1,33);
	l1.traverse();
	System.out.println();
	System.out.println("Pos : "+l1.find(2));
	System.out.println();
	System.out.println("Pop : "+l1.pop());
	System.out.println();
	l1.traverse();

}



}