import java.util.*;

class LiftManagement{

	static Scanner scan=new Scanner(System.in);
	static ArrayList <Lift> lifts=new ArrayList<>();
	
	
	public static void main(String[] args){
	
	lifts.add(new Lift("L1"));
	lifts.add(new Lift("L2"));
	lifts.add(new Lift("L3"));
	lifts.add(new Lift("L4"));
	lifts.add(new Lift("L5"));
	
	System.out.println("\t Welcome to Lift Management...");
	
	while(true)
	{
		System.out.println("\n\t 1 -> Lift Positions...");
		System.out.println("\t 2 -> GetLift...");
		System.out.println("\t 3 -> Maintanance...");
		System.out.println("\t 4 -> Exit...");
		int n=scan.nextInt();
		scan.nextLine();
		
		switch(n)
		{
			case 1:
				 System.out.println("Lift Current Positions...");
				 
				 for(Lift l: lifts)
				 {
					 System.out.print(l.liftName+"\t");
				 }
				 System.out.println();
				 for(Lift l: lifts)
				 {
					 if(l.position==1000) System.out.print("-1\t");
					 else
					 System.out.print(l.position+"\t");
				 }
				
				 
				break;
			case 2:
				 addLift();
				break;
			case 3:
				System.out.println("Enter the lift Name");
				String name=scan.nextLine();
				
				for(Lift l:lifts)
				{
					if(l.liftName.equals(name))
					{
						l.position=1000;
					}
				}
				break;
			case 4:
				System.out.println("Exit...");
				return;
			default :
				System.out.println("Enter valid Input...");
		}
	}
	
	
	
	}
	public static  void addLift()
	{
		System.out.println("\t Enter Source...");
		int from=scan.nextInt();
		System.out.println("\t Enter Destination...");
		int to=scan.nextInt();
		
		if(from>=0 && from<=10 && to <=10 && to >=0)
		{
			ArrayList<Lift>nearestLifts=assignLift(from,to);
			
			/*for(Lift l:nearestLifts)
			{
				System.out.println(" "+l.liftName);
			}*/
			
			boolean direct=from<to?true:false;
			
			 int upper=0;
			 int lower=0;
			 
			 for(Lift l:nearestLifts)
			 {
				 if(l.position<from)
				 {
					 lower++;
				 }else
				 {
					 upper++;
				 }
			 }
			 if(upper==nearestLifts.size()||lower==nearestLifts.size())
			 {
				 Lift assign=nearestLifts.get(0);
				 assign.position=to;
				  
				 System.out.println(assign.liftName +" is assigned...");
			 }
			 else{
				 
				 for(Lift l:nearestLifts)
				 {
					 if(l.position<from==direct)
					 {
						 Lift assign1=l;
						 
						 assign1.position=to;
						
						 System.out.println(assign1.liftName+" is assigned.. ");
						 return;
					 }
					 else
					 {
						 
					 }
				 }
				 
				 
			 }
			
			
		}else
		{
			System.out.println("Invalid Input...");
			return;
		}
	}
	public static ArrayList<Lift> assignLift(int from,int to)
	{
		ArrayList<Lift>nearestLifts=new ArrayList<>();
		
		int min=1000;
		
		
		for(Lift l:lifts)
		{
			int val=Math.abs(l.position-from);
			
			if(val<=min)
			{
				min=val;
				
			}
		
		}
			
		for(Lift l:lifts)
		{
			int val=Math.abs(l.position-from);
			
			if(min==val)
			{
				nearestLifts.add(l);
				
			}
			
		}
		return nearestLifts;
	


}
}

class Lift{
	
	String liftName;
	int maintanance;
	int source;
	int dest;
	int position;
	boolean direction;
	
	Lift(String name)
	{
		this.liftName=name;
		this.maintanance=0;
		this.source=0;
		this.dest=10;
		this.position=0;
		this.direction=true;
	}
	
	
	
}