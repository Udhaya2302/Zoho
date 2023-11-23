import java.util.*;

class ReplaceWithProduct{

	public static void main(String[] args){
	
	int a[]={1,2,3,4,5};
	
	fun(a,a.length,1,0);
	
	System.out.println(Arrays.toString(a));
	
	}
	
	public static int  fun(int[]a,int n,int left,int i)
	{
		if(n==i)
		{
			return 1;
		}
		
		int curr=a[i];
		
		int right=fun(a,n,left*a[i],i+1);
		
		a[i]=left*right;
		
		return curr*right;
		
	}


}