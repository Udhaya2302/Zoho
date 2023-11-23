import java.util.Scanner;

class Arithmetic{
public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter num 1");
	int a=scan.nextInt();

	System.out.println("Enter num 2");
	int b=scan.nextInt();
	
	try{
	int divide=a/b;
	System.out.println(divide);
	}
	catch(ArithmeticException e){
	System.out.println(e);
	}
	System.out.println("After Block");
}
}