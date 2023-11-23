import java.util.Scanner;
class Task1{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		String s1=scan.next();
		 
		String s2=scan.next();
		
		StringBuilder sb1=new StringBuilder(s1);
		
		StringBuilder sb2=new StringBuilder(s2);
			
		for(int i=0;i<sb1.length();i++)
		{
			
			if(s1.equals(s2))
			{
				System.out.println("true");
				System.exit(0);
			}
			char temp=sb1.charAt(0);
			sb1.deleteCharAt(0);
			sb1.append(temp);
			System.out.println(sb1);
			s1=sb1.toString();
			
		}
		System.out.println(false);
		
		
	}
	
	
}