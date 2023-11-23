import java.util.Scanner;

class ThrowsKeyword{
public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	int a,b;
	a=scan.nextInt();
	b=scan.nextInt();
try{
	 System.out.println(divide(a,b));
	
	
}catch(ArithmeticException e){

	System.out.println("Cannot Divide by Zero  "+e.getMessage());

}

}


	static int divide(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException("Exception Occured ..");
		}
		return a/b;
	}


}
