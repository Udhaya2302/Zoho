import java.util.*;
class Task2{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the array size...");
	int n=scan.nextInt();
	int a[]=new int[n];
	
	System.out.println("Enter the array Elements");
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	
	int b[]=new int[a.length];
	
	for(int i=0;i<a.length;i++)
	{
		int pro=fun(a,i);
		b[i]=pro;
		
	}
	
	System.out.println(Arrays.toString(b));
	
	}
	public static int  fun(int a[],int i)
	{
		int pro=1;
		for(int j=0;j<a.length;j++)
		{
			
			if(i==j)
			{
				continue;
			}
			else
			{
				pro*=a[j];
			}
		}
		return pro;
	}

}