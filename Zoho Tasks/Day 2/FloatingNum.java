import java.util.Scanner;

class FloatingNum{
public static void main(String[] args){

Scanner scan=new Scanner(System.in);
float a=scan.nextFloat();

if(a==0)
{
	System.out.println("Zero");
}
else if(a>0)
{
	System.out.println("Positive");
	if(a<1)
	{
		System.out.println(" Small");
	}
	else if(a>1000000)
	{
		System.out.println(" Large");
	}	
}
else 
{
	System.out.println("Negative ");
	if(a>-1)
	{
		System.out.println(" Large ");
	}
	else if(a<-1000000)
		{
			System.out.println(" Small");
		}
}



}
}