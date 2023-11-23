import java.util.Scanner;

class Test1{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the char array");
		
		String s=scan.nextLine();
		
		char[] a=s.toCharArray();
		int  n=a.length;
		int m=a.length;
		
		int j=0;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			{
				char temp=a[i];
				
				for( j=i+1;j<m;j++)
				{
					a[j-1]=a[j];
				}
				a[j-1]=temp;
				i--;
				n--;
				
				
			}
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
		
	}

}
