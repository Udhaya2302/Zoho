import java.util.Scanner;

class Task2{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array size...");
	int n=scan.nextInt();
	
	int a[]=new int[n];
		
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	
	int sum=0;
	int ct=0;
	for(int i=0;i<n;i++)
	{
		for(int j=i;j<n;j++)
		{sum=0;
			for(int k=i;k<=j;k++)
			{
				sum+=a[k];
			}
			if(sum==0)
			{
				System.out.println(true);
				ct++;
				System.exit(0);
			}

		}

	}
	if(ct==0)
	{
		System.out.println(false);
	}
}


}