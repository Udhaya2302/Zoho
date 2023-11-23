import java.util.Scanner;

class Task1{
	public static void main(String[] args){
	
	char a[][]={
				{'h','o','l','z'},
				{'a','l','o','o'},
				{'a','b','c','h'},
				{'o','k','j','o'}
				};
	
	String s="zoho";
	
	int rows=a.length;
	int cols=a[0].length;
	
	for(int i=0; i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			if(j+s.length()<=cols)
			{
				boolean ct=true;
				
				for(int k=0;k<rows;k++)
				{
					if(a[i][j+k]!=s.charAt(k))
					{
						ct=false;
						break;
					}
				}
				if(ct)
			{
				System.out.println("yes");
			}
			
			
		}
		
			if(i+s.length()<=cols)
			{
				 boolean ct=true;
				
				for(int k=0;k<rows;k++)
				{
					if(a[i+k][j]!=s.charAt(k))
					{
						 ct=false;
						break;
					}
				}
				if(ct)
			{
				System.out.println("yes");
			}
			}
		
		
	}
	
	}
	
	}
}