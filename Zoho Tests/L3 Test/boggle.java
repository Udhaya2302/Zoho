import java.util.*;

class Boggle{
	public static void main(String[] args){
		
		char a[][]={{'M','S','E','F'}
				{'R','A','T','D'}
				{'L','O','N','E'}
				{'K','A','F','B'}};
		
	String s[]={"START","NOTE","SAND","STONED"};
	
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a[j].length;k++)
				{
					fun(a,s[i],i,j,0);
				}
			}
		}
	}
	public static boolean fun(char[][])


}
