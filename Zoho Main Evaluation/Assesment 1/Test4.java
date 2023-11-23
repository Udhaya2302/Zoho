import java.util.Scanner;

class Test4{
	
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Name...");
	String s=scan.nextLine();
	
	char b[]=s.toCharArray();
	
	
		char a[][]={{'A','B','C','0'},
				{'D','E','F','0'},
				{'G','H','I','0'},
				{'J','K','L','0'},
				{'M','N','O','0'},
				{'P','Q','R','S'},
				{'T','U','V','0'},
				{'W','X','Y','Z'}};
				
				for(int i=0;i<4;i++)
				{
					for(int j=0;j<4;j++)
					{
						System.out.println(a[i][j]);
					}
					System.out.println();
				}
	
		for(int k=0;k<b.length;k++)
		{
			
				for(int i=0;i<8;i++)
				{
					for(int j=0;j<4;j++)
					{
						if(b[k]==a[i][j])
						{
							System.out.println(" "+(i+2)+"("+(j+1)+")");
						}
					}
					
				}
		}
	
	
	}

}
