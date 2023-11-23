import java.util.*;

class Attendance{
	static ArrayList<Student>al=new ArrayList<>();
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter no of Peoples ...");
		int n=scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter the Start time...");
		String startTime=scan.nextLine();
		
		String sTime[]=startTime.split("-");
		
		System.out.println("Enter the Start time...");
		String endTime=scan.nextLine();
		
		String eTime[]=endTime.split("-");
		
		int shrs=Integer.parseInt(sTime[0]);
		int smins=Integer.parseInt(sTime[1]);
		int ehrs=Integer.parseInt(eTime[0]);
		int emins=Integer.parseInt(eTime[1]);
		
		int totalMins=0;
		if((ehrs-shrs)>0)
		{
			totalMins=ehrs- shrs;
			totalMins*=60;
		}
		if((emins-smins)>0)
		{
			totalMins+=emins- smins;
		}
		System.out.println(totalMins);

		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter  Id ");
			int id=scan.nextInt();
			System.out.println("Enter  Intervals ");
			int intervals=scan.nextInt();
			scan.nextLine();
			
			String startArray[]=new String[intervals];
			String endArray[]=new String[intervals];
			int k=0;
			int l=0;
			for(int j=0;j<intervals*2;j++)
			{
				if(j%2==0)
				{
					System.out.println("Enter the Start Time");
					startArray[k++]=scan.nextLine();
				}
				else
				{	
					System.out.println("Enter the end Time");
					endArray[l++]=scan.nextLine();
				}
			}
			
			Student s=new Student(id,intervals,startArray,endArray);
			al.add(s);
			
			
		}
		int totalAbs=0;
		int id1=0;
		for(Student s: al)
		{
			//if(SId==1)
			{
				int ans=0;
				
				for(int k=0;k<s.M1;k++)
				{
					String startid1[]=s.start[k].split("-");
					
					String endid1[]=s.end[k].split("-");
		
					int s1hrs=Integer.parseInt(endid1[0]);
					System.out.println("s1 -> hrs"+s1hrs);
					
					int s1mins=Integer.parseInt(startid1[1]);
					System.out.println("s1 -> mins"+s1mins);
					
					int e1hrs=Integer.parseInt(endid1[0]);
					
					int e1mins=Integer.parseInt(endid1[1]);
					if((ehrs-shrs)>0)
					{
						ans=e1hrs- s1hrs;
						ans*=60;
						System.out.println("");
					}
					if((e1mins-e1mins)>0)
					{
						ans+=e1mins- s1mins;
					}
				}
				if(s.SId==1)
				{
					id1=ans;
				}
				totalAbs+=ans;
				s.absent=ans;
				
			}
		}
		
		System.out.println(id1 + "/" + totalAbs);
	}

}
 class Student{
	 
	String [] start;
	String []  end;
	int SId;
	int M1;
	int absent;
	
	Student(int id,int M1,String[] start,String[] end)
	{
		this.SId=id;
		this.M1=M1;
		this.start=start;
		this.end=end;
		this.absent=0;
	}
	
	 
	 
 } 
