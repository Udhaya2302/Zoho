class Task5{
	public static void main(String[] args){

	int a[][]={{1,5},{7,3},{3,5}};
	
	int sum=0;
	int ct=0;

	for(int i=0;i<a.length;i++)
	{
		sum=0;
		for(int j=0;j<a[i].length;j++)
		{
			sum+=a[i][j];
		}
		if(sum>ct)
		{
			ct=sum;
		}

	}
	System.out.println(ct);

}
}