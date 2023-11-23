import java.util.Scanner;

class Task9{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);

	String s1;

	System.out.println("Enter the String..");
	s1=scan.nextLine();
	char[] a=s1.toCharArray();
	int n=s1.length();

	if(s1.length()>2)
	{	
		char temp=a[n-1];
		a[n-1]=a[n-2];
		a[n-2]=temp;
	}
	else
	{
		System.out.println("Length is Insufficient...");
	}
	
	s1=new String(a);
	
	System.out.println(s1);

	

}
}