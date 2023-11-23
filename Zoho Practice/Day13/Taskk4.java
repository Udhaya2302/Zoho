import java.util.*;

class Taskk4{

	public static void main(String[] args){
	
	int a[]={2, 3, 4};
	int k=2;
	
	
	fun(a,0,k, new Stack<>());
	
	
	}
	public static void fun(int a[],int i,int k,Stack<Integer>stack)
	{
		if(stack.size()==k)
		{
			System.out.println(stack);
			return;
		}
		
		if (i == a.length) return;
		
		stack.push(a[i]);
		fun(a,i+1,k,stack);
		
		stack.pop();
		fun(a,i+1,k,stack);
		
	}


}