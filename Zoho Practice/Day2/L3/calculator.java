import java.util.Scanner;
class Calculator{
	public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	int a=0;
	int b=0;

	boolean loop=true;

	while(loop)
	{
		System.out.println("1.to Addition ");
			
		System.out.println("2 to Subtraction.");
		
		System.out.println("3.to Multiply");
			
		System.out.println("4 to Division.");
		
		System.out.println("5.to percentage");

		System.out.println("Enter 6 to Exit .");
			
		
		int n=scan.nextInt();
		if(n<5)
		{
			
		System.out.println("Enter num1 ...");
		a=scan.nextInt();
		System.out.println("Enter num2 ...");
		 b=scan.nextInt();

		}

		switch(n)
		{
			case 1:
			{
				System.out.println("Ans : "+(a+b));
				break;

			}


			case 2:
			{
				System.out.println("Ans : "+(a-b));
				break;
			}

			case 3: 
				{
					System.out.println("Ans : "+(a*b));
					break;

				}
			case 4: 
			{
				System.out.println("Ans : "+(a/b));
				break;
			}
			case 5: 
			{
				System.out.println("1. Percentage Calculator..");
				System.out.println("2. To Calculate : X%Y");
				System.out.println("3. To Calculate What %y is X : ");
				System.out.println("3. To Calculate :Percentage Increase ");
				System.out.println("4. To Calculate : Percentage Decrease ");
				System.out.println();
				int z=scan.nextInt();
				System.out.println("Enter Num 1 : ");
				int x=scan.nextInt();
				System.out.println("Enter Num 2 : ");
				int y=scan.nextInt();

				percentage( z,(double) x,(double) y);


	
				break;
			}
			case 6: 
			{
				
				loop=false;
				System.out.println("Exit...");
				break;
				
			}
			default : 
			{
				System.out.println("Enter valid input...");
			} 
		}
	}
}


	public static void percentage(int z,double x,double y)
	{
		switch(z)
		{
			case 1: {
					System.out.println("Ans : "+(x/100)*y);
					break;

			}
			case 2: {
					System.out.println("Ans : "+((y/x)*100));
					break;
			}
			case 3: {
					System.out.println("Ans : "+((x-y)/y)*100);
				break;
					
			}
			case 4: {
					System.out.println("Ans : "+((y-x)/y)*100);
				break;

			}






		}

	}

}