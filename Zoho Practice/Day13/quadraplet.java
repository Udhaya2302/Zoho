import java.util.*;

class quadraplet{
	public static void main(String[] args)
	{
		int a[]={2, 7, 4, 0, 9, 5, 1, 3 };
	int k=4;
	int target=20;
	
	if(fun(a,0,k, target,new Stack<>()))
	{
		System.out.println("Quadraplet Exists....");
	}
	else
	{
		System.out.println("Quadraplet does not Exists...");
	}
	
	
	}
	
	public static boolean fun(int a[],int i,int k,int target,Stack<Integer>stack)
	{
		if(stack.size()==k)
		{
			int ans=sum(stack);
			if (ans == target) {
				System.out.println(stack);
				return true;
			}
			return false;
			// System.out.println(ans==target);
		}
		
		if (i == a.length) return false;
		
		stack.push(a[i]);
		if (fun(a,i+1,k,target,stack))
			return true;
		
		stack.pop();
		
		if (fun(a,i+1,k,target,stack))
			return true;
		
		return false; 
	}
	
	public static int sum(Stack<Integer> stack)
	{
		int add=0;
		for(Integer i:stack)
		{
			add+=i;
		}
		return add;
	}
	
	



}