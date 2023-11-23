import java.util.Scanner;

class Task2{
	public static void main(String[] args){
		
		int a[]={1,2,3};
		
		for(int i=0;i<(1<<a.length);i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(((i>>j)&1)==1)
				{
					System.out.print(a[j]+" ");
				}
				
			}
			System.out.println();
		}
		
		
	}

}