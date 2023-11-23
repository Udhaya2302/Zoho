import java.util.Scanner;

class Sumofodd{
public static void main(String[] args)
{

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Num : ");
	int a=scan.nextInt();
	int sum=0;
	
	for(int i=0;i<=a;i++)
	{
		if(i%2!=0)
		{
			sum+=i;
		}
	}
	System.out.println("Sum of odd Numbers upto "+ a +" is "+sum);
}

}