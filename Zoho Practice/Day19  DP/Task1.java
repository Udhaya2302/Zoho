import java.util.Scanner;

class Task1{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		String s1="bac";
		String s2="ahbgdc";
		
		boolean ans= fun(s1,s2);
		System.out.println(ans);
		
		
		
	}
	
	public static boolean fun(String s1,String s2)
	{
		int m=s1.length();
		int n=s2.length();
		
		boolean dp[][]=new boolean[m+1][n+1];
		
		for(int i=0;i<=n;i++)
		{
			dp[0][i]=true;
		}
		
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					dp[i][j]=dp[i-1][j-1];
				}
				else
				{
					dp[i][j]=dp[i][j-1];
				}
			}
		}
		
		return dp[m][n];
		
		
	}


}