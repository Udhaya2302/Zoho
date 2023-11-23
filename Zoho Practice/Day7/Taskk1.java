import java.util.Scanner;
class Taskk1{
	public static void main(String[] args){
	
		Scanner scan=new Scanner(System.in);
		
		String s1=scan.nextLine();
		
		String s2=scan.nextLine();
		
		System.out.println(concat(s1,s2));
	
	}
	public static int concat(String s1,String s2)
	{
		if(s1.length() % s2.length()!=0)
		{
			
			
			return -1;
		}
		
		String con=s2;
		int noOfConcat=s1.length()/s2.length();
		
		for(int i=1;i<noOfConcat;i++)
		{
			con+=s2;
			
		}
		if(s1.equals(con))
		{
			char a[]=s2.toCharArray();
			int ct=0;
			int m=1;
			
			for(int i=0;i<a.length-1;i++)
			{	ct=0;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						ct++;
					}
					
				}
				if(ct==0)
					{
						m++;
					}
			}
			return m;
		}
		else
		{
			
			return -1;
		}
	
	}
}