class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data=data;
				this.next=null;
			}

		}

class LinkedList{

	Node head;
	
	LinkedList()
	{
		this.head=null;
	}
	
	
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
	
	public void traverse(){
	
			Node n=head;

			while(n!=null)
			{
				System.out.print(n.data + " ");
				n=n.next;
			}
			System.out.println("");

	}

}
class Taskk3{
	public static void main(String[] args){
		
		LinkedList l1=new LinkedList();
		
		l1.insert(1);
		l1.insert(2);
		l1.insert(4);
		l1.traverse();
		
		LinkedList l2=new LinkedList();
		
		l2.insert(1);
		l2.insert(3);
		l2.insert(4);
		l2.traverse();
		
		Node check=sorting(l1.head,l2.head);
		
		printvalues(check);
		//l1.traverse();
	}
	
	public static void printvalues(Node check)
	{
		if(check.next==null)
		{
			return;
		}
		else{
			while (check!=null)
			{
				System.out.print(check.data + " ");
				check=check.next;
			}
		}
	}
	public static Node sorting( Node l1,Node l2)
	{
		if(l1==null)
		{
			return l2;
		}
		if(l2==null)
		{
			return l1;
		}
		
		if(l1.data<l2.data)
		{  
			l1.next=sorting(l1.next,l2);
			return l1;
		}
		else{
			l2.next=sorting(l1,l2.next);
			return l2;
		}
	}
}