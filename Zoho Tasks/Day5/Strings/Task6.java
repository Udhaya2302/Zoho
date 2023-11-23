import java.util.Scanner;

class Task6{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);

	String s1;
	
	int i,j;

	System.out.println("Enter the String..");
	s1=scan.nextLine();
	int n=scan.nextInt();

	int k=0;
	for(i=0;i<n;i++)
	{
		for(j=0;j<s1.length()/n;j++)
		{
			System.out.print(s1.charAt(k));
			k++;
		}
		System.out.println();
	}

}
}