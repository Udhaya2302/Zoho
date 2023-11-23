import java.util.Scanner;

class Task6{

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	int digit=3;
	
	int sum=6;
	
	
	int start=findStart(digit);
	int end=start*10;
	
	printNums(start,end,sum);
	
	
	}
	public static int  findStart(int num)
	{
		int n=1;
		int m=1;
		while(m!=num)
		{
			n=n*10;
			m++;
		}
		return n;
	}
	public static void printNums(int start,int end,int sum)
	{
		if(start>=end)
		{
			return;
		}
		if(sum(start)==sum)
		{
			System.out.print(start +" ");
		}
		printNums(start+1,end,sum);
		
	}
	
	static int sum(int n)
	{
		int sum=0;
		
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
	}


}