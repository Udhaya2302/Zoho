import java.util.Scanner;

class Powerof{
public static void main (String[] args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter the 1'st Number  : ");

int a=scan.nextInt();
int pro=1;

System.out.println("Enter the 2'nd Number  : ");
int b=scan.nextInt();

for(int i=0;i<b;i++)
{
	pro*=a;
}

System.out.println(a+" sto Power of "+b+" is "+pro);



}
}