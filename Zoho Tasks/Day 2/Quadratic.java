import java.util.Scanner;

class Quadratic{
public static void main (String[] args)
{
	Scanner scan=new Scanner(System.in);
	double root1,root2,d,sqroot;
	
	System.out.println("Enter value a : ");
	double a=scan.nextDouble();
	System.out.println("Enter value b : ");
	double b=scan.nextDouble();
	System.out.println("Enter value c : ");
	double c=scan.nextDouble();

	if(a==0&&b==0&&c==0)
	{
		System.out.println("Atleast two non zero values are needed...");
		System.exit(0);
	}
	else if(a==0&&b!=0)
	{
		root1=-(c/b);
		System.exit(0);
	}
	else if(a==0&&b==0&&c!=0)
	{
		System.out.println("No Solution....");
		System.exit(0);
	}
	else
	{
		d=(b*b)-(4*a*c);
		sqroot=Math.sqrt(d);
		if(d<0)
		{
			System.out.println("Roots are imaginary...");
		}
		else if(d==0)
		{
			System.out.println("Roots are real and equal...");
			root1=(-b+(sqroot))/(2*a);
			System.out.println("Roots : "+root1);
			
		}
		else 
		{
			root1=(-b+(sqroot))/(2*a);
			root2=(-b-(sqroot))/(2*a);
			System.out.println("Root1 : "+root1);
			System.out.println("Root2 : "+root2);
		}
	}	
}
}
