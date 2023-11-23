import java.util.Arrays;

class Test3{
	public static void main(String[] args)
	{
	int a[]={3,2,3,2,2,2,32,2};
	
	Arrays.sort(a);
	
	boolean val=true;
	
		for(int i=0;i<a.length;i+=2)
		{
			if(a[i]!=a[i+1])

			{
			 val=false;

			}
	}
	

	System.out.println(val);

	}

}

