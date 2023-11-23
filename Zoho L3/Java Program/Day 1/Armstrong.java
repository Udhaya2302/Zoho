
import java.util.Scanner;

class Armstrong{
public static void main(String [] args){

Scanner scan=new Scanner(System.in);
System.out.println("Enter the Number...");

int a=scan.nextInt();
int b=a;
int ct=0;
int c,pro,sum=0;

while(b!=0)
{
	b=b/10;
	ct++;
}
b=a;

while(b!=0)
{
	pro=1;
	c=b%10;
	b/=10;
	for(int i=0;i<ct;i++)
	{
		pro*=c;
	}

	sum+=pro;
	
}

if(sum==a)
{
	System.out.println("The Given Num is Armstrong...");

}
else
{
	System.out.println("The Given Num is not a Armstrong Number ...");
}

}
}