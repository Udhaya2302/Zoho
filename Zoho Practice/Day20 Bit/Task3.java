import java.util.Scanner;

class Task3{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		int a[]={1,0,1,0,1,0,99};
		
		int ans=0;
		
		for(int i=0;i<32;i++)
		{
			int sum=0;
			for(int n:a )
			{
				sum+=(n>>i)&1;
			}
			
			if(sum%3!=0)
			{
				ans|=(1<<i);
			}
		}
		
		System.out.println(ans);
			
		}
		
		
	


}