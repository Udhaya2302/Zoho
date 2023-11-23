import java.util.Scanner;

class Task4{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println(" Num Ones : ");
	int ones=scan.nextInt();
	
	System.out.println(" Num Zeros : ");
	int zeros=scan.nextInt();
	
	System.out.println(" Num negs : ");
	int negs=scan.nextInt();
	
	System.out.println("Enter the Sum : ");
	int k=scan.nextInt();
	
	int a[]=new int[ones+zeros+negs];
	
	for(int i=0;i<ones;i++)
	{
		a[i]=1;
	}
	for(int i=ones+zeros;i<ones+zeros+negs;i++)
	{
		a[i]=-1;
	}
	
	int sum=0;
	for(int i=0;i<k;i++)
	{
		sum+=a[i];
	}
	
	System.out.println(" MAX Sum : "+ sum );
	
	
	
	
	
	
	}

}