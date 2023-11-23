import java.util.Scanner;

class Task2{
	public static void main(String args[]){
	
	Scanner scan=new Scanner(System.in);
	int a[]={0, 1, 2, 6, 9, 11, 15};
	
	int target=17;
	
	
	
	int ans =fun(a,target,0 , a.length);
	System.out.println(ans);
	
	
	
	}
	public static int fun(int a[],int t,int start , int end)
	{
		if(start>end) return -1;
		if(start==end)return -1;
		
		int mid=(start+end)/2;
		if(a[mid]==t)
		{
			return mid;
		}else if(t<a[mid])
		{
			return	fun(a,t,start,mid-1);
		}else 
		{
			return	fun(a,t,mid+1,end);
		}
	}



}