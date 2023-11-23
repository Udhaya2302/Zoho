import java.util.Scanner;

class Swap{
public static void main(String[] args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter The 1 number");

int a=scan.nextInt();
System.out.println("Enter The 2 number");

int b=scan.nextInt();

int temp=a;
a=b;
b=temp;

System.out.println(a+"  "+b);


}
}