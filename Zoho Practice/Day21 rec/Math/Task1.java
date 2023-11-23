import java.util.*;
class Task1{
	public static void main(String[] args)
	{
	int a[]= {5,2,4};
	int b[]= {1,2,3,4};
	
	for(int i=0;i<a.length;i++)
	{
		int temp=fun(a[i],b);
		a[i]=temp;
	}
	System.out.println(Arrays.toString(a));
	
	}
	public static int fun(int a,int b[])
	{
		for(int i=0;i<b.length;i++)
		{
			if(a==b[i])
			{
				return fun(i,b[i],b);
			}
		}
		return -1;
	}
	public static int fun(int i,int a,int b[])
	{
		for(int j=i;j<b.length;j++)
		{
			if(b[j]>a)
			{
				return b[j];
			}
		}
		return -1;
	}
	

}