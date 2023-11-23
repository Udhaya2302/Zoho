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

			while(n.next!=null)
			{
				System.out.println(n.data);
				n=n.next;
			}
			System.out.println(n.data);

	}

}
public static void main(String[] args){
	
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		
		l.insert(1);
	}
	
}