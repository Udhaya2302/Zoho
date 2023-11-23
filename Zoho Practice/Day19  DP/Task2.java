import java.util.Scanner;

class Task2{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the num ...");
		//int n=scan.nextInt();
		
		int a[]={ 1,100,1,1,1,100,1,1,100,1};
		
		int prev1=a[0];
		int prev2=a[1];
		int current=-1;
		
		for(int i=2;i<a.length;i++)
		{
		 current=a[i]+Math.min(prev1,prev2);
			
			prev1=prev2;
			prev2=current;
		}
		
		int ans=(Math.min(prev1,current));
		System.out.println(ans);
		
		
		
		
		
	}
	
}