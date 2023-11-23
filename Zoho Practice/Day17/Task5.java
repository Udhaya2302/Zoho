import java.util.Scanner;

class Task5{
	public static void main(String[] args){
	
	Scanner scan =new Scanner(System.in);
	
	//int a[][]= {{1,2,3},{5,6,7},{9,10,11}};
	int a[][]={{1,2,3},{5,17,7},{9,11,10}};
	
	int max=0;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(i==j||(i+j)==(a.length-1))
			{
				boolean prime = fun(a[i][j]);
				
				if(prime)
				{
					if(a[i][j]>max)
					{
						max=a[i][j];
					}
				}
			
			}
		}
	}
	
	System.out.println("Max Prime : "+ max);
	
	
	}
	
	public static boolean fun(int n)
	{
		int ct=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				ct++;
				break;
			}
		}
		if(ct==0)
			return true;
		else
			return false;
	}



}