import java.util.*;

class Test2{
	public static void main(String[] args){
		
		char a[]={'x','y','z'};
		
		fun(a,0,new Stack<>());
		
		
	}
	public static void fun(char a[],int i,Stack<Character>stack)
	{
		if(a.length==i)
		{
			System.out.println(stack);
			return;
		
		stack.push(a[i]);
		fun(a,i+1,stack);
		
		stack.pop();
		fun(a,i+1,stack);
		
		
	}

}