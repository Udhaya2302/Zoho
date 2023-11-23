import java.util.Scanner;

class Task5{
	
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
				int k=0,m=0;
				int max1=0;
				int ma1=0;
				int ma2=0;
				
				for(int i=0;i<n;i++)
				{
					for(int j=n-1;j>=0;j--)
					{
						k=j-i;
						
						if(k>max1&&a[j]>a[i])
						{
							max1=k;
							ma1=i;
							ma2=j;
							
						}
						
					}
				}
				System.out.println(ma2-ma1);
				
				}
				}