import java.util.Scanner;

class Testt4{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];

	
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
	int temp=0;
	int x=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==0&&a[i]<0)
			{
				b[i]=a[i];
			}else if(i%2==0&&a[i]>0)
			{
				for(int j=x+1;j<n;j++)
				{
					if(a[j]<0)
					{
						 temp=a[j];
						x=j;
						break;
					}
				}
				for(int j=x;j>i;j--)
				{
					a[j]=a[j-1];

				}
				b[i]=temp;
			}

		}
	for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}

}

}