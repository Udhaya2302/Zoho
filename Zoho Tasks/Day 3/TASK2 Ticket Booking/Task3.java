import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


class Passenger{
	static int id=0;
	String passengername;
	int age;
	int busno;
	int passengerId;

	Passenger()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Passenger name");
	this.passengername=scan.nextLine();

	System.out.println("Enter Age");
	this.age=scan.nextInt();

	System.out.println("Enter BusNo : ");
	this.busno=scan.nextInt();
	this.passengerId= ++id;
	
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

// Passenger class Ends Here...................................................



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
// Bus class Ends Here................................................


public class Task3{

	public static void main(String[] args)
{

	 ArrayList<Bus>buses=new ArrayList<Bus>();

	buses.add(new Bus(1,false,2));
	buses.add(new Bus(2,true,2));
	buses.add(new Bus(3,false,2));

	ArrayList<Passenger>passengersList=new ArrayList<Passenger>();
	Map<Integer,Passenger>bookingList=new HashMap<>();

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
					bookingList.put(p.passengerId,p);

				
				System.out.println("Ticket is Booked....");
				}else
				{
					System.out.println("Sorry! Ticket is Full....");
				}

				break;
			}
			case 2:
			{
				System.out.println("Enter the Passenger Id  to cancel...");
				int cancelId=scan.nextInt();
				toCancelTicket(passengersList,bookingList,cancelId);
				
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

	

private static void toCancelTicket(ArrayList<Passenger>passengersList,,HashMap<Integer,Passenger>bookingList,int passengerId)

	{
		if(bookingList.containsKey(passengerId))
			{
				Passenger p1=bookingList.get(passengerId);
				bookingList.remove(passengerId);
				bookings.remove(passengerId);
				System.out.println("Cancelled Successfully...");
			}
		else{
			System.out.println("Passenger Not Available...");

			}

	}
}