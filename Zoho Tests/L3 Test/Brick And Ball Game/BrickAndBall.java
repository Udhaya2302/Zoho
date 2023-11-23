import java.util.Scanner;

class BrickAndBall{

	static Scanner scan=new Scanner(System.in);
	static int life=0;



	public static void main(String[] args){
	
	System.out.println("Enter the wall Size...");
	int n=scan.nextInt();
	
	String a[][]=new String[n][n];
	
	
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==n-1 && j==n/2)
			{
				//System.out.print(" O");
				a[i][j]="O";
			}
			else if(i==0||j==0||j==n-1)
			{
				a[i][j]="W";
			}
			else if(i==n-1)
			{
				a[i][j]="G";
			}
			else{
				a[i][j]=" " ;
			}
		}
	}
	
	printgame(a,n);
	
	
	System.out.println("Enter the No of Bricks...");
	int bricks=scan.nextInt();
	
	for(int i=0;i<bricks;i++)
	{
		System.out.println("Enter X & y pos...");
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		a[x][y]= "1";
		
		printgame(a,n);
	}
	
	System.out.println("Enter the Ball Life");
	 life=scan.nextInt();

	System.out.println( "life : " + life);	
	
	
	while (true)
	{
		System.out.println(" 1 -> up ");
		System.out.println(" 2 -> left ");
		System.out.println(" 3 -> Right ");
		
		int pos=scan.nextInt();
		switch(pos)
		{
			case 1:
				up(a,n);
				break;
				
			case 2: 
				left(a,n);
				break;
				
			case 3:
				right(a,n);
				break;
		}
		
	}

	}
	
	public static void up(String a[][],int n)
	{
		int ballX=0;
		int ballY=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j].equals("O"))
				{
					ballX=i;
					ballY=j;
				}
			}
		}
		//System.out.println(" "+ballX+ballY);
		
		//for(int i=ballX;i>0;i--)
		//{
			while(ballX>0){
				
			if(a[ballX][ballY].equals("1"))
			{
				a[ballX][ballY]=" ";
				life=life-1;
				break;
			}
			ballX--;
			}
		printgame(a,n);
		
		System.out.println( "Life : "+(life-1));
		if(--life<=0)
		{
			System.out.println("  Game Over...");
			return;
		}
		
		
		
	}
	
	public static void left(String a[][],int n)
	{
		//Finding Ball pos...........
		int ballX=0;
		int ballY=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j].equals("O"))
				{
					ballX=i;
					ballY=j;
				}
			}	
		}
		a[ballX][ballY]="G";
			
			ballY=ballY-1;
			a[ballX][ballY]="O";
			
			up(a,n);
		
		
		
		
	}
	public static void right(String a[][],int n)
	{
		//Finding Ball pos...........
		int ballX=0;
		int ballY=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j].equals("O"))
				{
					ballX=i;
					ballY=j;
				}
			}	
		}
		a[ballX][ballY]="G";
			
			ballY=ballY+1;
			a[ballX][ballY]="O";
			
			up(a,n);
		
	}
	
	
	
	
	public static void printgame(String a[][],int n)
	{
		for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
	}

	

}
