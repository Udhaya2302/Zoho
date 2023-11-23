import java.util.Scanner;

class Task5{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String...");
	
	String s=scan.nextLine();
	
	int n=s.length();
	int i=0;
	int j=0;
	int max=0;
	
	for(j=0;j<n;j++)
	{
		char currentch=s.charAt(j);
		int charIndex=s.indexOf(currentch,i);
		
		if(charIndex>=i&&charIndex<j)
		{
			i=charIndex+1;
		}
		max=Math.max(max,j-i+1);
	}
	System.out.println(max);

	}

}