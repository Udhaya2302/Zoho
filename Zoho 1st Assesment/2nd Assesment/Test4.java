import java.util.Scanner;

class Test4{
	//abaabc ---- o/p-abc
	public static void main(String[] args){
	
	Scanner scan=new  Scanner(System.in);
	System.out.println("Enter the  String ");
	String s=scan.next();
	char a[]=s.toCharArray();
	
	
	
	int max=0;
	int ct=0;
	
	for(int i=0;i<a.length;i++)
	{
		ct=1;
		
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]!=a[j])
			{
				ct++;
				
			}
			else
			{
				break;
			}
		}
		if(max<ct)
		{
			max=ct;
		}
	}
	System.out.println(max);
	
	
	}
	}