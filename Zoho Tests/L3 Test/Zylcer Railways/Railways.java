import java.util.*;

public class Railways{
	
	static ArrayList <Passenger>upperBerthList=new ArrayList<>();
	static ArrayList <Passenger>lowerBerthList=new ArrayList<>();
	static ArrayList <Passenger>middleBerthList=new ArrayList<>();
	static Queue <Passenger>racList=new LinkedList<>();
	static Queue <Passenger>waitingList=new LinkedList<>();
	
	static Map<Integer,Passenger>passengerlist=new HashMap<Integer,Passenger>();
	static ArrayList <Passenger>bookingList=new ArrayList<>();
	
	
	
	
	static int upperTickets=4;
	static int middleTickets=4;
	static int lowerTickets=4;
	static int racTickets=4;
	static int waitingTickets=2;
	
	static int pnr=0;
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		int cab=1;
		Cabin c=new Cabin(cab);
		
		
		
		boolean loop=true;
		
		while(loop)
		{
			System.out.println("\n\t 1 -> Booking...");
			System.out.println("\t 2 -> Cancel...");
			System.out.println("\t 3 -> Book in Group...");
			System.out.println("\t 4 -> Cabin View ...");
			System.out.println("\t 5 ->	Passenger Pnr...");
			System.out.println("\t 6 ->	Add Cabin...");
			System.out.println("\t 7 ->	Exit...");
			
			int n=scan.nextInt();
			
			switch(n)
			{
				case 1:
					System.out.println("Booking");
						booking();
					break;
				case 2:
					System.out.println("cancel");
					
					System.out.println("Enter the Pnr Number");
					int cancel=scan.nextInt();
					cancelTicket(cancel);
					
					System.out.println("Cancelled Successfully...");
					break;
				case 3:
					System.out.println("Book Tickets in a group...");
					
					int group=scan.nextInt();
					bookingGroup(group);
				
					
					break;
				case 4:
					System.out.println("cabin View");
					
					Cabin.printSeats();
					
					break;
				case 5:
					System.out.println("Enter the Pnr ");
					int pnr=scan.nextInt();
					passengersPnr(pnr);
				
					break;
				case 6:
					System.out.println("Enter no of Cabins....");
					cab=scan.nextInt();
					
					Cabin c1=new Cabin(cab);
					 upperTickets*=cab;
					 middleTickets*=cab;
					 lowerTickets*=cab;
					 racTickets*=cab;
					 waitingTickets*=cab;
					 System.out.println(waitingTickets);
				
					break;
				case 7:
					System.out.println("Exit");
					loop=false;
					break;
			}
			
			
		}
	
	}
	
	public static void bookingGroup(int n)
	{
		++pnr;
		while(n!=0)
		{
			Passenger p=new Passenger(pnr);
		
			isAvailable(p);
			n--;
		}
	}
	
	
	public static void cancelTicket(int cancelPnr)
	{
		Passenger p=passengerlist.get(cancelPnr);
		
		Cabin.freeSeat(p);
		bookingList.remove(p);
		passengerlist.remove(p);
		String allotedBerth=p.berthAlloted;
		
		if(allotedBerth.equals("Low"))
		{
			lowerTickets++;
		}else if(allotedBerth.equals("Mid"))
		{
			middleTickets++;
		}
		else if(allotedBerth.equals("Mid"))
		{
			lowerTickets++;
		}
		
		Passenger fromRac=null;
		Passenger fromWaitingList=null;
		
		if(racList.size()>0)
		{
			fromRac=racList.poll();
			racTickets++;
			if(waitingList.size()>0)
			{
				 fromWaitingList=waitingList.poll();
				waitingTickets++;
			}
		}
		
		if(fromRac!=null)
		{
			isAvailable(fromRac);
		}
		if(fromWaitingList!=null)
		{
			isAvailable(fromWaitingList);
		}
		
		
		
	}
	
	
	public static void passengersPnr(int n)
	{
		//Passenger p=passengerlist.get(n);
		
		for(Passenger p: bookingList)
		{
			if(p.Pnr==n)
			{
			System.out.println(".................................................................");
			System.out.print("  Name : "+p.name);
			System.out.print("  Age : "+p.age);
			System.out.print("  Preffered : "+p.berthPreference);
			System.out.print("  Alloted : "+p.berthAlloted);
			System.out.print("  seatNo : "+p.seatNo);
			System.out.println();
			}
		}
		
		
		
	}
	
	
	
	public static void passengersList()
	{
		
		for(Passenger p:bookingList)
		{
			System.out.println();
			System.out.println("Name : "+p.name);
			System.out.println("Age : "+p.age);
			System.out.println("Preffered : "+p.berthPreference);
			System.out.println("Alloted : "+p.berthAlloted);
			System.out.println("seatNo : "+p.seatNo);
			System.out.println();
			
			
			
		}
	}
	
	public static void booking()
	{
		Passenger p=new Passenger(++pnr);
		
		isAvailable(p);
		{
			//System.out.println("Ticket Booked Successfully....");
		}
		
		

	}
	
	public static void isAvailable(Passenger p)
	{
	
	if(waitingTickets==0)
	{
		System.out.println("Sorry No Tickets are Available....");
		return;
	}
	else{
		
		if(lowerTickets>0 && p.berthPreference.equals("L"))
		{
			int seatNo=Cabin.fetchSeatNo("Low");
			//System.out.println(seatNo);
			Passenger.bookTicket(p,"Low",seatNo);
			Cabin.updateCabin(p);
			
			lowerBerthList.add(p);
			passengerlist.put(p.Pnr,p);
			bookingList.add(p);
			
			lowerTickets--;
			
			System.out.println("Low Ticket Booked Successfully....");
		}
		else if(middleTickets>0 && p.berthPreference.equals("M"))
		{
			int seatNo=Cabin.fetchSeatNo("Mid");
			//System.out.println(seatNo);
			Passenger.bookTicket(p,"Mid",seatNo);
			Cabin.updateCabin(p);
			middleBerthList.add(p);
			passengerlist.put(p.Pnr,p);
			bookingList.add(p);
			middleTickets--;
			System.out.println("Mid Ticket Booked Successfully....");
		}
		else if(upperTickets>0 && p.berthPreference.equals("U"))
		{
			int seatNo=Cabin.fetchSeatNo("Upp");
			//System.out.println(seatNo);
			Passenger.bookTicket(p,"Upp",seatNo);
			Cabin.updateCabin(p);
			upperBerthList.add(p);
			passengerlist.put(p.Pnr,p);
			bookingList.add(p);
			upperTickets--;
			System.out.println("Low Ticket Booked Successfully....");
		}
		else if(lowerTickets>0 )
		{
			int seatNo=Cabin.fetchSeatNo("Low");
			//System.out.println(seatNo);
			Passenger.bookTicket(p,"Low",seatNo);
			Cabin.updateCabin(p);
			
			lowerBerthList.add(p);
			passengerlist.put(p.Pnr,p);
			bookingList.add(p);
			lowerTickets--;
			
			System.out.println("low  Ticket Booked Successfully....");
		}
		else if(middleTickets>0 )
		{
			int seatNo=Cabin.fetchSeatNo("Mid");
			//System.out.println(seatNo);
			Passenger.bookTicket(p,"Mid",seatNo);
			Cabin.updateCabin(p);
			middleBerthList.add(p);
			passengerlist.put(p.Pnr,p);
			bookingList.add(p);
			middleTickets--;
			System.out.println(" mid Ticket Booked Successfully....");
		}
		else if(upperTickets>0 )
		{
			int seatNo=Cabin.fetchSeatNo("Upp");
			//System.out.println(seatNo);
			Passenger.bookTicket(p,"Upp",seatNo);
			Cabin.updateCabin(p);
			upperBerthList.add(p);
			passengerlist.put(p.Pnr,p);
			bookingList.add(p);
			upperTickets--;
			System.out.println("upp Ticket Booked Successfully....");
		}
		
		else if(racTickets>0)
		{
			int seatNo=Cabin.fetchSeatNo("Rac");
			//System.out.println(seatNo);
			Passenger.bookTicket(p,"Rac",seatNo);
			Cabin.updateCabin(p);
			racList.add(p);
			passengerlist.put(p.Pnr,p);
			bookingList.add(p);
			racTickets--;
			System.out.println("Added to Rac .....");
		}
		else if(waitingTickets>0)
		{
			Passenger.bookTicket(p,"WL",0);
			waitingList.add(p);
			passengerlist.put(p.Pnr,p);
			bookingList.add(p);
			waitingTickets--;
			System.out.println("Added To Waiting List...");
			
			
		}
		else{
			System.out.println("Sorry No Tickets Are Available....");
		}
		
	}
	
	
	}
	
	

}

class SeatDetails{
	
	static int id=0;
	String Pnr;
	int berthNo;
	String currentStatus;
	String berthType;
	String name;
	String age;
	
	SeatDetails(String berth,int berthNo)
	{
	this.Pnr="";
	this.berthNo=berthNo;
	this.currentStatus="AVL";
	this.berthType=berth;
	this.name="";
	this.age="";
		
	}
	
	
	
	
}

class Cabin{
	static int j=1;
	 static  ArrayList<SeatDetails> cabin1=new ArrayList<>();
	
	Cabin(int n)
	{
	
	for(int i=j;i<=16*n;i++)
	{
		j++;
		if(i%4==1)
		{
			SeatDetails sd=new SeatDetails("Low",i);
			cabin1.add(sd);
		}
		else if(i%4==2)
		{
			SeatDetails sd=new SeatDetails("Mid",i);
			cabin1.add(sd);
		}
		else if(i%4==3)
		{
			SeatDetails sd=new SeatDetails("Upp",i);
			cabin1.add(sd);
		}
		else if(i%4==0)
		{
			
			SeatDetails sd=new SeatDetails("Rac",i);
			cabin1.add(sd);
		}
		
	}
	
	
	}
	
	public static void freeSeat(Passenger p)
	{
		for(SeatDetails sd : cabin1)
		{
			if(sd.berthNo==p.seatNo)
			{
				sd.currentStatus="AVL";
				sd.name="";
				sd.age="";
				sd.Pnr="";
				
			}
		}
	}
	
	public static void printSeats()
	{
		System.out.println("PNR  "+ "BerthNo : "+ "CStatus "+ "berthType "+ " Name "+ "age ");
		for(SeatDetails sd : cabin1)
		{
			System.out.println(sd.Pnr+"\t"+sd.berthNo+"\t"+sd.currentStatus+"\t"+sd.berthType+"  \t"+sd.name+"\t"+sd.age);
		}
	}
	
	public  static int fetchSeatNo(String b)
	{
		for(SeatDetails sd : cabin1)
		{
			if(sd.berthType.equals(b)&& sd.currentStatus.equals("AVL"))
			{
				return sd.berthNo;
			}
		}
		return 0;
	}
	
	
	public static void updateCabin(Passenger p)
	{
		for(SeatDetails sd : cabin1)
		{
			if(sd.berthNo==p.seatNo)
			{
				sd.Pnr=""+p.Pnr;
				sd.name=p.name;
				sd.age=(""+p.age);
				sd.currentStatus="CNF";
			}
		}
		
	}
	
}



class Passenger{
	static int id=0;
	String name;
	int age;
	int Pnr;
	String berthPreference;
	String berthAlloted;
	int seatNo;
	
	
	Passenger (int pnr)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your name...");
		this.name=scan.nextLine();
		System.out.println("Enter your age...");
		this.age=scan.nextInt();
		System.out.println("Enter your Berth Preference...");
		this.berthPreference=scan.next();
		this.Pnr=pnr;
		this.berthAlloted="";
		this.seatNo=-1;
		
	}
	
	public static void bookTicket(Passenger p,String berth,int seat)
	{
		p.berthAlloted=berth;
		p.seatNo=seat;
	}
}