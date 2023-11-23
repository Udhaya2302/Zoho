import java.util.Scanner;

class AddBin{
	public static void main(String[] args){

String s1="0000100";
String s2="0000001";

int i=s1.length()-1;
int j=s2.length()-1;

StringBuilder sb=new StringBuilder();
int sum=0;
int carry=0;

while(i>=0 || j>=0)
{
	sum=carry;
	if(i>=0)
	{
		sum+=s1.charAt(i)-'0';
	}
	if(j>=0)
	{
		sum+=s2.charAt(j)-'0';
	}
	
	if(sum==0 || sum==1)
	{
		sb.append(sum);
		carry=0;
		
	}
	else if(sum==2)
	{
		carry=1;
		sb.append("0");

	}
	else
	{
		sb.append("1");
		carry=1;
		
	}
	i--;
	j--;
	
}
if(carry==1)
{
	sb.append(carry);
}

String s=sb.reverse().toString();

System.out.println(s);
}
}