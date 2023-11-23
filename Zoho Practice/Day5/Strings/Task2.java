import java.util.Scanner;
class Task2{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();


		int res=0;
	
	for(int i=0;i<s.length();i++)
	{
		int s1=value(s.charAt(i));
		if((i+1)<s.length())
		{
			int s2=value(s.charAt(i+1));
		
			if(s1>=s2)
			{
				res+=s1;
			}
			else
			{
				res=res+s2-s1;
				i++;
			}
	
		}else{
			res=res+s1;

		}

	}
	
	System.out.println(res);



}
	public static int value(char r)
	{
		switch(r)
		{
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 8;
			case 'L':
				return 50;
			case  'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
		}
		return -1;

	}


}