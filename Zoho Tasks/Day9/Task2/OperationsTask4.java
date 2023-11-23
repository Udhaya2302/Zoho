import java.util.LinkedList;
import java.util.Scanner;


public class OperationsTask4{
	public static void main(String[] args){

	LinkedList<Integer> list=new LinkedList<Integer>();
	Scanner scan=new Scanner(System.in);
	
	boolean loop=true;
	while(loop)
	{
		System.out.println("Enter 1. to add Elements..");
		System.out.println("Enter 2. to remove Elements..");
		System.out.println("Enter 3. to update Elements..");
		System.out.println("Enter 4. to Search Elements..");
		System.out.println("Enter 5 to Exit..");
		int useropt=scan.nextInt();
		
		switch(useropt)
		{
			case 1:{
					System.out.println("Enter the num to add ..");
					int num=scan.nextInt();
					list.add(num);
					System.out.println("Added Successfully...");
					System.out.println("List : "+list);
					break;
				}
			case 2:{
					System.out.println("Enter the pos to remove ..");
					int num=scan.nextInt();
					if(num>list.size())
					{
						System.out.println("Enter valid pos...");
					}
					else{
					list.remove(num);
					System.out.println("Removed Successfully...");
					}
					System.out.println("List : "+list);
					break;
			}
			case 3:{
					System.out.println("Enter the pos to add ..");
					int num=scan.nextInt();
					System.out.println("Enter the val to add ..");
					int val=scan.nextInt();
					list.add(num,val);
					System.out.println("Added  Successfully...");
					System.out.println("List : "+list);
					break;
					
				
			}
			case 4:{
					System.out.println("Enter the pos to get ..");
					int num=scan.nextInt();
					list.get(num);
					System.out.println("The Num is : "+list.get(num));
					
					System.out.println("List : "+list);
					break;
				}
			case 5 :{
					loop=false;
					break;
				}
			default :
				{
					System.out.println("Enter Valid Input...");
					break;
				}

		}

	}



}
}