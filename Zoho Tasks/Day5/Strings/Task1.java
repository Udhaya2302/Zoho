import java.util.Scanner;

class Task1{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);

	String s;
	System.out.println("Enter the String..");
	s=scan.nextLine();

	System.out.println("Enter the Index ");
	int n=scan.nextInt();

	System.out.println(s.charAt(n));
}
}