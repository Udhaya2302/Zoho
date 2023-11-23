import java.util.*;

class Task33{
	public static void main(String[] args){
		
		String s="(((())))()";
		int ct=0;
		
		Stack<Character>stack=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				stack.push(s.charAt(i));
			}
			else
			{
				if(s.charAt(i)==')'&& !stack.isEmpty())
				{
					//if(stack.peek()=='(')
					//{
						ct++;
						stack.pop();
					//}
					
				}
				
			}
		}
		
		System.out.println(ct);
		
		
		
	}



}