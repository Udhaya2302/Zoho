import java.util.Scanner;

class Task4{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		String s=scan.nextLine();
		
		char a[]=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			int n=(a[i]-'A');
			
			char m=(char)(90-n);
			System.out.print(m);
			
		}
	}
}