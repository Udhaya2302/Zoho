import java.util.Scanner;

class SortedArray{
public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter array Size : ");
	int m=scan.nextInt();
	int a[]=new int[m];



	for(int i=0;i<m;i++)
	{
		a[i]=scan.nextInt();
	}

	System.out.println("Enter 2nd array Size : ");

	int n=scan.nextInt();
	int b[]=new int[n];

	for(int i=0;i<n;i++)
	{
		b[i]=scan.nextInt();
	}


	for(int i=0;i<m;i++)
	{
		if(a[i]>b[0])
		{
			int temp=a[i];
			a[i]=b[0];
			b[0]=temp;

			int first=b[0];
			int k;
			for(k=1;k<n && b[k]<first;k++)
			{
				b[k-1]=b[k];
			}
			b[k-1]=first;
		}
	}
		
	System.out.println("\nSorted Arrays:");
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	
	
}

}