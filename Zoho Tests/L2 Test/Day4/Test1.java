import java.util.Scanner;

class Test1{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int a[]=new int[n];
	
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
	System.out.println("Enter the sum : ");
	int k=scan.nextInt();
	int ct=0;
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if((a[i]+a[j])==k)
			{
				ct++;
			}
		}
	}
	System.out.println(ct);


}
}