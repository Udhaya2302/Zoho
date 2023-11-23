import java.util.Scanner;

class RatInMaze{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int a[][]={
					{1, 1, 1, 1},
					{1, 1, 0, 1},
					{0, 1, 0, 1},
					{1, 1, 1, 1}
				};
				
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
	}	
		//boolean ans=true;
		findpath(a,a.length,0,0);
		//System.out.println(ans);
	}
	
	
	
	/*public static void findpath(int a[][],int n,int i,int j)
	{	
		
		
		if(i==n && j==n)
		{
			//System.out.println(i+""+j);
			return;
		}
		
		if(a[i][j]==1)
		{
			System.out.println(a[i][j]+"a"+i+j);
			
			if(i+1<n);
			{
				findpath(a,n,i+1,j);
				
			}
			
			if(j+1<n)
			{
				findpath(a,n,i,j+1);
			
			}
		}
*/
public static void findpath(int a[][], int n, int i, int j) {
    if (i == n - 1 && j == n - 1) {
         System.out.println(a[i][j] + " -> " + i + j);
        return;
    }

    if (a[i][j] == 1) {
        System.out.println(a[i][j] + " -> " + i + j);

        if (i + 1 < n) {
            findpath(a, n, i + 1, j);
        }

        if (j + 1 < n) {
            findpath(a, n, i, j + 1);
        }
    }
}

		
		
		
		
		
		
	}
	
	
		
		
		
	
	
	



