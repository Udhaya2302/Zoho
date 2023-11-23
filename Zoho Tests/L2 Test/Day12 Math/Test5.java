import java.util.*;

class Test5{
	public static void main (String args[] ){
		
		int low=1;
		int high=10;
		
		int n=high-low+1;
		int max=0;
		
		int cnt[]=new int [high+1];
		
		for(int i=low;i<=high;i++)
		{
			int num=i;
			int sum=0;
			
			while(num>0)
			{
				sum+=num%10;
				num/=10;
			}
			
			cnt[sum]+=1;
			//max=Math.max(++cnt[sum],max);
			
			
		}
		
		
			for(int i=0;i<cnt.length;i++)
			{
				if(cnt[i]>max)
				{
					max=cnt[i];
				}
			}
		
		System.out.println(Arrays.toString(cnt));
		System.out.println(max);
	}
		

}