import java.util.Scanner;

class Task1{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array 1 Size...");
	int n=scan.nextInt();
	System.out.println("Enter the Array 2 Size...");
	int m=scan.nextInt();
	int a[]=new int[m];
	int b[]=new int[n];
	int c[]=new int[m+n];

	
		for(int i=0;i<m;i++)
		{
			a[i]=scan.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			b[i]=scan.nextInt();
		}

	int k=0;
	for(int i=0;i<m;i++)
	{
		c[k]=a[i];
		k++;
	}
	for(int i=0;i<n;i++)
	{
		c[k]=b[i];
		k++;

	}
	int ct=0;
	int cnt=0;

	

	for(int i=0;i<k;i++)
	{	ct=0;
		for(int j=i+1;j<k;j++)
		{
			if(c[i]==c[j])
			{
				ct++;
			}	
		}
		if(ct==0)
		{
			cnt++;
		}

	}
	System.out.println(" "+cnt);
	
	
}
}