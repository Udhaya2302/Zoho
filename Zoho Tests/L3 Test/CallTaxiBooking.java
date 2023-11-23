import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

class CallTaxiBooking{

public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	
	boolean loop=true;

	ArrayList<Taxi>taxiList=new ArrayList<Taxi>();
	taxiList.add(new Taxi(1));
	taxiList.add(new Taxi(2));
	taxiList.add(new Taxi(3));
	taxiList.add(new Taxi(4));
	
	ArrayList<Customer>customerList=new ArrayList<Customer>();
	
	while(loop)
	{
		System.out.println("Enter 1 for Booking...");
		System.out.println("Enter 2 for Display PassengersList..");
		System.out.println("Enter 3 for Display TaxiList..");
		System.out.println("Enter 4 for Exit..");
		int n=scan.nextInt();

		switch(n){

		case 1:{
			System.out.println("Booking...");
			Customer c=new Customer();
			customerList.add(c);
			
			if(c.taxiAllot(taxiList))
			{
				System.out.println("Booked Successfully...");
			}else
			{
				System.out.println("Sorry Unable To Book...");

			}
			break;
		}
		case 2:{
			System.out.println("CustomersList...");
			displayCustomer(customerList);
			break;
		}
		case 3:{
			System.out.println("Taxi List...");
			displayTaxi(taxiList);
			
			break;
		}
		case 4:{

			System.out.println("Exit...");
			loop=false;
			break;
		}
		default :{
			System.out.println("Enter Valid Input...");

			}
		}
	}
}

public static void displayTaxi(ArrayList<Taxi>taxiList)
{
	for(Taxi t:taxiList)
	{
		System.out.println("Taxi No : "+t.taxino+" Total Earnings "+t.earnings+" Location : "+t.location);
	}


}
	
public static void displayCustomer(ArrayList<Customer>customersList)
{
	for(Customer c:customersList)
	{
		System.out.println("Customer Id: "+c.cId);
		System.out.println("Customer Name : "+c.name);
		System.out.println("Customer Pickup Point : "+c.pickupPoint);
		System.out.println("Customer Drop Point: "+c.dropPoint);
		System.out.println("Customer Time  : "+c.pickupTime);
		System.out.println("Taxi Alloted : "+c.taxiAlloted);
		System.out.println();
		

	}


}

}
class Taxi{

	int taxino;
	int earnings;
	boolean available;
	char location;
	int time;

	Taxi(int taxino)
	{
		this.taxino=taxino;
		this.earnings=0;
		this.available=true;
		this.location='A';
		this.time=0;	
	}

}

class Customer{

	Scanner scan=new Scanner(System.in);

	static int id=0;
	String name;
	char pickupPoint;
	char dropPoint;
	int pickupTime;
	int cId;
	int taxiAlloted;

	Customer(){
		
	System.out.println("Enter your name...");
	this.name=scan.nextLine();

	System.out.println("Enter your pickup point.as A B C D E F");
	this.pickupPoint=scan.next().charAt(0);

	System.out.println("Enter your Drop point.as A B C D E F");
	this.dropPoint=scan.next().charAt(0);

	System.out.println("Enter your Pickup Time ...");
	this.pickupTime=scan.nextInt();

	this.cId=++id;
	this.taxiAlloted=' ';

	}

	boolean taxiAllot(ArrayList<Taxi>taxiList)
	{
		char near1=0;
		char near2=0;
		int dis1;
		int dis2;
		for(Taxi t:taxiList)
		{
			if(t.earnings==0)
			{
				taxiAlloted=t.taxino;
				t.available=false;

				distance(t);
				return true;
				
			}
			else{
				if(t.location>pickupPoint)
				{
					 near1=t.location;
				}
				if(t.location<pickupPoint)
				{
					 near2=t.location;
				}
	
			}
		
			 dis1=Math.abs(pickupPoint-near1);
			 dis2=Math.abs(pickupPoint-near2);
			if(dis1>dis2)
			{
				for(Taxi ta: taxiList)
				{
					if(ta.location==near1&&ta.available==false)
					{
						taxiAlloted=ta.taxino;
						distance(t);
						t.available=false;
						return true;
					}else if(ta.location==near1&&ta.available==false)
					{
						
						taxiAlloted=t.taxino;
						distance(t);
						t.available=false;
						return true;

					}

				}
			}

			

		}
	return false;

	}

	void distance(Taxi t)
	{
		int dis=Math.abs(pickupPoint-dropPoint);
		int fare=(100+((dis*15)-5)*10);
		t.earnings+=fare;
		t.location=dropPoint;
		
		t.time=pickupTime+dis;
		
		System.out.println(fare);

	}











}