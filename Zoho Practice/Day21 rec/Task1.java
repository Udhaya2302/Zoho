import java.util.*;

class Task1{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int a[]={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int m=4;
		
		int from=1;
		int to=8;
		
		for(int i=0;i<(to-from)/m;i++)
		{
			fun(a,m,from+(i*m)+1,from+m+(i*m));
		}
		System.out.println(Arrays.toString(a));
		
		
	}
	public static void fun(int a[] ,int m,int from,int to)
	{
		
		if(from>to)
		{
			return;
		}else
		{
			int temp=a[from];
			a[from]=a[to];
			a[to]=temp;
			
			 fun(a,m,from+1,to-1);
		}
	}


}
