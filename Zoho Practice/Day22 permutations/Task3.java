import java.util.*;

class Task3{
	public static void main(String[] args){
		
		String s="()(())";
		
		int ans=fun(s);
		System.out.println(ans);
	}
	public static int fun(String s)
	{
		Stack<Integer>stack=new Stack<>();
		int max=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				stack.push(i);
				
			}
			else
			{
				stack.pop();
				if(stack.isEmpty())
				{
					stack.push(i);
				}
				else
				{
						max=Math.max(max,i-stack.peek());
				}
			}
		
		}
		return max;
	}
	
	
	
}