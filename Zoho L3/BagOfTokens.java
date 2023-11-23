import java.util.Scanner;

class BagOfTokens{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		int a[]={100,200,300,400};
		int power=200;
		
		int score=fun(a,power);
		System.out.println(score);
		
	}
	
	public static int fun(int a[],int power)
	{
		int score=0;
		int k =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<power && a[i]!=-1)
			{
				score++;
				power=power-a[i];
				a[i]=-1;
			}
			else
			{
				int max=findMax(a);
				score--;
				power+=max;
				k=i;
			}
			if(k !=0 )
			{
				i--;
				k=0;
			}
			
		}
		return score;
		
	}
	public static int findMax(int a[])
		{
			int max=0;
			int i=0;
			int j=-1;
			while(i<a.length)
			{
				if(a[i]>max)
				{
					max=a[i];
					j=i;
				}
				i++;
				
			}
			
			a[j]=-1;
			return max;
		}
	


}