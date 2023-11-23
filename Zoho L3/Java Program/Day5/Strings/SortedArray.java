import java.util.Scanner;

class SortedArray{
public class void main(String[] args){
	
	System.out.println("Enter array Size : ");
	int m=nextInt();
	int a[]=new int[m];

	System.out.println("Enter array Size : ");
	int n=nextInt();
	int a[]=new int[n];

	for(int i=0;i<m;i++)
	{
		a[i]=scan.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		b[i]=scan.nextInt();
	}


	for(int i= n - 1; i>=0;i--)
	{
		init j,last= a[m-1];
		for(j=m-2; j>=0 && a[j]>b[i]; j--)
		{
			a[j+1]=a[j];
			
		if(last>b[i])
		{
			a[j+1]=b[i];
			b[i]=last;
		}
		}

	}
	
}

}