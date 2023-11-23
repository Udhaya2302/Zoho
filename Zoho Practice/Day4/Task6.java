import java.util.Scanner;

class Task6{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int a[]=new int[n];

	
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}

	int k=a[0];
	int ct=1;
	

	while(k<n-1)
	{
		k+=a[k];
		ct++;

	}

	System.out.println(" "+ ct);
	

	

}
}