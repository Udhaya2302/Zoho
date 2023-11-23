
class Task1{
	public static void main(String[] args){
	
	String s="What is the solution to this problem";
	int n=4;
	int ct=0;
	
	boolean loop=true;
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==' ')
		{
			ct++;
		}
		if(ct==n)
		{
			break;
		}
		System.out.print(s.charAt(i));
	}



}


}