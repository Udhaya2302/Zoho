import java.util.*;


public class ParkingLot{
	
	static ArrayList<LotCar>carParking=new ArrayList<>();
	static ArrayList<LotBikes>bikeParking=new ArrayList<>();
	static ArrayList<Vehicle>carList=new ArrayList<>();
	static ArrayList<Vehicle>bikeList=new ArrayList<>();

	public static void main(String[] args){
		
		
		char A='A';
		
		for(int i=0;i<13;i++)
		{
			carParking.add(new LotCar(""+ A++));
		}
		
		for(int i=0;i<12;i++)
		{
			bikeParking.add(new LotBikes(""+ A++));
		}
		
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("\n\tWelcome to Parking lot....");
	while(true)
	{
		System.out.println("\n\t 1-> car Parking....");
		System.out.println("\t 2-> Bike Parking ...");
		System.out.println("\t 3-> carParking View...");
		System.out.println("\t 4-> Bike Parking View...");
		System.out.println("\t 5-> Return Vehicle.....");
		System.out.println("\t 6-> ToSearch Vehicle Pos..");
		System.out.println("\t 7-> Exit....");
		
		int n=scan.nextInt();
		
		switch(n)
		{
			case 1:
				System.out.println("car..");
				System.out.println("Enter the car no :");
				int no=scan.nextInt();
				System.out.println("Preffered Lot  (A -> M .)");
				String s=scan.next();
				System.out.println("Enter the time in hours ");
				int intime=scan.nextInt();
				
				Vehicle v=new Vehicle(no,intime);
				
				if((parkingAlloted(no,s,intime,v)))
				{
					System.out.println("Car Parking Alloted Successfully....");
				}
				else
				{
					System.out.println("Your Preffered position Not Available...");
					
					System.out.println("Did ypu okay with Any Position..");
					System.out.println("\t1 -> okay..\n\t 2 -> Deny");
					int okay=scan.nextInt();
					if(okay==1)
					{
						if(parkingGiven(no,intime,v))
						{
							System.out.println("Parking Alloted Successfully...");
						}
						else{
							System.out.println("Sorry unable to Allot...");
							break;
						}
					}
					
				}
			
				
				
				break;
			case 2:
				System.out.println("Bike..");
				
				System.out.println("Enter the Bike no :");
				int bikeNum=scan.nextInt();
				System.out.println("Preffered Lot  (N -> Y .)");
				String lot=scan.next();
				System.out.println("Enter the time in hours ");
				int bikeintime=scan.nextInt();
				
				Vehicle bike=new Vehicle(bikeNum,bikeintime);
				
				if((parkingAllotedBike(bikeNum,lot,bikeintime,bike)))
				{
					System.out.println("Bike Parking Alloted Successfully....");
				}
				else
				{
					System.out.println("Your Preffered position Not Available...");
					
					System.out.println("Did ypu okay with Any Position..");
					System.out.println("\t1 -> okay..\n\t 2 -> Deny");
					int okay=scan.nextInt();
					if(okay==1)
					{
						if(parkingGivenBike(bikeNum,bikeintime,bike))
						{
							System.out.println("Parking Alloted Successfully...");
						}
						else{
							System.out.println("Sorry unable to Allot...");
							break;
						}
					}
					
				}
			
				break;
			case 3:
				System.out.println("Car view..");
				carlist(carParking);
				break;
			case 4:
				System.out.println("Bike view..");
				bikeList(bikeParking);
				break;
				
			case 5:
				System.out.println("To take Vehicle ");
				System.out.println("\t 1-> car \n\t 2->bike");
				int take=scan.nextInt();
				if(take==1)
				{
					System.out.println("Enter the car number...");
					int carNo=scan.nextInt();
					System.out.println("Enter the Exit Time...");
					int exitTime=scan.nextInt();
					
					Vehicle v1=searchVehicle(carNo);
					
					if(returncar(carNo,exitTime,v1))
					{
						System.out.println("Car Exitted Successfully...");
					}
					else{
						System.out.println("Unable to find\nplease verify details...");
					}
					
					
					
				}else if(take==2)
				{
					System.out.println("bike...");
					
					System.out.println("Enter the Bike number...");
					int bikeNo=scan.nextInt();
					System.out.println("Enter the Exit Time...");
					int bikeExitTime=scan.nextInt();
					
					Vehicle bike1=searchVehicleBike(bikeNo);
					
					if(returnBike(bikeNo,bikeExitTime,bike1) )
					{
						System.out.println("Bike Exitted Successfully...");
					}
					else{
						System.out.println("Unable to find\nplease verify details...");
					}
					
					
				}else
				{
					System.out.println("Enter the valid Input...");
				}
				break;
			case 6:
				System.out.println("To Search Vehicle...");
				
				System.out.println("\t 1-> car\n\t 2->bike");
				int carSearch=scan.nextInt();
				if(carSearch==1)
				{
					System.out.println("Enter the Car no : ");
					int search=scan.nextInt();
					toSearch(search);
					
				}
				else if(carSearch==2)
				{
					System.out.println("Enter the Bike no : ");
					
					int searchBike=scan.nextInt();
					toSearchBike(searchBike);
					
				}
			
				break;
				
			case 7:
				System.out.println("Exit..");
				return;
		
	}
	
	
	}


}
// searching Bike Pos.............

public static void toSearchBike(int num){
	for(LotBikes l:bikeParking)
	{
		for(int i=0;i<5;i++)
		{
			if(l.a[i]==num)
			{
				System.out.print("Lot : "+l.name+" pos :"+i+1);
				return;
			}
		}
	}
	
	
}


// Searching Pos............

public static void toSearch(int num){
	for(LotCar l:carParking)
	{
		for(int i=0;i<5;i++)
		{
			if(l.a[i]==num)
			{
				System.out.print("Lot : "+l.name+" pos :"+i+1);
				return;
			}
		}
	}
	
	
}

// Searching Bike............


public static Vehicle searchVehicleBike(int num)
{
	for(Vehicle v:bikeList)
	{
		if(v.vehicleNo==num)
		{
			return v;
		}
	}
	return null;
}

// return Bike.................

public static boolean returnBike(int num,int exitTime,Vehicle bike)
{
	for(LotBikes l: bikeParking)
	{
		for(int i=0;i<5;i++)
		{
			if(l.a[i]==num)
			{
				l.a[i]=0;
				
				int amount=exitTime-bike.intime;
				bikeList.remove(bike);
				
				System.out.println("your Parking Amount is : "+Math.abs(amount*10));
				
				return true;
			}
		}
	}
	return false;
}

// Searching free space for car...........
public static boolean parkingGivenBike(int no,int time,Vehicle v)
{
	for(LotBikes l:bikeParking)
	{
		for(int i=0;i<5;i++)
		{
			if(l.a[i]==0)
			{
				
					l.a[i]=no;
					v.lot=l.name;
					v.pos=i+1;
					bikeList.add(v);
					return true;
			}
		}
	}
	return false;
}
// Allotted for Bike..............

public static boolean parkingAllotedBike(int no,String s,int time,Vehicle v)
{
	
	for(LotBikes l:bikeParking)
	{
		if(l.name.equals(s))
		{
			for(int i=0;i<5;i++)
			{
				if(l.a[i]==0)
				{
					l.a[i]=no;
					v.lot=l.name;
					v.pos=i+1;
					bikeList.add(v);
					
					return true;
				}
			}
		}
		
	}
	return false;
}


public static Vehicle searchVehicle(int num)
{
	for(Vehicle v:carList)
	{
		if(v.vehicleNo==num)
		{
			
			return v;
		}
	}
	return null;
}
public static boolean returncar(int num,int exitTime,Vehicle v)
{
	for(LotCar l: carParking)
	{
		for(int i=0;i<5;i++)
		{
			if(l.a[i]==num)
			{
				l.a[i]=0;
				int amount=exitTime-v.intime;
				carList.remove(v);
				
				System.out.println("your Parking Amount is : "+Math.abs(amount*50));
				
				return true;
			}
		}
	}
	return false;
}
// Searching free space for car...........
public static boolean parkingGiven(int no,int time,Vehicle v)
{
	for(LotCar l:carParking)
	{
		for(int i=0;i<5;i++)
		{
			if(l.a[i]==0)
			{
				
					l.a[i]=no;
					v.lot=l.name;
					v.pos=i+1;
					carList.add(v);
					return true;
			}
		}
	}
	return false;
}
// Allotted for car..............
public static boolean parkingAlloted(int no,String s,int time,Vehicle v)
{
	
	for(LotCar l:carParking)
	{
		if(l.name.equals(s))
		{
			for(int i=0;i<5;i++)
			{
				if(l.a[i]==0)
				{
					l.a[i]=no;
					v.lot=l.name;
					v.pos=i+1;
					carList.add(v);
					
					return true;
				}
			}
		}
		
	}
	return false;
}

public static void bikeList(ArrayList<LotBikes>bikeParking)
{
	for(LotBikes l:bikeParking)
	{
		System.out.print("\t" +l.name+ " -> 	");
		for(int i=0;i<5;i++)
		{
			System.out.print(l.a[i]+"    ");
		}
		System.out.println();
	}
}


public static void carlist(ArrayList<LotCar>carParking)
{
	for(LotCar l :carParking)
	{
		System.out.print(" \t"+l.name +" ->        ");
		for(int i=0;i<5;i++)
		{
			System.out.print(l.a[i]+"    ");
		}
		System.out.println();
	}
}
}

class Vehicle{
	
	int vehicleNo;
	boolean parkingStatus;
	int amount;
	int intime;
	int outtime;
	String lot;
	int pos;
	
	Vehicle(int no,int intime)
	{
		this.vehicleNo=no;
		this.parkingStatus=false;
		this.amount=0;
		this.intime=intime;
		this.outtime=0;
		this.lot="";
		this.pos=0;
	}

}
class LotCar{
	String name;
	int free;
	int a[];
	int car;
	
	
	LotCar(String name)
	{
		this.name=name;
		this.free=5;
		this.a=new int[5];
		this.car=50;
		
	}
}

class LotBikes{
	String name;
	int free;
	int a[];
	int bike;
	
	
	
	LotBikes(String name)
	{
		this.name=name;
		this.free=5;
		this.a=new int[5];
		this.bike=10;
		
	}
	
}
