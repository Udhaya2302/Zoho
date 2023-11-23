import java.util.Scanner;

class Task3{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	
	String s1=scan.nextLine();
	int activefrogs=0;
	int max=0;
	int c=0,r=0,o=0,a=0,k=0;
	
	for(char ch:s1.toCharArray())
	{
		
		
		if(ch=='c')
		{
			c++;
			activefrogs++;
		}
		else if(ch=='r')
		{
			r++;
		}
		else if(ch=='o')
		{
			o++;
		}
		else if(ch=='a')
		{
			a++;
		}
		else if(ch=='k')
		{
			if(c>0&&r>0&&o>0&&a>0)
			{
				c--;
				r--;
				o--;
				a--;
				k--;
				activefrogs--;
			}else{
				break;
			}
			
		}
		
		 max = Math.max(max, activefrogs);
	
	}
	
	if(max>0)
	{
		System.out.println(max);
	}else{
		System.out.println(-1);
	}
	
	
	}
}