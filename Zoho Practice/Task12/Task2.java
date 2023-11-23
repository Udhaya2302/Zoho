import java.util.Scanner;

class Task2{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array size");
	int n=scan.nextInt();
	int b[]=new int[5];
	
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	
	}
	int ct=0;
	int k=0;
	
	for(int i=0;i<n;i++)
	{ct=0;
		for(int j=i;j<n;j++)
		{
			if(a[i]==a[j])
			{
				ct++;
			}
			
		}
		if(ct==1)
		{
			b[k]=a[i];
			k++;
		}
	}
	
	for(int i=0;i<k;i++)
	{
		System.out.println(b[i]);
	
	}
	
	
	
	
	
	}

}