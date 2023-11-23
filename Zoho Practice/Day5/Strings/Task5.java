import java.util.Scanner;
class Task5{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	
	String s1[]={"Shogun","Tapioca Express","Burger King","KFC"};
	String s2[]={"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

	int ct=0;
	int min=0;
	int sum=10000;
	String str="";
	for(int i=0;i<s1.length;i++)
	{
		for(int j=0;j<s2.length;j++)
		{
			sum=0;
			if(s1[i].equals(s2[j]))
			{
				sum=i+j;
			}
		}
		if(sum>min)
		{
			min=sum;
			str = s1[i];
		}

	}
	System.out.println(str);


}
}