import java.util.Scanner;

class Test4{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Range..");
	int n=scan.nextInt();
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	
	//int a[]={-1,0,3,5,9,12};
	
	System.out.println("Enyter the Target ");
	int target=scan.nextInt();
	int pos=-1;
	
	for(int i=0;i<n;i++)
	{
		if(a[i]==target)
		{
			pos=i;
		}
	}
	System.out.println(" pos : "+pos);
	
	
	}


}