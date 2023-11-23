import java.util.*;


class Test3{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	String s="aaaabbbbcccc";
	char a[]=s.toCharArray();
	
	char b[]=new char[a.length];
	
	char min=200;
	char min2=0;
	int k=0;
	
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]<min && a[i]<min2)
		{
			min=a[i];
			a[i]=200;
			b[k++]=min;
			min2=min;
			
		}
	}
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(b[i]);
	}
	
	
	
	}
	


}