import java.util.Scanner;

class Testt4{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	int a[]={1,2,3,4,5};
	
	int t=4;
	
	int start=0;
	int end=a.length-1;
	
	
	find(a,start,end,t);

	
	}
	public static void find(int a[],int start,int last,int key)
	{
		int mid=start+last/2;
		
		while(start<=last)
		{
			if(a[mid]<key)
			{
				start=mid+1;
				
			}
			else if(a[mid]==key)
			{
				System.out.println(" Target found at index : "+mid);
				break;
			}
			else{
				last=mid-1;
			}
			
			mid=(start+last)/2;

		}
		
		if(start>last)
		{
			System.out.println("Element Not Found...");
		}
		
		
		
	}

}