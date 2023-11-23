import java.util.Scanner;
class Task6{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
	int a[]={1,1,1,1,1,1,1,1,1,1,1,1};
	
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
		
	}
	System.out.println(sum);
	
	int side=sum/4;
	System.out.println(side);
	
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			
			
			for(int k=0;k<a.length;k++)
			{
				/*int m=k;
				if(a[k]==side)
				{
					a[k]=0;
				}
				else{
					while(a[i]+a[m]>0)
					{
						
					}
				*/
				
				
				if(a[j]+a[k]==side && k!=j)	
				{
					a[j]=0;
					a[k]=0;
				}
				if(a[k]==side)
				{
					a[k]=0;
				}
			}
		}
	}
	
	int ct=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0)
		{
			ct++;
			break;
		}
	}
	if(ct==0)
	{
		System.out.println(true);
	}else
	{
		System.out.println(false);
	}
	
	
	}



}