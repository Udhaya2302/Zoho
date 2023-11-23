import java.util.Scanner;




}import java.util.*;

class Test2{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		  System.out.println("Enter the Array size...");
		  int n=scan.nextInt();
		  
		  int a[]=new int[n];
		  
		  for(int i=0;i<n;i++)
		  {
			  a[i]=scan.nextInt();
		  }
		
		for(int i=0;i<n;i++)
		{
			if(i%2==1)
			{
				int temp=a[i];
				a[i]=a[i-1];
				a[i-1]=temp;
				
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}