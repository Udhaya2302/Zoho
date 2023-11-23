import java.util.*;
class Test2{
	
	public static void main(String[] args)
	{
		String s="0b00000010100101000001111010011100";
		
		long l=0b11111111111111111111111111111101L;
		
		long ans=reverse(l);
		System.out.println(ans);
		
		
	}
	public static long reverse(long l)
	{
		long ans=0;
		
		for(int i=0;i<32;i++)
		{
			ans=ans<<1;
			
			ans=ans|l&1;
			l=l>>1;
		}
		return ans;
	}
	


}