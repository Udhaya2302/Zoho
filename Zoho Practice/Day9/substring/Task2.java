import java.util.Scanner;

class Task2{
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the String...");
	String s1=scan.nextLine();
	int n=s1.length();
	int ct=0;
	
	for(int i=0;i<n;i++)
	{
		ct++;
		int j=1;
		
		while((i-j >=0 && i+j<n) && s1.charAt(i-j) == s1.charAt(i+j) && s1.charAt(n/2) != s1.charAt(i+j)){
			
			ct++;
			j++;
		}
	}
	
	System.out.println(ct);
	
	
	
	}

}