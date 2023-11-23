import java.util.Scanner;

class Test1{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String..");
	System.out.println("Enter the String..");
	String s=scan.next();
	
	char a[]=s.toCharArray();
	
	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	}
	
	int n=a.length;
	
	int ct=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=i;k<=j;k++)
				{
					if(a[k]=='a'||a[k]=='e'||a[k]=='i'||a[k]=='o'||a[k]=='u')
					{
						ct++;
					}
				}
				

			}
		}
	
	System.out.println(ct);
	
	
	}
	
	

}