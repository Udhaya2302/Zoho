import java.util.Scanner;
class Task4{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String.....");
	String s1=scan.nextLine();
	

	char a[]=s1.toCharArray();
	int n=a.length;
	

	for(int i=0;i<n;i++)
	{
		if(a[i]==' ')
		{
			for(int j=i;j<n;j++)
			{
				a[j]=a[j+1];
				
			}
		}

	}
	for(int i=0;i<n;i++)
	{
	System.out.print(a[i]);
	}

	int m=n;
	int ct=0;
	for(int i=0;i<n/2;i++)
	{	if(ct>0)
		{
			System.out.println("It is not a palindrome...");
			break;
		}
		
		if(a[i]!=a[n-1])
		{
			ct++;
			
		}
	}
	if(ct==0)
	{

		System.out.println("It is  a palindrome...");
	}

}


}