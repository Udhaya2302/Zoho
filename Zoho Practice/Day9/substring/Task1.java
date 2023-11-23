import java.util.Scanner;

class Task1{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the String...");
	String s1=scan.nextLine();
	
	System.out.println("Enter the Left Pos ...");
	int l=scan.nextInt();
	System.out.println("Enter the Right Pos ...");
	int r=scan.nextInt();
	
	for(int i=l;i<=r;i++)
	{
		System.out.print(s1.charAt(i));
	}
	
	}

}