import java.util.Scanner;

class Test4{

public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter The Array Size...");
	int n=scan.nextInt();
	
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	
	for(int i=0;i<n-1;i++)
	{
		for(int j=i;j<n;j++)
		{
			if(a[i+1]==a[j])
			{
				System.out.println("  "+a[i]);
				System.exit(0); 	
			}
		}
	}


}
}