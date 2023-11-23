import java.util.Scanner;

class KadanesAlgorithm{
	public static void main(String[] args){
		
		int a[]={1,2,-5,3,4,-1,-2,-3};
		
		int max=0;
		int ans=0;
		
		int start = 0, end = 0, s = 0;
		
		for(int i=0;i<a.length;i++)
		{
			max+=a[i];
			
			if(ans<max)
			{
				ans=max;
				start = s;
				end = i;
			}
			if(max<0)
			{
				max=0;
				s = i + 1;
			}
		}
		System.out.println(ans);
		
		
		
	}




}