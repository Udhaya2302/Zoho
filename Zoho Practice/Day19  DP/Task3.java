import java.util.Scanner;

class Task3{
	public static void main(String[] args){
		static int ct=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the num ...");
		int n=scan.nextInt();
		
		if(n%2==0)
		{
			System.out.println(true);
		}else
		{
			System.out.println(false);
		}
		
		
	}
}