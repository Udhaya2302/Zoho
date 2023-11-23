import java.util.Scanner;

class Task6{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array size...");
	int size=scan.nextInt();

	int a[]=new int[size];
	int i,j;
	System.out.println("Enter the elements to the array ...");
	
	for( i=0;i<size;i++)
	{
		a[i]=scan.nextInt();
	}
	for( i=0;i<size;i++)
	{
		int max=0; 
		for(j=i+1;j<size;j++)
		{
			if(max<a[j])
			{
				max=a[j];
			}
		}
		a[i]=max;
	}
	a[size-1]=-1;

	for( i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
	


}
}