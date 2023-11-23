import java.util.Scanner;

class Task3{

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	int a[]= {1,4,2,5,3};
	
	int n=a.length;
	
	int sum=0;
	
	for(int i=0;i<n;i++)
	{
		for(int j=i;j<n;j+=2)
		{
			for(int k=i;k<=j;k++)
			{
				sum+=a[k];
			}
		
		}
	}
	System.out.println(sum);
	
	
	
	}


}