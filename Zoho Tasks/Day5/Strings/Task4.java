import java.util.Scanner;

public class Task4{
public static void main(String [] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Para ....");
	String a=scan.nextLine();

	System.out.println("Enter the Word to change..");
	String b=scan.nextLine();

	System.out.println("Enter the Word ..");
	String c=scan.nextLine();

	String s[]=a.split(" ");
	System.out.println(a);

	for(int i=0;i<s.length;i++)
	{	
		if(s[i].equals(b))
		{
			s[i]=c;

		}
	}

	
	for(String str:s)
	{
		System.out.println(str+" ");
	}

	
	

}
}