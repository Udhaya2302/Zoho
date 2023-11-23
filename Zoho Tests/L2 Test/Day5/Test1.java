import java.util.Scanner;

class Test1{
	
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
				
			
			
				int ct=0;
				int i=0;
				
				while(i<n-1)
				{
				
					i+=a[i];
					ct++;
				}
				System.out.println(ct);
		}
}