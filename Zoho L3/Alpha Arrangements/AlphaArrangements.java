import java.util.Scanner;
import java.util.Arrays;

public class AlphaArrangements{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String...");
	String s=scan.nextLine();
	
	char a[]=s.toCharArray();
	
	StringBuilder caps=new StringBuilder();
	
	StringBuilder small=new StringBuilder();
	
	int m=0,l=0;
	for(int i=0;i<s.length();i++)
	{
		if(a[i]>='A'&& a[i]<= 'Z')
		{
			caps.append(a[i]);
		}
		if(a[i]>='a'&& a[i]<= 'z')
		{
			small.append(a[i]);
		}
	}
	
	System.out.println(caps);
	System.out.println(small);
	
	char cap[]=caps.toString().toCharArray();
	char sma[]=small.toString().toCharArray();
	
	for(int i=0;i<cap.length-1;i++)
	{
		for(int j=i+1;j<cap.length;j++)
		{
			if(cap[i]>cap[j])
			{
					char temp=cap[i];
					cap[i]=cap[j];
					cap[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(cap));
	
	
	} 

}
