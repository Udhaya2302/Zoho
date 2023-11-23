import java.util.Scanner;
class Task7{
	public static void main(String[] args){


	Scanner scan=new Scanner(System.in);
	
	String s="LeetcodeHelpsMeLearn";
	System.out.println("Enter the array Size ...");
	int n=scan.nextInt();
	int a[]=new int[n];
	int k=0;
	
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
		
	}
	StringBuilder sb1=new StringBuilder(s);
	
	for(int i=0;i<n;i++)
	{
		sb1.insert(a[i]+k," ");
		k++;
	}
	
	System.out.println(sb1.toString());
	
	
	
	
	}
	}
	