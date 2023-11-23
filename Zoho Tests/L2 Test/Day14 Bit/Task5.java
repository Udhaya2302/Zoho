import java.util.*;

class Test5{
	public static void main(String[] args){
		
		int a[]={0,1,0,1,1,0,0,1};
		int n=7;
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<a.length-1;j++)
			{
				int temp=a[i-1];
				a[i]=!(temp^a[i+1]);
			}
			System.out.println(Arrays.toString(a));
		}
		
		
		
	}


}