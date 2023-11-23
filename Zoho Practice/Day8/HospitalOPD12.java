 import java.util.*;
public class HospitalOPD12 {
	
	public static void main(String[] args){
		
	
	Scanner scan = new Scanner(System.in);
	
	Stack<Patient>patientList=new Stack<>();
	ArrayList<Patient>patientDetails=new ArrayList<>();
	
	//patientList.push(new Patient("aaa","123",300,10));
	
	boolean loop=true;
	System.out.println(" OPD Management ");
	while(loop)
	{
		
		System.out.println("  1->  patient Register ");
		System.out.println("  2->  view Waiting Patient ");
		System.out.println(" 3->  View Patient Details");
		System.out.println("  4->  Exit ...");
		int n=scan.nextInt();
		scan.nextLine();
		switch(n)
		{
			case 1:
			{
				System.out.println("   Register  ");
				System.out.println("Enter the name...");
				String name =scan.nextLine();
				System.out.println("Enter the Phone Number ");
				String phone=scan.nextLine();
				System.out.println("Enter In time....");
				int inTime=scan.nextInt();
				
				System.out.println("View Time");
				int d=scan.nextInt();
				Patient pat=new Patient(name,phone,inTime,d);
				
				if(patientList.size()==0)
				{
					for(int i=0;i<5;i++)
					{
						System.out.print(pat.a[i]+" ");
					}
					patientList.push(pat);
					patientDetails.add(pat);
					
				}
				else{
					
					Patient p=toVerify(name,phone,patientList,inTime);
					
					if(p!=null)
					{
						
					System.out.println(true);
					
					
					}else
					{
					
						Patient prev=patientList.peek();
						System.out.println(".............");
					
					toCalculate(prev, pat,d);
					System.out.println(".............");
					for(int i=0;i<5;i++)
					{
						System.out.print(pat.a[i]+" ");
					}
					patientList.push(pat);
					patientDetails.add(pat);
					}
				}
				
				break;
			}
			case 2:
			{
				System.out.println("	2-> WaitingList...   ");
				System.out.println("Enter the time to check...");
				int time=scan.nextInt();

				toCheckWaiting(time,patientDetails);
				break;
			}
			case 3:
				{
				System.out.println("All Patient Timings...");
				patientHistory(patientDetails);
				break;

				}
			case 4:
				{
					System.out.println("Exit...");
					loop=false;
					break;

				}
			default:
			{
				System.out.println("Invalid Input....");
				break;
			}
		}
	
	}
	
	
	
	}
	public static void patientHistory(ArrayList<Patient>patientDetails)
	{
		for(Patient p:patientDetails)
		{
			System.out.println("Name : "+p.name);
			for(int i=0;i<5;i++)
			{
				System.out.print(p.a[i]+" ");
			}
		}

	}
	public static void toCheckWaiting(int time,ArrayList<Patient>patientDetails)
	{
		int ct=0;
		for(Patient p : patientDetails)
		{
			if(p.in>time)
			{
				ct++;
			}
		
		}
		System.out.println("Patient Waiting  : "+ct);


	}
	public static void toCalculate(Patient p1,Patient p2,int d)
	{
		int m=0;


		int n=p1.a[1]-p2.a[0];
		System.out.println("1   "+n);
		
		if(n>0)
		{
			m+=n;
			
			
			p2.a[1]=p2.a[0]+n+5;
		}
		else{
		p2.a[1]=p2.a[0]+5;
		}
		
		//..............
		
		 n=p1.a[2]-p2.a[1];

		System.out.println("2   "+n+" a0 ... a1 "+p2.a[0]+"   "+p2.a[1]);
		
		if(n>0)
		{
			m+=n;
			
			p2.a[2]=p2.a[1]+n+5;
		}else{
			
			p2.a[2]=p2.a[1]+5;
		}

		//...................
		
		
		 n=p1.a[3]-p2.a[2];

		

		if(n>0)
		{
			m+=n;
			
			p2.a[3]=p2.a[2]+n+d;
		}else{
			
			p2.a[3]=p2.a[2]+d;
		}
		//...................
		
		
		 n=p1.a[4]-p2.a[3];
		
		if(n>0)
		{
			m+=n;
			
			p2.a[4]=p2.a[3]+n+5;
		}else{
			
			p2.a[4]=p2.a[3]+5;
		}
		//...................
		
		if(m>0)
		{
			System.out.println("Sorry For the Waiting...");
			System.out.println("Total Waiting Time ..."+m);
		}
		else
		{
			System.out.println("You Are Lucky! No waiting Time...");
		}
		
		
	}
	
	
	
		public static Patient toVerify(String name,String phone,Stack<Patient>patientDetails,int inTime)
	{
		
		
		for(Patient p:patientDetails)
		{
			
			if(p.name.equals(name)&&p.phone.equals(phone))
			{
				
				return p;
			}
			
		}
		return null;
	}
	
	
}
class Patient{
	static int id=0;
	int patientId;
	String name;
	String phone;
	int a[];
	int in;
	
	
	Patient(String name,String phone,int inTime,int D)
	{
		this.name=name;
		this.phone=phone;
		this.patientId=++id;
		this.in=inTime;
		this.a=new int[5];
		a[0]=inTime;
		a[1]=a[0]+5;
		a[2]=a[1]+5;
		a[3]=a[2]+D;
		a[4]=a[3]+5;
	
		
		
		
	
	}
	

}