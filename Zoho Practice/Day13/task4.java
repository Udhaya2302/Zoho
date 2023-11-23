import java.util.Scanner;

class Task4{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	int a[]= { 2, 7, 4, 0, 9, 5, 1, 3 };
	int k=20;
	
	System.out.println(rec(a,a.length-1,0,k));
	
	}
	public static boolean rec(int a[],int n,int ct,int target)
	{
		if(target==0 && ct==4)
		{
			return true;
		}
		
		if(ct>4 && n==0)
		{
			return false;
		}
		
		return rec(a,n-1,ct+1,target-a[n-1])||rec (a,n-1,ct,target);
	}
}