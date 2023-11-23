
class BinarySearchdemo{

	public static void main(String[] args){

	BinarySearchTree bn=new BinarySearchTree();
	Node root=null;
	
	root=bn.insert(root,8);


}

}

 class BinarySearchTree{

	public Node createNewNode(int k){
	
	Node newNode=new Node(k);
		return newNode;

	}

	public Node insert(Node node,int data){

	
		if(node==null)
		{
			return createNewNode(data);
		}
		if(data<node.data)
		{
			node.left=insert(node.left,data);
		
		}else if(data>node.data)
		{

			node.right=insert(node.right,data);
		}
	return node;


}
	

}

	class Node{
	int data;
	Node left;
	Node right;

		Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;

		}
	




}
