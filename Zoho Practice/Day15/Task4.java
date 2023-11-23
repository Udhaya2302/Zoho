import java.util.Scanner;
class Task4{
	public static void main(String[] args){


	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the array Size ...");
	int n=scan.nextInt();
	String s[]=new String[n];
	for(int i=0;i<n;i++)
	{
		s[i]=scan.next();
	}
	
	
	int ct=0;

	

	for(int i=0;i<s.length;i++)

	{
		for(int j=0;j<s.length-1;j++)

		{
			if(s[j].charAt(i)>s[j+1].charAt(i))
			{
				ct++;
				break;
			}
		}
	
	}

	System.out.println(ct);

}



}