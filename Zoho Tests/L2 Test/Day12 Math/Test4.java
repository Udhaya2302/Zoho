import java.util.Scanner;

class Test4{
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		String date="2019-02-10";
		
		String s[]=date.split("-");
		
		int year=Integer.parseInt(s[0]);
		int month=Integer.parseInt(s[1]);
		int day=Integer.parseInt(s[2]);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		int ans=0;
		
		for(int i=1;i<=7;i++)
		{
			
			if(i==month)
			{
				break;
			}
			if(i==2)
			{
				ans+=28;
			}else if(i%2==0)
			{
				ans+=30;
			}
			else
			{
				ans+=31;
			}
		}
		if(month>7)
		{
		for(int i=8;i<=12;i++)
		{
			if(i==month)
			{
				break;
			}
			
			else if(i%2==0)
			{
				ans+=30;
			}
			else{
				ans+=31;
			}
		
		}
		}
		
		int res=ans+day;
		System.out.println(res);
		
		
	}




}