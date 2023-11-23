import java.util.Scanner;

class Test3{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int a[]=new int[n];

	
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int temp=a[n-1];

		for(int i=n-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;

		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}


}