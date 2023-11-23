import java.util.*;

class Task2{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Number  : ");
	int n=scan.nextInt();
	
	int ct=fun(n);
	int a[]=new int[ct];
	int b[]=new int[ct];
	
	for(int i=ct-1;i>=0;i--)
	{
		a[i]=n%10;
		b[i]=a[i];
		n/=10;
	}
	
	int temp=0;
	for(int i=0;i<ct;i++)
	{
		
		if(a[i]!=9)
		{
			temp=a[i];
			a[i]=9;
			
			break;
			
		}
	}
	for(int i=0;i<ct;i++)
	{
		
		if(a[i]==temp)
		{
			a[i]=9;
		}
	}
	System.out.println(Arrays.toString(a));
	
	for(int i=0;i<ct;i++)
	{
		
		if(b[i]!=0)
		{
			temp=b[i];
			b[i]=0;
			break;
			
		}
	}
	for(int i=0;i<ct;i++)
	{
		
		if(b[i]==temp)
		{
			b[i]=0;
		}
	}
	
	int large=0;
	for(int i=0;i<ct;i++)
	{
		large=(large*10)+a[i];
	}
	
	int small=0;
	for(int i=0;i<ct;i++)
	{
		small=(small*10)+b[i];
	}
	
	int ans=large-small;
	
	System.out.println(ans);
	
	
	
	
	
	}
	public static int  fun(int n)
	{
		int ct=0;
		while(n!=0)
		{
			ct++;
			n/=10;
			
		}
		return ct;
	}


}