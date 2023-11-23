import java.util.*;
class Test2{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter String \n");
		String s=scan.nextLine();
		
		System.out.println("Enter n");
		int n=scan.nextInt();
		
		char a[]=s.toCharArray();
		
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				a[i]=' ';
				i++;
			}
		}
		
		int ct=0;
		for(int i=0;i<a.length;i++)
		{
			ct=0;
			for(int j=0;j<a.length;j++)
			{
				if( a[i]==a[j] && a[i]!=' ')
				{
					
					ct++;
				}
				
			}
			if(ct=n)
			{
			
				System.out.println(a[i]);
					a[i]=' ';
			}
		}
	
		
	}




}