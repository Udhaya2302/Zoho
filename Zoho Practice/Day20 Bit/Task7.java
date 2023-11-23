import java.util.Scanner;

class Task7{
	public static void main(String[] args)
	{
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Number...");
	int n=scan.nextInt();
	
	
	String bin=convertBinary(n);
	
	char a[]=bin.toCharArray();
	
	int ct=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]=='1')
		{
			ct++;
		}
	}
	System.out.println("Ans : "+ct);


}
public static String convertBinary(int n)
{
	
	if(n==0)
	{
		return "0";
	}
	StringBuilder sb=new StringBuilder();
	
	while(n>0)
	{
		int remain=n%2;
		sb.insert(0,remain);
		n=n/2;
	}
	
	//System.out.println(sb.toString());
	return sb.toString();
}
}