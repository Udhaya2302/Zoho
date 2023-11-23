//Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//A shift on s comprises moving the leftmost character of s to the rightmost position.

//For example, if s = "abcde", then it will be "bcdea" after one shift.

//Input: s = "abcde", goal = "cdeab"

//Output: true

import java.util.Scanner;

class Shifts{
	public static void main(String[] args){
		
		String s="abcde";
		
		String s2="cdeab";
		
		StringBuilder sb1=new StringBuilder(s);
		StringBuilder sb2=new StringBuilder(s2);
		
		int ct=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.equals(s2))
			{
				
				ct++;
				break;
			}
			char temp=sb1.charAt(0);
			
			sb1.deleteCharAt(0);
			
			sb1.append(temp);
			
			s=sb1.toString();
			
			
		}
		if(ct==0)
		{
			System.out.println(false);
		}
		else
		{
			System.out.println(true);
		}
		
		
		
		
		
		
	} 


}