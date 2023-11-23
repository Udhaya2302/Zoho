import java.util.Scanner;
class Task5{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		int n=0b11111111111111111111111111111101;
		System.out.println(n);
		int ct=0;
		while(n!=0)
		{
			if((n&1)==1)
			{
				ct++;
			}
			n=n>>>1;
		}
		System.out.println(ct);
		

		
	}


}