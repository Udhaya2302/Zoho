import java.util.*;


class Test4{

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Array Size");
	int m=scan.nextInt();
	
	int a[]=new int[m];
	for(int i=0;i<m;i++)
	{
		a[i]=scan.nextInt();
	}
	//int a[]={-1,0,1,2,-1,-4};
	char b[]=new char[m];
	
	int n=a.length;
	
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(a[i]+a[j]+a[k]==0)
				{
					int ct=0;
					
					char temp=(char)(a[i]+a[j]+a[j]);
				
					for(int c=0;c<b.length;c++)
					{
						if(temp==a[c])
						{
							ct++;
						}
					}
					
					if(ct==0){
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}
	}
	

}
