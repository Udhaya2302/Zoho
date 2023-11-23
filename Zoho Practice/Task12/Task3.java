import java.util.*;

class Task3{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Sum value...");
	int sum=scan.nextInt();
	
	Stack<Integer>a=new Stack<>();
	printCombinations(a,sum,1);
	
	
	}
	
	public static void printCombinations(Stack v,int sum,int index)
	{
		if(sum==0)
		{
			System.out.println(v);
		}
		for(int i=index;i<=sum;i++)
		{
			v.push(i);
			printCombinations(v,sum-i,i);
			v.pop();
		}
	}

}