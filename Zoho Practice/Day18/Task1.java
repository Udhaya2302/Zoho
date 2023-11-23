import java.util.Scanner;

class Task1{

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the String...");
		
		String s=scan.next();
		
		char a[]=s.toCharArray();
		int n=a.length;
		
	
		int k=n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print(a[i]);
				}
				
				else if((i+j)==(n-1))
					
				{
					System.out.print(a[k--]);
				}
				
				else
				{
					System.out.print(" ");
				}
				
				if ((i==j) && ((i+j)==(n-1))) 
				{
					k--;
				}
			}
			System.out.println();
		}
		
		}
		
	}