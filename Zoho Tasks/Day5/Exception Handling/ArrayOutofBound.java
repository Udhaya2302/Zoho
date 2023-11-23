import java.util.Scanner;

class ArrayOutofBound{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array Size...");
	int size=scan.nextInt();

	int a[]=new int[size];
	System.out.println("Enter the Array Elements...");
	for(int i=0;i<size;i++)
	{
		a[i]=scan.nextInt();
	}
	System.out.println("Enter the Array Index...");
	int index=scan.nextInt();
	try{
	System.out.println(a[index]);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Exception Handled..."+e.getMessage());
	}

	
}
}