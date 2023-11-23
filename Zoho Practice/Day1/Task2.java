class Task2{
	public static void main(String[] args){


	String s[]={"cba","daf","ghi"};
	int ct=0;

	

	for(int i=0;i<s.length;i++)

	{
		for(int j=0;j<s.length-1;j++)

		{
			if(s[j].charAt(i)>s[j+1].charAt(i))
			{
				ct++;
				break;
			}
		}
	
	}

	System.out.println(ctN);

}



}