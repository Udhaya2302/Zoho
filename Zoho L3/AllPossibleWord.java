import java.util.*;

class AllPossibleWord{
	public static void main(String[] args){
	
	char a[][]={{'M','S','E','F'},
				{'R','A','T','D'},
				{'L','O','N','E'},
				{'K','A','F','B'}};
				
	String s[]={"START","NOTE","SAND","STONED"};
	
	wordBoggle(a,s);
	
	
	
	}
	public static void wordBoggle(char a[][],String dictionary[])
	{
		int n=a.length;
		int m=a[0].length;
		
		Set <String> store=new HashSet<>();
		
		for(String s:dictionary)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(dfs(a,s,n,m,i,j,0))
					{
						store.add(s);
					}
					
				}
			}
		}
		for(String s:store)
		{
			System.out.println(s);
		}
		
	}

	public static boolean dfs(char a[][],String s,int n,int m,int i,int j,int id)
	{
		if(i<=0 || i>m || j<=0 || j>n)
		{
			return false;
		}
		
		if(s.charAt(id)!=a[i][j])
		{
			return false;
		}
		if(id==s.length()-1)
		{
			return true;
		}
		char temp=a[i][j];
		
		a[i][j]='*';
		
		
		boolean aa=dfs(a,s,n,m,i,j+1,id+1);
		
		boolean b=dfs(a,s,n,m,i,j-1,id+1);
			
		boolean c=dfs(a,s,n,m,i+1,j,id+1);
		
		boolean d=dfs(a,s,n,m,i-1,j,id+1);
		
		boolean e=dfs(a,s,n,m,i+1,j+1,id+1);
		
		boolean f=dfs(a,s,n,m,i+1,j-1,id+1);
		
		boolean g=dfs(a,s,n,m,i-1,j+1,id+1);
		
		boolean h=dfs(a,s,n,m,i-1,j-1,id+1);
		
		a[i][j]=temp;
		
		return aa||b||c||e||f||g||h||d;
		
	}

}