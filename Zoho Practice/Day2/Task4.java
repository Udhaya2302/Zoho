class Task4{
	public static void main(String[] args){

	String s[]={"--X","X++","X++"};
	int ct=0;

	for(int i=0;i<s.length;i++)
	{
		if(s[i].equals("++X")||s[i].equals("X++"))
		{
			ct++;
		}else if(s[i].equals("--X")||s[i].equals("--X"))
		{
			ct--;

		}

	}
	System.out.println(ct);



}

}