import java.util.Scanner;

class Task4{
	public static void main(String args[]){
	
	Scanner scan=new Scanner(System.in);
	int a[]={0, 1, 2, 6, 9, 11, 15};
	
	int target=12;
	
	
	
	int ans =fun(a,target,0 );
	System.out.println(ans);
	
	}
	public static int fun(int a[],int t,int i)
	{
		if(i==a.length-1)
		{
			return -1;
		}
		if(t==a[i])
		{
			return i;
		}
		
		return fun(a,t,i+1);
	}
	
	
}