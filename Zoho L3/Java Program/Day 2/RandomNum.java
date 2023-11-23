import  java.util.Random;
import java.util.Scanner;

class RandomNum{
public static void main(String [] args)
{
	Boolean loop=true;
while(loop)
{
	Random rand=new Random();
	int a=rand.nextInt(10);
	//System.out.println(a);

	Scanner scan=new Scanner(System.in);
	int b= scan.nextInt(); 

	System.out.println("Enter the nums betwee 1 to 10");

if(a==b)
{
	System.out.println("Your num "+a+" Guess "+b);
	System.out.println("Great You Guess the Num");
loop=false;
}
else if(b<a)
{
	System.out.println("Your num "+a+" Guess "+b);
	System.out.println("Your num is too small...");
}
else if(b>a)
{
	System.out.println("Your num "+a+" Guess "+b);
	System.out.println("Ypur Num is too big...");
}




}
	

}
}