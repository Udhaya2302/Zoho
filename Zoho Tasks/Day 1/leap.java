import java .util.Scanner;

class leap{
public static void main(String [] args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter the year");
int a=scan.nextInt();
Boolean leap= false;


if(a%4==0)
{
	leap=true;
	if(a%100==0)
	{
		if(a%400!=0)
		{
			leap=false;
		}
	}

}

if(leap)
{
	System.out.println("The Given Year is a Leap year");
}
else
{
	System.out.println("The Given Year is not  a Leap year");
}

}
}