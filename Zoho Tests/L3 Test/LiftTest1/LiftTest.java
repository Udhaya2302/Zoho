import java.util.*;

class LiftTest{
	
	public static void main(String[] args){

		ArrayList<Lift>lifts=new ArrayList<>();
		
		lifts.add(new Lift());
		lifts.add(new Lift());
		lifts.add(new Lift());
		lifts.add(new Lift());
		lifts.add(new Lift());
		
		Scanner scan=new Scanner(System.in);
		
		boolean loop=true;
		
		while(loop)
		{
			System.out.println("	1-> Display The pos of Lift....");
			System.out.println("	2-> Assign Lift....(2&3 )");
			System.out.println("	3-> Display The pos of Lift....");
			System.out.println("	4-> Display The pos of Lift....");
			System.out.println("	5-> Maintanance Lift....");
			
			int n=scan.nextInt();
			switch(n){
			case 1:
			{
				System.out.println("Display");
				displayLifts(lifts);
				break;
			}
			case 2:
			{
				System.out.println("Enter the start floor...");
				int start=scan.nextInt();
				
				System.out.println("Enter the End Floor...");
				int end=scan.nextInt();
				if(start>=0&&end<=10)
				{
					assignLift(start,end,lifts);
				}else
				{
					System.out.println("Enter Valid Input....");
				}
				
				
				break;
			}
			case 5:
			{
				System.out.println("Maintanance...");
				System.out.println("Enter the Lift No : ");
				int maintanance=scan.nextInt();
				
				maintananceLift(lifts,maintanance);
				
				break;
			}
			
			}
		}
		
	
	}
	public static void maintananceLift(ArrayList<Lift>lifts,int maintanance)
	{
		for(Lift l : lifts)
		{
			if(maintanance==l.Lid)
			{
				l.currentPos=-1;
				System.out.println(" "+l.name +" is ata Maintanance...");
			}
		}
			
	}
	public static void assignLift(int start,int end,ArrayList<Lift>lifts)
	{
		Lift assign=lifts.get(0);
		int currentShort=10;
		
		for(Lift l:lifts)
		{
			if(start==currentPos)
			{
				return l;
			
			}
		}
		for(Lift l:lifts){
			if(currentShort>Math.abs(l.currentPos-start))
			{
				currentShort=Math.abs(l.currentPos-start)
				assign=l;
				
			}
		}
		//Up condition......
			
			if(start<to)
			{
				for(Lift l:lifts)
				{
					if(start>=lift.currentPos && currentShor>=(start-l.currentPos))	
					{
						assign=lift;
					}
				}
			}
		
		
		
	}
	
	public static void displayLifts(ArrayList<Lift>lifts)
	{
		for(Lift l1:lifts)
		{
			System.out.println("Lift : "+l1.name+" pos : "+l1.currentPos);
		}
	}

}

class Lift{
	static int id=0;
	static int id1=0;
	
	String name;
	int startPos;
	int endPos;
	int currentPos;
	int Lid;
	int capacity;
	
	Lift()
	{
		this.name="L"+ ++id;
		this.startPos=0;
		this.currentPos=0;
		this.endPos=0;
		this.Lid=++id1;
		int capacity=10;
	}
	
	
	
	
}