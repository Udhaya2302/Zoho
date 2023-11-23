import java.util.Scanner;

class Task7Strings{
public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the 1st String ");
	String s1=scan.nextLine();
	System.out.println("Enter the 2st String ");
	String s2=scan.nextLine();
	
	String s3=s1+s1;

	if(s1.length()==s2.length()&& (s1+s1).indexOf(s2)!=-1)
	{
		System.out.println("The String "+s2+" are rotations of each other ...");
	}
	else
	{
		System.out.println("The strings are not rotations of each other...");
	}
	
	
}
}