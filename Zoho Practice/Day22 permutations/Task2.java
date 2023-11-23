import java.util.*;

class Task2{
		public static void main(String[] args){
			
			
			int a[]={1,2,3};
			
		ArrayList<ArrayList<Integer>>result=fun(a,0,new ArrayList<>());
			
			for(ArrayList<Integer> ans: result)
			{
				System.out.println(ans);
			}
		
		}
		public static ArrayList<ArrayList<Integer>> fun(int a[],int start,ArrayList<ArrayList<Integer>>result)
		{
			if(start==a.length)
			{
				ArrayList<Integer>permutation=new ArrayList<>();
				
				for(Integer n: a)
				{
					permutation.add(n);
				}
				result.add(permutation);
			}
			
			
			for(int i=start;i<a.length;i++)
			{
				swap(a,start,i);
				
				fun(a,start+1,result);
				swap(a,start,i);
				
			}
			return result;
			
		}
		public static void swap(int a[],int start,int i)
		{
			int temp=a[start];
			a[start]=a[i];
			a[i]=temp;
		}



}