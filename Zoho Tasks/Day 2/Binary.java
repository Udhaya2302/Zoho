import java.util.Scanner;

class Binary{
public static void main(String [] args)
{
	Scanner scan=new Scanner(System.in);
	String s1=scan.nextLine();
	String s2=scan.nextLine();
	
	String s3="0b"+s1;
	String s4="0b"+s2;
	int a=s3;
 
	
	//int a=Integer.parseInt(s3);
	//int b=Integer.parseInt(s4);
	System.out.println(a);

}

}