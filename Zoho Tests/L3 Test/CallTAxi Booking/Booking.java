
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Booking {
	public static void main(String[] args) {
		
		ArrayList<Taxi>taxis=createTaxi(4);
		
		Scanner scan=new Scanner(System.in);
		int id=1;
		
		boolean loop=true;
		
		while(loop)
		{
			System.out.println("Enter 1. to booking...");
			System.out.println("Enter 2.to Display");
			System.out.println("Enter 3.to Passenger");
			System.out.println("Enter 4. to Exit");
			
			int n=scan.nextInt();
			
			switch(n)
			{
			
			case 1: 
			{
				int customerId=id;
				System.out.println("Enter the Pickup Point.....");
				char pickupPoint=scan.next().charAt(0);
				System.out.println("Enter the Drop Point....");
				char dropPoint=scan.next().charAt(0);
				System.out.println("Enter the Pickup time ");
				int pickupTime=scan.nextInt();
				
				if(pickupPoint<'A'||pickupPoint >'F'||dropPoint >'F'||dropPoint<'A')
				{
					System.out.println("Enter only valid Inputs A B C D E F ");
					return;
				}
			ArrayList<Taxi>freeTaxis=getFreeTaxis(taxis,pickupTime,pickupPoint);
		
			if(freeTaxis.size()==0)
			{
				System.out.println("No Taxi Can be Allotted....Exiting...");
				return;

			}
	
			Collections.sort(freeTaxis,(a,b)->a.totalEarnings-b.totalEarnings);

			bookTaxi(id,pickupPoint,dropPoint,pickupTime,freeTaxis);
						
				break;
			}
				
			case 2:
			{
				System.out.println("Display Details....");
				for(Taxi t: )
			
				break;
			}
			case 3:
			{
				System.out.println("Passenger...");
				break;
			}
			case 4:
			{
				System.out.println("Exit...");
				loop=false;
				break;
			}
			default : 
			{
				System.out.println("Enter the valid input...");
			}
		
			
			}
		}
	}

	public static ArrayList<Taxi> createTaxi(int n)
	{
		ArrayList<Taxi>taxis=new ArrayList<Taxi>();

		for(int i=1;i<=n;i++)
		{
			Taxi t=new Taxi();
			taxis.add(t);
		}
	return taxis;
	}

public static ArrayList<Taxi> getFreeTaxis(ArrayList<Taxi>taxis,int pickupTime,char pickupPoint)
{
	ArrayList<Taxi>freeTaxis=new ArrayList<Taxi>();

	for(Taxi t: taxis)
	{
		if(t.freeTime<=pickupTime&&Math.abs((t.currentSpot-'0')-(pickupPoint-'0'))<=pickupTime-t.freeTime)
		{
			freeTaxis.add(t);
		}

	}
	return freeTaxis;


}

public static void bookTaxi(int customerId,char pickupPoint,char dropPoint,int pickupTime,ArrayList<Taxi>freeTaxis)
{

	int min=999;
	int distancebetweenpickupandDrop;
	int earning=0;
	int nextfreeTime=0;
	char nextSpot='z';
	Taxi bookedTaxi=null;
	String tripDetail="";

	for(Taxi t : freeTaxis)
	{
		int distanceBetweenCustomerandTaxi=Math.abs((t.currentSpot-'0')-(pickupPoint-'0'))*15;
		
		if(distanceBetweenCustomerandTaxi<min)
		{
			bookedTaxi=t;
			distancebetweenpickupandDrop=Math.abs((dropPoint-'0')-(pickupPoint-'0')*15);
	
			 int dropTime  = pickupTime + distancebetweenpickupandDrop/15;
			nextfreeTime = dropTime;
			nextSpot = dropPoint;
		
			tripDetail = customerId + "               " + customerId + "          " + pickupPoint +  "      " + dropPoint + "       " + pickupTime + "          " +dropTime + "           " + earning;
			
			min = distanceBetweenCustomerandTaxi;

			bookedTaxi.setDetails(true,nextSpot,nextfreeTime,bookedTaxi.totalEarnings + earning,tripDetail);
			 System.out.println("Taxi " +bookedTaxi.id + " booked");
		}
	}
}

	

}

class Taxi {
	static int count=0;
	int id;
	boolean booked;
	char currentSpot;
	int freeTime;
	int totalEarnings;
	ArrayList<String> trips;
	Taxi()
	{
		this.id=++count;
		this.currentSpot='A';
		this.freeTime=6;
		this.booked=false;
		this.totalEarnings=0;
		//this.trips=new ArrayList();
		
	}

	  public void setDetails(boolean booked,char currentSpot,int freeTime,int totalEarnings,String tripDetail)
    {
            this.booked = booked;
            this.currentSpot = currentSpot;
            this.freeTime = freeTime;
            this.totalEarnings = totalEarnings;
            //this.trips.add(tripDetail);
    }
	

}



