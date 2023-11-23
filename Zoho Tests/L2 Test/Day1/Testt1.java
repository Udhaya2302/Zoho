import java.lang.Math;
class Testt1{
	public static void main(String[] args){


	int a[] = {6,-2,2,3};	
	int c=0,b=0,min=1000;
	int d=0;

		
	for(int i=0;i<a.length;i++)
	{
		c=a[i];
		b=a[i];
		if(a[i]<0)
			{
			
			b=a[i];
			c*=-1;	
			}
		
	if(c==min)
	{
		Math.abs(a[i]);
	}
		
		if(c!=0 && c<min)
		{
			
			min=c;
			d=a[i];
			
			
		}
	}
	System.out.println(d);


}
}