import java.util.Scanner;

class Test7{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int k=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i%2==0)
				{
					System.out.print(k++ +"   ");
				}
				else
				{
					System.out.print(--k+"   ");
				}
			}
			if(i%2==0)
			{
				k+=5;
			}
			else{
				k+=5;
			}
			System.out.println("\n");
		}
		
		
		
	}



}