import java.util.Scanner;

class Table{
public static void main(String[] args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter the number");

int a=scan.nextInt();

for(int i=1;i<=10;i++)
{
	System.out.println(i+ "*"+a+"="+(i*a));

}

}
}
