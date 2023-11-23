import java.util.Scanner;

class Task5{
	public static void main(String args[]){
	
	Scanner scan=new Scanner(System.in);
	int a[]={1,4,6,8,9};
	
	int i=0;
	int n=9;
	
	
	fun(a,i,n );
	//System.out.println(ans);
	
	}
	public static void fun(int a[],int i,int n)
	{
		if(i>n)
		{
			return;
		}
		int small =fun1(a,0,i);
		
		int large=fun2(a,0,i);
		
		System.out.println("Number  "+i+"  Ceiling  -> "+ large+" Floor -> "+small);
		fun(a,i+1,n);
		
	}
	public static int fun1(int a[],int s,int i)
	{	if(a[0]>i)
		{
			return -1;
		}
		
		else if(s < a.length && a[s]>i)
		{
			return a[s-1];
		}else if(a.length > s && a[s]==i)
		{
			return a[s];
		}
		else {
			return fun1(a,s+1,i);
		}
	}
	public static int fun2(int a[],int s,int i)
	{
		if(a[a.length-1]<i)
		{
			return -1;
		}
		
		if(a[s]>i)
		{
			return a[s];
		}
		else if(a[s]==i)
		{
			return a[s];
		}
		else {
			return fun2(a,s+1,i);
		}
	}
	
	
	
}