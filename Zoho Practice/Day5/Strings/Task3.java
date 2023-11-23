import java.util.Scanner;

class Task3{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Binary num ....");
	String s1=scan.nextLine();
	System.out.println("Enter Binary num 2 ....");
	String s2=scan.nextLine();

	System.out.println(addBinary(s1,s2));



}
public static String addBinary(String s1,String s2)
{
	StringBuilder result=new StringBuilder();
	
	int i=s1.length()-1;
	int j=s2.length()-1;

	int carry=0;

	while(i>=0||j>=0)
	{
		int sum=carry;

		if(i>=0)
		{
			sum+=s1.charAt(i--)-'0';

		}
		if(j>=0)
		{
			sum+=s1.charAt(j--)-'0';

		}result.insert(0,sum%2);
		carry=sum/2;
	}
	if(carry>0){
	result.insert(0,1);

}
return result.toString();

}


}