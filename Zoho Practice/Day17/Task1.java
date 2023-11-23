import java.util.Scanner;

class Task1{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Number   : ");
	int n=scan.nextInt();
	
	for(int i=2;i<=5;i++)
	{
		while(n%i==0)
		{
			n=n/i;
		}
	}
	if(n==1)
	{
		System.out.println(true);
	}else
	{
		System.out.println(false);
	}
	
	
	}



}