import java.util.Scanner;

class Task2{
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		String s=scan.nextLine();
		
		char a[]=s.toCharArray();
		int j=a.length-1;
		int i=0;
		
		rec(a,i,j);
		System.out.println(a);
		
		
	}
	public static void rec(char a[],int i,int j)
	{
		
		if(!(i<j) )
		{
			return ;
		}
		else
		{
			char temp=a[i];
			
			a[i]=a[j];
			a[j]=temp;
			 rec(a,i+1,j-1);
		}
	}
	
		
		
	


}