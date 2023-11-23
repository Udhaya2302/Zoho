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

public class Task1{
	
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		
		l1.add(2);
		l1.add(4);
		l1.add(3);
		
		//l1.traverse();
		
		LinkedList l2=new LinkedList();
		l2.add(5);
		l2.add(6);
		l2.add(4);
		//l1.traverse();
		
		int sum=0;
		
		Node result = addSum(l1.head,l2.head,sum);
		//sum=(sum*10)+l1.head.data;
		
		print(result);
		
		//System.out.println(sum);
		
		
		
	}
	public static void print(Node result){
		
		while(result!=null)
		{
			System.out.println(" "+result.data);
			result=result.next;
		}
		
		
	}
	public static Node addSum(Node l1,Node l2,int carry)
	{ 
		if(l1==null && l2==null )
		{
			if(carry>0)
			{
				return new Node(carry);
			}
			return null;
		}
		
		int x= (l1!=null) ? l1.data : 0;
		int y=(l2!=null) ? l2.data : 0;
		
		int sum= x+y+carry;
		
		Node newNode =new Node(sum%10);
		
		carry=sum/10;
		
		if(l1!=null)
		{
			l1=l1.next;
		}
		if(l2!=null)
		{
			l2=l2.next;
		}
		newNode.next=addSum(l1,l2,carry);
		
		return newNode;
		
	
	}
	
	
	
	
	
}

