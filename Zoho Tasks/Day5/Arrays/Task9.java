
import java.util.Scanner;

class Task9{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int a[]=new int[n];
	
	int i,j,k;

	System.out.println("Enter the Array Elements....");
	for(i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}

	System.out.println("Enter the 2nd Array Size...");
	int m=scan.nextInt();
	int b[]=new int[m];

	for(i=0;i<m;i++)
	{
		b[i]=scan.nextInt();
	}

	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)

		{
			if(b[i]<a[j])
			{
				int temp=a[n-1];
				{
					for(k=n-1;k>j;k--)
					{
						a[k]=a[k-1];
					}
					a[j]=b[i];

					for(int l=0;l<m-1;l++)
						{
							b[l]=b[l+1];
						}
						for(int e=0;e<m;e++)
						{
							if(temp<a[i])
							{
								for(k=n-1;k>j;k--)
								{
									b[k]=b[k-1];
								}
									a[e]=temp;
							}
						}
					
					break;
				}
				
			}
		}
	}

	for(i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}

	for(i=0;i<m;i++)
	{
		System.out.println(b[i]);
	}

}
}