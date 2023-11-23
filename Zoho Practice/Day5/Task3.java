import java.util.Scanner;

class Task3{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array size...");
	int n=scan.nextInt();
	
	int a[]=new int[n];
		
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	
	int pro=1;
	int max=0;
	for(int i=0;i<n;i++)
	{
		for(int j=i;j<n;j++)
		{pro=1;
			for(int k=i;k<=j;k++)
			{
				pro*=a[k];
			}
			if(pro>max)
			{
				max=pro;
			}

		}

	}
	
		System.out.println(" " +max);
	
}


}