import java.util.*;

class Task1{static int c=0;
		public static void main(String[] args){
			
			
			String s="Zozho";
			
			char a[]=s.toCharArray();
			
		ArrayList<ArrayList<Character>>result=fun(a,0,new ArrayList<>());
			
			for(ArrayList<Character> ans: result)
			{
				System.out.println(ans);
			}
		System.out.println(c);
		}
		public static ArrayList<ArrayList<Character>> fun(char a[],int start,ArrayList<ArrayList<Character>>result)
		{
			if(start==a.length)
			{
				ArrayList<Character>permutation=new ArrayList<>();
				
				for(Character n: a)
				{
					
					permutation.add(n);
				}
				result.add(permutation);
				c++;
			}
			
			
			for(int i=start;i<a.length;i++)
			{
				swap(a,start,i);
				
				fun(a,start+1,result);
				swap(a,start,i);
				
			}
			return result;
			
		}
		public static void swap(char a[],int start,int i)
		{
			char temp=a[start];
			a[start]=a[i];
			a[i]=temp;
		}



}