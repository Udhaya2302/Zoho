import java.util.Scanner;

class Binaryadd{
public static void main(String [] args)
{
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter Num 1 in Binary ");
	String s1=scan.nextLine();
	
	System.out.println("Enter Num 2 in Binary ");
	String s2=scan.nextLine();

	int a=Integer.parseInt(s1,2);
	int b=Integer.parseInt(s2,2);
	int c=a+b;

	String s3=Integer.toBinaryString(c);
	
	System.out.println("After Add "+s3);
	System.out.println("After Add "+(a+b));

}
}