import java.util.Scanner;

class Task5{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);

	String s1;
	
	int i,j;

	System.out.println("Enter the String..");
	s1=scan.nextLine();
	
	for(i=0;i<s1.length();i++)
	{	
		int ct=0;
		for(j=i+1;j<s1.length();j++)
		{
			if(s1.charAt(i)==s1.charAt(j))
			{
				ct++;
			}
		}

		if(ct==0)
		{
			System.out.println(s1.charAt(i));
			break;
		}

	}

}
}
