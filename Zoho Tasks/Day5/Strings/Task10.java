import java.util.Scanner;

class Task10
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter String 1");
	String s1=scan.nextLine();

	System.out.println("Enter String 2");
	String s2=scan.nextLine();
	char b[]=new char[10];
	char a[]=new char[10];
	int k=0;
	int ct=0; 
	
	
	int n1=s1.length();
	int n2=s2.length();
	
	if(s1.length>s2.length)
	{
		char a[]=s1.toCharArray();
		ct++;
	}
	else if(s1.length<s2.length)
	{
		char a[]=s1.toCharArray();
	}
	
	for(int i=n1-n2;i<(n1>n2?n1:n2);i++)
	{
		b[k]=a[i];
		k++;
	}
	
	

	
}
	
}