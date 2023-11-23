import java.util.*;

class Task3{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	
	System.out.println("Enter the combinations size");
	int k=scan.nextInt();
	
	rec(a,0,k,new Stack<>());
	
	}
	
	public static  void rec(int a[],int i,int k,Stack<Integer>stack)
	{
		if(stack.size()==k)
		{
			System.out.println(stack);
			return;
		}
		if(i>k)
		{
			return;
		}
		
		stack.push(a[i]);
		rec(a,i+1,k,stack);
		
		stack.pop();
		rec(a,i+1,k,stack);
		
	}



}