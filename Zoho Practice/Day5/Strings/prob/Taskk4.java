import java.util.Scanner;
class Taskk4{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String.....");
	String s1=scan.nextLine();
	

	char a[]=s1.toCharArray();
	int n=a.length;
	char b[]=new char[n];
	int k=0;	

	for(int i=0;i<n;i++)
	{
		if(a[i]>='a'&&a[i]<='z')
		{
			b[k]=a[i];
			k++;	
		}

	}
	
	int i=0;
	int j=b.length-1;
	
	while(i>j)
	{
		if(b[i]!=b[j])
		{
			System.out.println("Not a Palindrome ");
			break;
		}
	}
	
	System.out.println(" a Palindrome ");
}


}