import java.util.Scanner;
	
class Prime{
public static void main(String [] args){

Scanner scan=new Scanner(System.in);
System.out.println("Enter the number ...");
int a=scan.nextInt();
System.out.println(a);
int ct=0;

for(int i=2;i<a/2;i++)
{
	if(a%2==0)
	{
		ct++;
		break;
	}
}

if(ct==0)
{
	
	System.out.println("The Given Number is Prime...");	
}
else
{
	System.out.println("The Given Number is not Prime...");

}


}
}