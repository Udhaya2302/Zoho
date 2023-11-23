import java.util.Scanner;

class Taskk4{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	//System.out.println("Enter the no Balls...");
	
	String s="RBRRRRBBBRRRRBB";
	
	char a[]=s.toCharArray();
	
	int ct=0;
	for(int i=0;i<a.length-1;i++)
	{
		if((a[i]=='R'&& a[i+1]=='B')||(a[i]=='B'&& a[i+1]=='R'))
		//if(a[i]+a[i+1]=='R'+'B')
		{
			ct++;
			//i++;
			a[i+1]='G';
			
		}
		
	}
	System.out.println(ct);
	
	
	}


}