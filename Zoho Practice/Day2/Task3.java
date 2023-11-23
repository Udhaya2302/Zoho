class Task3{
	public static void main(String[] args){

	int a[]={1,2,1};
	int b[]= new int[10];
	int k=0;

	for(int i=0;i<2;i++){
	
		for(int j=0;j<a.length;j++)
		{
			b[k]=a[j];
			k++;
		}
	}
	for(int i=0;i<a.length*2;i++)
	{

		System.out.println(b[i]);
	}

}

}