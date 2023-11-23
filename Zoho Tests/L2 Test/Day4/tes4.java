import java.util.Scanner;

class tes4{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array Size...");
	int n=scan.nextInt();
	int a[]=new int[n];
	int cnt=0;
	int ct=0;

	
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{	
			if(a[i]%2==0)
			{
				ct++;
			}
			if(a[i]%2==1)
			{
				cnt++;
			}

		}
	
	int x=0;
	int y=0;
	for(int i=0;i<n;i++)
	{
		if(i%2==0&&x<cnt)
		{
			for(int j=x;j<n;j++)
			{
				if(a[j]<0)
				{
					System.out.println(a[j]);
					x=j+1;
					break;
				}
			}

		}else if(i%2==1&&y<ct)
		{
			for(int j=y;j<n;j++)
			{
				if(a[j]>0)
				{
					System.out.println(a[j]);
					y=j+1;
					break;
				}
			}

		}
		else{
			System.out.println(a[i]);
		}
			
	}


}
}