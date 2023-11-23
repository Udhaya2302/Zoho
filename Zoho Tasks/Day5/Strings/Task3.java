import java.util.Scanner;

class Task3{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);

	String s1,s2;
	int ct=0;
	

	System.out.println("Enter the String..");
	s1=scan.nextLine();

	System.out.println("Enter the String..");
	s2=scan.nextLine();

	System.out.println(s1);
	System.out.println(s2);

	if(s1.length()==s2.length())
	{
		for(int i=0;i<s1.length();i++)

		{	if(s1.charAt(i)==s2.charAt(i)||s1.charAt(i)-32==s2.charAt(i)||s1.charAt(i)==s2.charAt(i)-32)
			{
				ct++;
			}

		}
		if(ct==s1.length())
		{
			System.out.println("Both Strings are Equal...");
		}
		else{

			System.out.println("Both Strings are not Equal...");
		}
	}
	else{
		System.out.println("String Lengths are not equal");
	}


	
}
}