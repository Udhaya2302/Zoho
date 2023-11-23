import java.util.Scanner;

class Task7{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Number   : ");
	
	int n=scan.nextInt();
	
	System.out.println("Enter the T value...");
	int t=scan.nextInt();
	
	
	int ans=maxAchievable(n,t);
	
	System.out.println(ans);
	
	}
	
	public static int maxAchievable(int num,int t)
	{
		int diff=Math.abs(num-t);
		
		if(t>=diff)
		{
			return num+2*diff;
		}
		else{
			return num + t+ (diff-t);
		}
	}
	
}