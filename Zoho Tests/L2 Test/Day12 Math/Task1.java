import java.util.Scanner;

class Task1{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int n=9;
		int m=3;
		int temp=n;
		
		while(n!=0)
		{
			temp+=n%m;
			n=n/m;
			
		}
		System.out.println(temp);
		
	}

}
