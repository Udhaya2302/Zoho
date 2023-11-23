import java.util.Scanner;

class NumberFormat{
public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	int number;
	System.out.println("Enter the number ... ");
	
	try{
	number=Integer.parseInt(scan.next());

	System.out.println(number);
	}

	catch(NumberFormatException e){
		System.out.println("Enter number Format only...");

	}
	System.out.println("The Last Line...");
}

}