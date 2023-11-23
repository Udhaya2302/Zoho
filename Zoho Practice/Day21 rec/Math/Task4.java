import java.util.Scanner;

class Task4{
	
	public static void main(String[] args)
	{
		int a[]={0,1,3};
		int n=a.length;
		int cnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			int ct=fun(a,i);
			if(ct==0)
			{
				System.out.println(i);
				cnt++;
				break;
			}
		}
		if(cnt==0)
		{
			System.out.println(a.length);
		}
		
	}
	public static int fun(int a[],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				return 1;
			}
		}
		return 0;
	}
	
	
	
}