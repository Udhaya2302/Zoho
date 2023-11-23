import java.util.Scanner;

class Task4{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	//System.out.println("Enter the no Balls...");
	
	int n=8;
	String s="BRRRRBRB";
	
	char a[]=s.toCharArray();
	
	int ct=0;
	for(int i=0;i<n;i++)
	{
		if((a[i]=='R'&& a[i+1]=='B')||(a[i]=='B'&& a[i+1]=='R'))
		{
			
			ct++;
			i++;
		}
	}
	System.out.println(ct);
	
	
	}


}