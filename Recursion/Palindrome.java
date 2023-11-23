class Palindrome{

	public static void main(String args[]){

		int a[]={1,2,4,3,2,1};
		
		fun(a,0,a.length-1);
	
	
	}
	public static void fun(int a[],int start,int end){
		
		if(start>=a.length/2)
		{
			System.out.println(true);
			return ;
		}
		
		if(a[start]!=a[end])
		{
			System.out.println(false);
			return;
		}
		
		fun(a,++start,--end);
		
		
	}

}