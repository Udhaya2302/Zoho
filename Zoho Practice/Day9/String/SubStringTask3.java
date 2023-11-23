import java.util.Scanner;

class SubStringTask3{
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	
	//System.out.println("Enter the String...");
	
	int  n=scan.nextInt();
	int element=scan.nextInt();
	int count=scan.nextInt();
	scan.nextLine();
	System.out.println("Enter the String....");
	String s1=scan.nextLine();
	
	char[] ch=s1.toCharArray();
	//int ct=0;
	int ans=0;
	
	for(int i=0;i<n-count;i++)
	{
		int ct=0;
		for(int j=i;j<=i+count;j++)
		{
			if(ch[j]=='1')
			{
				
				ct++;
				
			}
			if(ct>count)
			{
				ch[j]='0';
				ans++;
				
			}
		}
	}
	
	System.out.println(ch);
	System.out.println(ans);
	
	}
	
	}