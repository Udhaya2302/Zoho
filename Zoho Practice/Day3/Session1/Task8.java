import java.util.Scanner;

class Task8{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	int a[]=new int[10];
	int k=0;

	for(int i=0;i<10;i++)
	{
		a[i]=scan.nextInt();
	}

	int b[]=new int[5];
	int c[]=new int[5];

	for(int i=0;i<5;i++)
	{
		b[k]=a[i];
	k++;

	}
	k=0;

	for(int i=5;i<10;i++)
	{
		c[k]=a[i];
	k++;

	}
	System.out.println("Array 1");

	for(int i=0;i<5;i++)
	{
		System.out.println(b[i]);

	}

	System.out.println("Array 2");
	for(int i=0;i<5;i++)
	{
		System.out.println(c[i]);

	}

	

}

}