import java.util.Scanner;
class Taskk2{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		String[] s={"bella","label","roller"};
		String str=" " ;
		
		char a[]=s[0].toCharArray();
		char b[]=s[1].toCharArray();
		char c[]=new char[a.length];
		
		int k=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					str+=a[i];
					b[j]='1';
				}
				
			}
		}
		System.out.println(ToFind(2,c,s));
		
	
		
		}
		public static void ToFind(int n,String str ,String s)
		{
			if(str=="" )
			{
				return st;
			}
			if(n==s.length)
			{
				return st;
			}
				String newStr=s[n];
				char[] charArr=str.toCharArray();
				String s="";
				
			for(int i=0;i<newStr.length();i++)
			{
				for(int j=0;j<charArr.length;j++)
				{
					if(newStr.charAt(i)==charr[j]){
						
					chararr[j]=1;
					}
				}
			}
			return ToFind(n+1,s,arr);
			
		}
		
	}
		
		