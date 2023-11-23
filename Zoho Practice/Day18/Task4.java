import java.util.Scanner;

class Task4{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the num ...");
	int n=scan.nextInt();
	
	for(int i=0;i<n;i++)
	{
		int k=i;
		for(int sp=0;sp<n-i-1;sp++)
		{
			System.out.print(" ");
		}
		
		for(int j=0;j<(i*2)+1;j++)
		{
			
			if(j<((i*2)/2))
			{
				System.out.print(k+1);
			k--;
			}
			else
			{
				System.out.print(k+1);
			k++;
			}
			
			
			
		}
		
		System.out.println();
	}
	
	for(int i=1;i<n;i++)
	{
		int k=n-i;
		for(int sp=0;sp<i;sp++)
		{
			System.out.print(" ");
		}
		
		for(int j=0;j<(n*2)-(i*2)-1;j++)
		{
			
			if(j<((n*2)-(i-2)-(i+1))/2)
			{
				System.out.print(k);
			k--;
			}
			
			else
			{
				
				System.out.print(k+2);
				k++;
			
			}	
		}
		
		System.out.println();
	}
	
	
	}

}