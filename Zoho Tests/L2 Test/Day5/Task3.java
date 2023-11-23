import java.util.Scanner;

class Task3{
	static int a[]=new int[10];
	//int a[]=new a[10];
    static int i=0;
	static int j=1;

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	
	
	push1(5,i);
	push2(2,j);
	pop1(i);
	pop2(j);
	push1(4,i);
	pop1(i);
	push2(7,j);
	pop2(j);
	
	
	}
	public static void push1(int n,int i)
	{
			a[i]=n;
			i+=2;
	}
	public static void push2(int n,int j)
	{
			a[j]=n;
			j+=2;
	}
	public static void pop1(int i)
	{
		System.out.println(a[i]);
		i-=2;
	}
	public static void pop2(int j)
	{
		System.out.println(a[j]);
		j-=2;
	}


}