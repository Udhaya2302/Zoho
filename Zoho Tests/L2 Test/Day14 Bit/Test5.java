import java.util.*;

class Test5{
	public static void main(String[] args){
		
		int a[]={1,0,0,1,0,0,1,0};
		int n=1000000000;
		
		
		for(int i=0;i<n;i++)
		{
			int temp=a[0];
			for(int j=1;j<a.length-1;j++)
			{
				//int temp=a[j-1];
				int ans=(temp^a[j+1]);
				//System.out.println(ans);
				temp=a[j];
				a[j]=(ans==0)?1:0;
			}
			
			a[a.length-1]=0;
			a[0]=0;
			
			//System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
		
		
	}


}