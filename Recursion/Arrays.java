import java.util.*;
class Arrays{

	public static void main(String[] args){
	
	int a[]={1,2,3,4,5};
	
	fun(a,a.length-1,0);
	
	System.out.println(a);
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	}
	
	public static void fun(int a[],int end,int start)
	{
		if(start>=(a.length)/2)
		{
			System.out.println(a[start]);
			return ;
		}
		
		int temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		
		 fun(a,--end,++start);
		
	}
	
	

}