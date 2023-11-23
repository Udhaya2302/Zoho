import java.util.Scanner;

class Task2{
	
		public static void main(String[] args){
				
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter the Array Index ...");
				
				int n=scan.nextInt();
				
				int a[]=new int[n];
				
				System.out.println("Enter the Array Elements ...");
			
				for(int i=0;i<n;i++)
				{
					a[i]=scan.nextInt();
					
				}
				System.out.println("Enter the sum...");
				int sum=scan.nextInt();
				
				
				for(int i=0;i<n-1;i++)
				{
					for(int j=i+1;j<n;j++)
					{
						for(int k=j+1;k<n;k++)
						{
							if(sum==a[i]+a[j]+a[k])
							{
								System.out.println("" +a[i]+" "+a[j]+" "+a[k]);
							}
						}
					}
				}
		}
}