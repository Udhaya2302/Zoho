import java.util.Scanner;

class Test4{
	
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
				
				int m=a.length/2;
				int ct=0;
				int max=0;
				int maxE=0;
				int j;
				
				for(int i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
					{
						if(a[i]==a[j])
						{
							ct++;
						}
						
					}
					if(max<ct)
					{
						max=ct;
						maxE=a[i];
					}
				}
				
				if(maxE>m)
				{
					System.out.println(maxE);
				}
				else{
					System.out.println("No such elements found..");
				}
				
				
				
				
				}
				
				
				}