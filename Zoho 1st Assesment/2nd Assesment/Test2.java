import java.util.Scanner;

class Test2{
	public static void main(String[] args){
	
	Scanner scan=new  Scanner(System.in);
	System.out.println("Enter the  String ");
	String s=scan.next();
	
	
	char a[]=s.toCharArray();
	char b[]=new char[s.length()];
	
	int n=a.length;
	int k=0;
	int ct=0;
	
	
	for(int i=0;i<n;i++)
	{
		ct=0;
		for(int j=i+1;j<n;j++)
		{
			if(a[i]==a[j])
			{
			ct++;
			}
		}
		
		if(ct==0)
		{
			b[k++]=a[i];
			//System.out.println(a[i]);
		}
	}
	
	for(int i=0;i<k;i++)
	{
		 ct=0;
		for(int j=0;j<a.length;j++)
		{
			if(b[i]==a[j])
			{
				ct++;
			}
		}
		
		System.out.print(b[i]+" "+ct);
	}
	
	
	
	
	
	}

}