import java.util.Scanner;

class Taskk2{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	int a[]={1,2,3,4,5};
	
	pro(a,a.length);
	
	System.out.println(Arrays.toStrng(a));
	
	}
	
	public static void pro(int a[],int n)
	{
		if(n==0)
		{
			return;
		}
		
		int left[]=new int[n];
		int right[]=new int[n];
		left[0]=1;
		
		for(int i=1;i<n;i++)
		{
			left[i]=left[i-1]*a[i-1];
		}
		
		right[n-1]=1;
		
		for(int j=n-2;j>=0;j--)
		{
			right[j]=right[n+1]*a[n+1];
		}
		
		for(int i=0;i<n;i++)
		{
			a[i]=left[i]*right[i];
		}
		return a;
	}

}