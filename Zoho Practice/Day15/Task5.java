import java.util.Scanner;

class Task5{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	
	String str="2019-02-10";
	
	String a[]=str.split("-");
	
	int year=Integer.parseInt(a[0]);
	int month=Integer.parseInt(a[1]);
	int date=Integer.parseInt(a[2]);
	int days=0;
	
	System.out.println(year+" "+month+" "+date);
	
	int i=0;
	while(i<month-1)
	{
		if(year%4==0)
		{
			days+=29;
			i++;
		}
		else if(i==1)
		{
			days+=28;
			i++;
		}
		
		else if(i%2==1)
		{
			days+=30;
			i++;
		}
		else
		{
			days+=31;
			i++;
		}
	}
	
	System.out.println("Days : "+(days+date));


	}
}