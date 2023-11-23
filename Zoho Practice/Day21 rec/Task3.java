import java.util.Scanner;

class Task3{
	public static void main(String args[]){
	
	Scanner scan=new Scanner(System.in);
	int a[]={0, 1, 2,3,5};
	
	
	
	
	
	int ans =fun(a,0);
	System.out.println(ans);
	}
	
	public static int fun(int a[],int i)
	{
		if(i==a.length)
		{
			return i;
		}
		else if(i!=a[i])
		{
			return i;
		}
		else
		{
			return fun(a,i+1);
		}
	}
	
	
	}
	



