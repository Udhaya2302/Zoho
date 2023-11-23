import java.util.Scanner;

class Task1{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);

	String s=scan.nextLine();

	char a[]=s.toCharArray();
	int m=a.length-1;

	for(int i=0;i<a.length/2;i++)
	{
		char temp=a[i];
		a[i]=a[m];
		a[m]=temp;
		m--;
		

	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}



}

}