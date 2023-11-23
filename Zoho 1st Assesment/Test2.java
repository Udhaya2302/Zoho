import java.util.Scanner;

class Test2{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the String...");
	String s=scan.nextLine();
	System.out.println("Enter the String 2...");
	String b=scan.nextLine();
	
	StringBuilder sb=new StringBuilder(s);
	
	System.out.println(sb);
	
	int k=0;
	int ct=0;
	for(int i=0;i<s.length();i++)
	{
		if(sb.charAt(i)==b.charAt(k))
		{
			k++;
			ct++;
			for(int j=i+1;j<s.length();j++)
			{
				if(sb.charAt(j)==b.charAt(k))
				{
					k++;
					ct++;
				}
			}
			if(ct==b.length())
			{
			sb.removeIndex(i,k);
			}
		}
		
	}
	System.out.println(ct);
	
	

	}


}