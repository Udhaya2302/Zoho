import java.util.Scanner;
import java.util.ArrayList;

public class RailwayDemo{

	public static  void main(String[] args)
	{

		Scanner scan=new Scanner(System.in);
	
	boolean loop=true;
	
	ArrayList<Train>train=new ArrayList<Train>();
	train.add(new Train(1,true,2));
	train.add(new Train(2,true,2));
	train.add(new Train(3,false,2));
	 ArrayList<Passenger>passenger =new ArrayList<Passenger>();

	while(loop)
	{
		System.out.println("1.to Booking ");
			
		System.out.println("2 to Cancel.");
		
		System.out.println("3.to Check Availability...");
			
		System.out.println("4 to Prepare chart..");

		System.out.println("5. to Exit .");
		
		int n=scan.nextInt();
			
		
		switch(n)
		{
			case 1:
			{	Passenger p=new Passenger();
				if(p.isAvailable(train,passenger))
				{
					passenger.add(p);
					System.out.println("Booked Successfully...");
				}
				else
				{
					System.out.println("Sorry unable to book ....");
				}
				break;

			}


			case 2:
			{
				System.out.println("Cancel Ticket...");
				System.out.println("Enter Passenger Id ...");
				int id=scan.nextInt();
				//cancelTicket(id,passenger);
				System.out.println("Cancelled Successfully...");

				break;
			}

			case 3: 
				{
					System.out.println("To Check Availability...");
					
					availability(train);
					
					break;

				}
			case 4: 
			{
				System.out.println("Prepare Chart ...");
			
				display(passenger);
				break;
			}
			case 5:{

				System.out.println("Exit...");
				loop=false;
				break;

			}
			default : {
				System.out.println("Enter valid Input...");
				break;

				}		
	}

}


}
	
	public static void  availability(ArrayList<Train>train){
		
	for(Train t :train)
	{
		System.out.println("Train No : "+t.no+"  Train Capacity : "+t.capacity);
	}
	}
	

	public static void display(ArrayList<Passenger>passenger)
	{

		for(Passenger p: passenger)
		{
			System.out.println("Passenger Id : "+p.passengerid+" Passenger Name : "+p.name+" Passenger Age : "+ p.name);

		}
	}

	public static void cancelTicket(int id,ArrayList<Passenger>passenger)
	{
		Passenger p1;
		for(Passenger p:passenger)
		{
			if(p.passengerid==id)
			{
				System.out.println(passenger.id);	
				passenger.remove(p);
			}
		}
		



	}

}


class Passenger{
	static int id=0;
	String name;
	int age;
	int trainno;
	int passengerid;

	Scanner scan=new Scanner(System.in);
	Passenger()
	{
		System.out.println("Enter the Passenger Name...");
		this.name=scan.nextLine();
		System.out.println("Enter the Age ...");
		this.age=scan.nextInt();
		System.out.println("Enter Train No : ");
		this.trainno=scan.nextInt();
		this.passengerid=++id;
	}

	public boolean isAvailable(ArrayList<Train>train,ArrayList<Passenger>passenger)
	{
		int ct=-1;
	
		for(Train t:train)
		{
			if(t.no==trainno)
			{
				ct=t.capacity;

			}
		}
		
		int booked=0;
		for(Passenger pa:passenger){	
			
		if(pa.trainno==trainno)

		{
			booked++;
		}
		}
		if(ct==-1)
		{
			System.out.println("Enter VALID Train No ...");
			return false;
		}
		
	if(ct>booked)
	{
		return true;
	}else
	{
		return false;
	}


	}

	
}




class Train{

	int no;
	boolean fast;
	int capacity;
	Train(int no,boolean fast,int capacity)
	{
		this.no=no;
		this.fast=fast;
		this.capacity=capacity;
	}



}
