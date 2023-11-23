import java.util.Scanner;

class Test3{

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Array Size");
	int n=scan.nextInt();
	int a[]=new int[n];
	
	
	
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	
	System.out.println("Enter the Array Size");
	int m=scan.nextInt();
	int b[]=new int[m];
	
	for(int i=0;i<m;i++)
	{
		b[i]=scan.nextInt();
	}
	
	
	//int a[]={1,4,2,3};
	//int b[]={4,-3,6,10,20,30};
	
	//int d=2;
	int d=a.length-2;
	int ct=0;
	int cnt=0;
	int k=0;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			int ans=Math.abs(a[i]-b[j]);
			if(ans>d)
			{
				ct++;
				
			}
			else
			{
				cnt++;
			
			}
			
		}
	}
	if(ct>0 && cnt>0)
	{
		
		k=2;
	}
	else{
		k=1;
	}
	
	
	System.out.println("Ans "+k);
	
	
	
	}


}