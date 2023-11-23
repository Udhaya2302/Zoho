import java.util.Scanner;
class Task1{
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Array size...");
	int n=scan.nextInt();
	
	int a[]=new int[n];
		
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}

	int max=Integer.MIN_VALUE;
	int max_end=0;

	for(int i=0;i<n;i++)
	{
		max_end+=a[i];
		if(max<max_end)
		{
			max=max_end;
		}
		if(max_end<0)
		{
			max_end=0;
		}
	}

	System.out.println(max);




}



}