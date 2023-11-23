import java.util.Scanner;

class Test2{

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Range..");
	int n=scan.nextInt();
	
	int ct=0;
	for(int i=2;i<n;i++)
	{
		ct=0;
		
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				ct++;
			}
		}
		if(ct==0)
		{
			System.out.println(i+" ");
		}
	}
	
	}


}