import java.util.Arrays;

class Task3{
	public static void main(String[] args){

	int a[]= {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
	double sum=0;

	Arrays.sort(a);
	double start=a.length*0.05;
	double end=a.length-start;
	
	System.out.println(start);
	System.out.println(end);

	for(int i=(int)start;i<(int)end;i++)
	{
		sum=sum+a[i];
		
	}
	
	double ans =sum/(a.length-(int)2*start);
	System.out.println(ans);
	



}


}