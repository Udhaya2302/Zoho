import java.util.Scanner;

class Task5{
	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the String...");
	String s1=scan.next();
	
	if(s1.length()%2==0)
	{
		System.out.println("Not Possible...");
		System.exit(0);
	}else{
		
		int n=s1.length();
		
		int mid=n/2;
		
		
        for (int i = 0; i < n; i++) 
		{
			
            for (int j = 0; j < n; j++) 
			{
                 if (i + j == mid || i - j == mid || j - i == mid || i + j == 3 * mid)
					 {
                    System.out.print(s1.charAt(Math.abs(mid - i)));
                } else 
				{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
	}
	
}