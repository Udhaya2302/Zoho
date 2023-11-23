import java.util.Scanner;
class Average{
int num1;
int num2;
int num3;

Average(int num1,int num2,int num3)
{
	this.num1=num1;
	this.num2=num2;
	this.num3=num3;
}

int calculate()
{
	int avg=(num1+num2+num3)/3;
	return avg;
}
}
class Task4{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter num1 : ");
	int num1=scan.nextInt();
	System.out.println("Enter num2 : ");
	int num2=scan.nextInt();
	System.out.println("Enter num3 : ");
	int num3=scan.nextInt();

	Average a=new Average(num1,num2,num3);
	System.out.println("Average = "+a.calculate());
}
}