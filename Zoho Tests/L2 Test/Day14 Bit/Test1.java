import java.util.*;
class Test1{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter left");
		int n=scan.nextInt();
		System.out.println("Enter right");
		int m=scan.nextInt();
		int temp=n;
		
		for(int i=n+1;i<m;i++)
		{
			 temp=temp&i;
		}
		System.out.println(temp);
	}


}