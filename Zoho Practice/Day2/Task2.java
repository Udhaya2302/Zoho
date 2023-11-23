class Task2{
	public static void main(String[] args){
		
	int a[]= {-1,1,-1,1,-1};

	int b=fun(a);
	if(b>0)
	{
		System.out.println(1);
	}else if(b<0)
	{
		System.out.println(-1);
	}else
	{
		System.out.println(0);
	}

}
public static int fun(int a[]){

	int pro=1;
	for(int i=0;i<a.length;i++)
	{
		pro=pro*a[i];
	}
	return pro;



}

}