import java.util.Scanner;

class ExcelSheet{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	String s=scan.nextLine();
	
	char a[]=s.toCharArray();

	int n=s.length();
	int last=a[n-1]-64;
	int sum=1;
	if(n==1)
	{
		System.out.println(last);
	}
	else
	{
		for(int i=0;i<n-1;i++)
		{
			sum*=((a[i]-64)*26);
		}
		//System.out.println(sum);
		int ans=sum+last;
		System.out.println(ans);
	}
	
	
	}

}