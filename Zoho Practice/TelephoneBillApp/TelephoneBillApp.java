import java.util.Scanner;

public class TelephoneBillApp  {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Telephone Bill App..");
		
		boolean loop=true;
		
		while(loop)
		{
			System.out.println("Enter 1 to call ....");
			System.out.println("Enter 2 to exit ....");
			int n=scan.nextInt();
			System.out.println("Enter Key to End Call....");
			scan.nextLine();
			
			switch(n)
			{
			case 1:
			{
				
				Call call=new Call();
				call.start();
				scan.nextLine();
				call.loop1=false;
				Thread.sleep(2000);
			}
			}
		}
		
		System.out.println("");	
	}

}

class Call extends Thread{
	
	 boolean loop1=true;
	
	public void run()
	{
		System.out.println("call in progress.....");
		int charge=2;
		int ct=0;
		
		
		while (loop1)
		{

			try {
				System.out.print (" .");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			ct++;
			
			
			
		}
		
		System.out.println("Your Call Time is  :  "+ct+" sec ");
		
		System.out.println("Your Bill is  :  "+ct*charge + " Rs");
		
	}
}
