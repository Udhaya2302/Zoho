import java.util.Scanner;
class Task2{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		String[] s={"bella","label","roller"};
		
		
		char a[]=s[0].toCharArray();
		char b[]=s[1].toCharArray();
		char c[][]=new char[s.length][s.length];
		
		int k=0;
		
		for(int i=0;i<3;i++)
		{
			c[i]=s[i].toCharArray();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				for( k=0;k<5;k++)
				{
					if(c[i][i]==c[j][k])
					{
						System.out.println(c[i][i]);
					}
				}
			}
			System.out.println();
		}
		
		
		
					
		
		
		}
		
	}
		
		