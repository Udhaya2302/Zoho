import java.util.Scanner;

class Test1{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int n=9;
		int m=3;
		int temp=n;
		int carry=0;
		
		while(n!=0)
		{
			temp+=(n/m);
			n=n/m;
			carry=n%m;
			n+=carry;
		}
		temp+=carry/m;
		System.out.println(temp);
		
	}

}
