import java.util.Scanner;

class Task10{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	int a[]=new int[20];

	for(int i=0;i<20;i++)
	{
		a[i]=scan.nextInt();
	}
	
	System.out.println("Positive Numbers");
	for(int i=0;i<20;i++)
	{
		if(a[i]>0)
		{
		System.out.println(a[i]);
	}}

	System.out.println("Negative Numbers");
	for(int i=0;i<20;i++)
	{
		if(a[i]<0)
		{
		System.out.println(a[i]);
	}}
	System.out.println("even Numbers");

	for(int i=0;i<20;i++)
	{
		if((a[i]%2)==0)
		{
		System.out.println(a[i]);
	}}
	System.out.println("odd Numbers");
	for(int i=0;i<20;i++)
	{
		if((a[i]%2)==1)
		{
		System.out.println(a[i]);
	}}
	
	System.out.println("zero Numbers");
	for(int i=0;i<20;i++)
	{
		if((a[i])==0)
		{
		System.out.println(a[i]);
	}}
}



}