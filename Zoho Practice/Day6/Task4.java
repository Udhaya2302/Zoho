import java.util.Scanner;
class Task4{
	public static void main(String[] args){


	Scanner scan=new Scanner(System.in);
	
	String s1="a0b1c2";
	char c[]=new char[s1.length()];
	int m=1;
	int n=0;
	
	for(int i=0;i<s1.length();i++)
		
		{
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				c[m]=s1.charAt(i);
				m+=2;
			}
			if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
			{
				c[n]=s1.charAt(i);
				n+=2;
			}
		}
	
	for(int i=0;i<n;i++)
	{
		System.out.print(c[i]);
	}
	
	}
	}
	