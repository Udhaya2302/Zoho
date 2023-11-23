//Given an integer array, find all distinct combinations of a given length k, where the repetition of elements is allowed.

//For example,

//Input:  {1, 2, 3}, k = 2

//Output: {1, 1}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {3, 3}


import java.util.*;

class Taskk2{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array size");
	int n=scan.nextInt();
	
	int a[]=new int[n];
	int c[]=new int [n];
	
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	
	}
	
	int ct=0;
	int k=0;
	
	for(int i=0;i<n;i++)
	{ct=0;
		for(int j=i;j<n;j++)
		{
			if(a[i]==a[j])
			{
				ct++;
			}
			
		}
		if(ct==1)
		{
			c[k]=a[i];
			k++;
		}
	}
	
	
	System.out.println("Enter K value...");
	int m=scan.nextInt();
	
	int b[]=new int[m];
	
	
	printCombinations(c,b,0,0);
	
	
	
	}
	
	public static void printCombinations(int a[],int b[],int start,int index)
	{
		int n=a.length;
		int r=b.length;
		
		if(index==r)
		{
			System.out.println(Arrays.toString(b));
			return;
		}
		
		for(int i=start ; i<=n && n-i >= r-index && a[i]!=0 ;i++)
		{
			b[index]=a[i];
			
			printCombinations(a,b,start++,index+1);
		}
		
	}

}