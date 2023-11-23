import java.util.Scanner;
class Task7{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int[] a=new int [n];
	int i,j,k,m=0;
	for(i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	

	for(i=0;i<n;i++)
	{
		for(j=i;j<n;j++)
		{	
			int sum=0;
			for(k=i;k<=j;k++)
			{
				sum+=a[k];
				System.out.print(a[k]);
				
			}
		if(sum==0)
		{
			m++;
		}
		

			
		System.out.println();
		}
	}

		if(m!=0)
		{
			System.out.println(true);
		}else
		{
			System.out.println(false);
		}

		
}
}