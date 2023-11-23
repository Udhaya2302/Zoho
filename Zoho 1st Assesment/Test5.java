import java.util.Scanner;

class Test5{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	
	int a,x;
	int b,y;
	
	System.out.println("Enter a value..");
	a=scan.nextInt();
	System.out.println("Enter a jump.");
	x=scan.nextInt();
	System.out.println("Enter b value..");
	b=scan.nextInt();
	System.out.println("Enter b jump..");
	y=scan.nextInt();
	boolean loop=true;
	
	
	int m=a;
	int n=b;
	
	
	int ct=0;
	int cnt=0;
	
	
	while(loop)
	{
		m+=x;
		ct++;
		n+=y;
		cnt++;
		
		if(m>n||n<m)
		{
			System.out.println("No");
			loop=false;
		}
		
		if(m==n&&ct==cnt)
		{
			System.out.println("Yes");
			loop=false;
			
		}
		
		
		
	}
	

}
}