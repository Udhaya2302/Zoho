import java.util.Scanner;

class TryCatchFinally{

public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	
try{
	int size=scan.nextInt();
	
	int a[]=new int[size];
	for(int i=0;i<size;i++)
	{
		a[i]=scan.nextInt();
	}
}
	catch(NegativeArraySizeException e){
	System.out.println(e);

	}
	catch(Exception e){
	System.out.println(e);
	}
	finally{
	System.out.println("Finally Block Executed...");
	}

	System.out.println("After Try catch Block....");
}
}