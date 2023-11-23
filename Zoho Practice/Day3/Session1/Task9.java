import java.util.Scanner;

class Task9{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in );
	System.out.println("Enter the array size ...");
	int n=scan.nextInt();
	int min=1000;
	int max=0;

	int a[]=new int[n];
	int x=0,y=0;
	int u=0,v=0;

	for(int i=0;i<n;i++)
	{

		a[i]=scan.nextInt();

	}
	
	for(int i=0;i<n-1;i++)
	{
		for(int j=i;j<n;j++)

		{
			if((a[i]-a[j])<min)
			{
				x=a[i];
				y=a[j];
				min=a[i]-a[j];

			}
			if((a[i]-a[j])>min)
			{
				u=a[i];
				v=a[j];
				max=a[i]-a[j];

			}

		}

	}
System.out.println("Min  "+min+ x +" "+ y);
System.out.println("max  "+max+ u +" "+v);




}


}