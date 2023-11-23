import java.util.Scanner;

class Test4{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int a[]=new int[n];
	int i,j,k;

	
		for( i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}

		int temp=0;
		for( i=0;i<n;i++)
		{
			if(i%2==0&&a[i]>0)
			{
				
				for(j=i+1;j<n;j++)
				{
					if(a[j]<0)
					{
						temp=a[j];
						break;
					}
				}

				for(k=j;k>=i;k--)
				{
					a[k]=a[k-1];
				}

				a[k]=temp;
			}
			
		}

	
		for( i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
}

}