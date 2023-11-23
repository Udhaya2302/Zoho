class Test1{
	public static void main (String[] args){

	//Scanner scan=new Scanner(System.in);

	int a[]={1,1,2,3};
	int b[]=new int[10];
	int n=4;
	int freq=0;
	int val,k=0;

	for(int i=0;i<n;i++)
	{
		if(i%2==0)
		{
			freq=a[i];
		}
		else{
			val=a[i];
		
			for(int j=0;j<freq;j++)

			{

				b[k]=val;
				k++;
				}
		}

	}	
	for(int i=0;i<k;i++)
	{
	System.out.println(b[i]);

	}



}


}