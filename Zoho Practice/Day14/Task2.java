import java .util.*;

class Task2{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the number..");
	int n=scan.nextInt();
	
	if(n<=0)
	{
		System.out.println("Invalid Input...");
		return;
	}
	
	int a[]=new int[n];
	int m=n;
	for(int i=0;i<n/2;i++)
	{
		a[i]=(i+1);
		a[m-1]=a[i]*-1;
		m--;
		
		
	}
	System.out.println(Arrays.toString(a));
	
	
	
	}
	



}