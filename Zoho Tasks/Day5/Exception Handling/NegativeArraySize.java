import java.util.Scanner;

class NegativeArraySize{
public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter Array Size : ");
	int size=scan.nextInt();
	
	
	try{
	int[] a=new int[size];
	
	for(int i=0;i<size;i++)
	{
		a[i]=scan.nextInt();
	}

	}
	catch(NegativeArraySizeException e){
		System.out.println(e);
	}


	{
		System.out.println("Hii Good Morning...");
	} 
	
}
}