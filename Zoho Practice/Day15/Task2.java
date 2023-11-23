import java.util.Scanner;

class Task2{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		String s= "abcdddeeeeaabbbcd";
		
		
		int i=0;
		int j=0;
		
		while(i<s.length()-1)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				j++;
			}
			else
			{
				if(j-i>=3)
				{
					System.out.println(" "+ i +" " + (j-1));
				}
				i=j;
			}
			
		}
	
	}


}