import java.util.Scanner;

class Task2{
public static void main(String[] args){

	Scanner scan=new Scanner(System.in);
	
	String s1=scan.nextLine();
	int l=scan.nextInt();
	int m=scan.nextInt();
	int n=scan.nextInt();
	
	String s=scan.nextLine();
	
	
	StringBuilder sb=new StringBuilder();
	
	for(int i=0;i<l-m;i++)
	{
		int onesCount=0;
		
		for(int j=i;j<i+m;j++)
		{
			if (s.charAt(j) == '1') {
                    onesCount++;
					}
		}
		if(onesCount>n)
		{
			int replaceIndex = i + km- 1;
                result.setCharAt(replaceIndex, '0');
                operations++;
		}
	}
	System.out.println(operations);
	

}
}