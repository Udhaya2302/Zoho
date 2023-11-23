import java.util.Scanner;

class Task2{
	public static void main(String[] args){
	
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Enter the Number....");
	int n=scan.nextInt();
	
	String s=Integer.toString(n);
	
	 char c[]=new char[s.length()+1];
	
	int k=s.length();
	int ct=0;
	
	for(int i=s.length()-1;i>=0;i--)
	{
		ct++;
		
		if(ct==4)
		{
			c[k--]='.';
			c[k--]=s.charAt(i);
		}
		else{
		c[k--]=s.charAt(i);
		}
		
	}
	String s1=new String(c);
	System.out.println(s1);
	
	
	
	}
}