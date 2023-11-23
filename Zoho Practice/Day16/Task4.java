import java.util.Scanner;

class Task4{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	String s=scan.next();
	
	if(s.charAt(0)>='a'&&s.charAt(0)<='h'&& s.charAt(1)>='1'&&s.charAt(1)<='8')
	{
		int a=s.charAt(0);
		int b=s.charAt(1)-'0';
		if(a%2==1)
		{
			if(b%2==0)
			{
				System.out.println(true);
			}else{
				System.out.println(false);
			}
		}
		else{
			if(b%2==1)
			{
				System.out.println(true);
			}else{
				System.out.println(false);
			}
		}
		
		
		
	}else
	{
		System.out.println("Invalid Input...");
	}
	
	
	}

}

