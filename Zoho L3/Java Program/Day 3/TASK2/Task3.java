import java.util.Scanner;
import java.util.ArrayList;


class Passenger{
	String passengername;
	int age;
	int busno;

	Passenger()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Passenger name");
	this.passengername=scan.nextLine();

	System.out.println("Enter Age");
	this.age=scan.nextInt();

	System.out.println("Enter BusNo : ");
	this.busno=scan.nextInt();
	
	}

	boolean isAvailable(ArrayList<Passenger>passengersList,ArrayList<Bus>buses)
	{
		int capacity=0;
		for(Bus b:buses)
		{
			if(b.getBusno()==busno)
			{
				capacity=b.getcapacity();
			}
		}
		int booked=0;
		for(Passenger p:passengersList)
		{
			if(p.busno==busno)

			{
				booked++;
			}

		}
	return capacity>booked?true:false;
	}


}




class Bus {
	private int busno;
	private boolean ac;
	private int capacity;

	Bus(int busno,boolean ac,int capacity)
	{
		this.busno=busno;
		this.ac=ac;
		this.capacity= capacity;
	}

	int getBusno()
	{
		return busno;

	}

	boolean getac()
	{
		return ac;

	}

	int getcapacity()
	{
		return capacity;
	}


}


public class Task3{

	public static void main(String[] args)
{

	 ArrayList<Bus>buses=new ArrayList<Bus>();

	buses.add(new Bus(1,false,2));
	buses.add(new Bus(2,true,2));
	buses.add(new Bus(3,false,2));

	 ArrayList<Passenger>passengersList=new ArrayList<Passenger>();

	Scanner scan=new Scanner(System.in);
	boolean loop=true;
	while(loop)
	
	{	
		System.out.println("Enter 1 for booking...");
		System.out.println("Enter 2 for Cancel Ticket...");
		System.out.println("Enter 3 for Display...");
		System.out.println("Enter 4 for Exit...");
		int a=scan.nextInt();

		switch(a)
		{
			case 1:
			{
				Passenger p=new Passenger();
				if(p.isAvailable(passengersList,buses))
				{
					passengersList.add(p);
				System.out.println("Ticket is Booked....");
				}

				break;
			}
			case 2:
			{
				System.out.println(" Cancel...");
				break;
			}
			case 3:
			{
				System.out.println(" Display Passengers....");

				
			{
				display(passengersList);
			}
				break;
			}
			case 4:
			{
				System.out.println(" Exit...");
				loop=false;
				break;
			}
			default:
			{
				System.out.println("Enter Valid Input...");
			}

		}
		
		
	}
		
}
	 public static void display(ArrayList<Passenger>passengersList)
		{
				for(Passenger p : passengersList)
				{
					System.out.println("Passenger name : "+p.passengername+" Passenger age : "+p.age +"  Bus no : "+p.busno );
				}

				
			
		}
}