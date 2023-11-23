import java.util.Scanner;

class Test4{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the num....");
		int n=scan.nextInt();
		
		int ans=fun(n);
		System.out.println("Ans : "+ans);
		
	}
	public static int  fun(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
		{
			return 1;
		}
		
		return fun(n-1) + fun (n-2);
	}


}