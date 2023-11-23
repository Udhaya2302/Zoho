import java.util.*;

class Test5{

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the String..");
	
	String s=scan.next();
	
	char a[]=s.toCharArray();
	int n=a.length;
	
	int b[]=new int[10];
	int k=0;
	
	for(int i=0;i<n;i++)
	{ 
		int sum=1;
		
		if(a[i]>='0'&& a[i]<='9')
		{
			 sum=a[i]-'0';
			
			while(++i<n)
			{
				if(a[i]>='0'&& a[i]<='9')
				{
					//System.out.println("aa"+sum+" "+a[i]);
					sum=(sum*10)+ (a[i]-'0');
					
					
				}
				else {
					
					break;
				}
			}
			b[k++]=sum;
			
		}
			
			
		}
		//System.out.println(Arrays.toString(b));
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum+=b[i];
		}
		System.out.println(sum);
		
	}
	
	
	

}