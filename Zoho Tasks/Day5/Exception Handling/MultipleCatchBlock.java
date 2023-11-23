import java.util.Scanner;
class MultipleCatchBlock{
public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	try{
	int n=scan.nextInt();
	
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}

	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}

	catch(NegativeArraySizeException e){
	System.out.println(e);

	}
	catch(Exception e){
	System.out.println(e);
	}


	System.out.println("After Exception...");
	
}
}