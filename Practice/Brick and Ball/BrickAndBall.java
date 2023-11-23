import java.util.Scanner;

class BrickAndBall{
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		char a[][]=new char[7][7];
		
		//char a[][]={'w','w','w','w','w','w','w'},{'w','0','0','0','0','0','w'},{'w','0','1','1','1','0','w'},{'w','0','1','1','1','0','w'},{'w','0','0','0','0','0','w'},{'w','0','0','0','0','0','w'},{'w','w','w','w','w','w','w'};
		
		/*a[0][]={'w','w','w','w','w','w','w'};
		a[1][]={'w','0','0','0','0','0','w'};
		a[2][]={'w','0','1','1','1','0','w'};
		a[3][]={'w','0','1','1','1','0','w'};
		a[4][]={'w','0','0','0','0','0','w'};
		a[5][]={'w','0','0','0','0','0','w'};
		a[6][]={'w','w','w','o','w','w','w'};*/
		
	
		
		for(int i=0;i<7;i++)
	{
		for(int j=0;j<7;j++)
		{
			if(i==6&&j==3)
			{
				a[i][j]='o';
			}
			else if (i == 0  || j == 0 || j == 6)
			{
				a[i][j]='w';
			} else if (i == 2&& j == 2||i==2&j==3||i==2&&j==4||j==3&&i==3||j==4&&i==3||j==2&&i==3)
			{
				a[i][j]='1';
			}
			else if(i==6&&j==1||i==6&&j==2||i==6&&j==4||i==6&&j==5){
                    a[i][j] = 'g';
		}
		else{
                    a[i][j] = '0';
		}
		
	} 
	}
	
	System.out.println("Enter for up");
	int n=scan.nextInt();
	{
		if(n>0)
		{
			int i=3;
		for(int j=6;j>=0;j--)
		{
			if(a[j][i]=='1')
			{
				a[j][i]='4';
				break;
			}
			
		}
		}
	}
	for( int i=0;i<7;i++)
	{
		for(int j=0;j<7;j++)
		{
			System.out.print("  "+a[i][j]);
		}
		System.out.println(" ");
	}
	
	
	System.out.println("Enter for Left...");
	int m=scan.nextInt();
	
	if(m>0)
	{
		int j=4;
		int ct=0;
		
		for(int i=6;i>=0;i--)
		{
			if(a[i][j]=='1')
			{
				a[++i][j]='0';
				a[6][j]='o';
				a[++i][j]='4';
				a[6][3]='g';
				break;
			}
			else if(ct>0)
			{
				i++;
				j++;
				a[i][j]='4';
			}
			else if(j==0)
			{
				ct++;
				i++;
				//j++;
			}
			else if(a[i][j]!='1')
			{
				j--;
				a[i][j]='4';
			}
			
		}
	}
		
		//for(int i=2;i<)
	
	for( int i=0;i<7;i++)
	{
		for(int j=0;j<7;j++)
		{
			System.out.print("  "+a[i][j]);
		}
		System.out.println(" ");
	}
	
		
	
	
	
	
	
	}

	


}