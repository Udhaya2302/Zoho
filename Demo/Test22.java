import java.util.*;

class Test22{

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the String...");
	
	String s=scan.nextLine();
	System.out.println("Enter the num");
	int n=scan.nextInt();
	
	// thr gvv jserh jn
	String s1[]=s.split(" ");
	
	for(int i=0;i<s1.length;i++)
	{
			if(i % 2 == n)
			{
				String s2 = s1[i];
				reverse(s2);
				
				
			}
			else
			{
				System.out.print (" "+s1[i]+"  ");
			}
	}
	
	
	}
	public static void reverse(String s)
	{
		char a[]=s.toCharArray();
		int m=a.length-1;
		
		for(int i=0;i<a.length/2;i++)
		{
			char temp=a[i];
			a[i]=a[m];
			a[m]=temp;
			m--;
		}
		
		System.out.print(a);
	}

}