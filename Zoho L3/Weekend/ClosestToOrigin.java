import java.util.*;

class ClosestToOrigin{
	public static void main(String[] args)
	{
		int a[][]={{3,3},{5,-1},{-2,4}};
		
		int k=2;
		
		Arrays.sort(a,Comparator.comparing( p -> p[0]*p[0] + p[1]*p[1]));
		
		for(int i=0;i<k;i++)
		{
			System.out.println(Arrays.toString(a[i]));
		}
		
		
		
	}


}