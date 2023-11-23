import java.util.Scanner;

class SumofDiagonal{
	public static void main(String[] args)	
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the Matrix size...");
		int size=scan.nextInt();
		
		int a[][]=new int[size][size];
		int sum=0;
		int b[]=new int[size];

		System.out.println("Enter the values...");
		
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				a[i][j]=scan.nextInt();			
			}
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(a[i][j]);			
			}
			System.out.println();	

		}

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i==j)
				{
					sum+=a[i][j];
					b[i]=a[i][j];
				}
			}
			

		}
		for(int i=0;i<size;i++)

		{System.out.println(b[i]);	
		}
		
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{	
				int ct=0;
				if((i+j)==(size+1)/2)
				{
					for(int k=0;k<size;k++)
					{
						if(b[k]==a[i][j])
						{
							ct++;
						}
					}
				if(ct==0)
				{	
					sum+=a[i][j];
				}

				}
				
				
			}
			

		}

	System.out.println("Sum of Diagonals : "+sum);
		
	

		
	}
}