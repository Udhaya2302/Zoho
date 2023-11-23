import java.util.Scanner;

class Task5{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the String...");
	String s=scan.nextLine();
	
	
	System.out.println("Enter the Broken keys...");
	String s2=scan.next();
	
	//String s="hello world";
	//String s2="ad";
	
	String[] a=s.split(" ");
	
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum+=fun(a[i],s2);
		
	}
	System.out.println(sum);
	
	
	}
	public static int fun(String s1,String s2)
	{
		for(int i=0;i<s2.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s2.charAt(i)==s1.charAt(j))
				{
					return 0;
				}
			}
		}
		return 1;
	}
}