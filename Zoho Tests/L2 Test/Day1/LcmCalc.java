class LcmCalc{

public static int tofindLCM(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}

public static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return(gcd(b,a%b));
		}

	}


public static void main(String[] args){

	int result=tofindLCM(7,9);
	System.out.println(result);

}


}