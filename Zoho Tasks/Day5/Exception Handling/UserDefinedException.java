import java.util.Scanner;

class MyCustomException extends Exception{

	MyCustomException(String message){

	super(message);
}

}

class UserDefinedException{
public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your Age...");
try{
	int age=scan.nextInt();
	if(age<18)
	{
		throw new MyCustomException("Your age must be atleast 18. ");
	}
	else
		System.out.println("Access Granted...");	
}catch(MyCustomException e){

	System.out.println("Custom Exception "+ e.getMessage());


}

}

}
