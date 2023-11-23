//Input: s = "A man, a plan, a canal: Panama"

//Output: true

//Explanation: "amanaplanacanalpanama" is a palindrome.

import java.util.Scanner;

class SentencePalindrome{
	
	public static void main(String[] args){
		
		Scanner sca=new Scanner(System.in);
		
		String s="A man, a plan, a canal: Panama";
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				sb.append(Character.toLowerCase(s.charAt(i)));
			}
		}
		
		System.out.println(sb);
		
		isPalindrome(sb);
		
		
		
	}
	public static void isPalindrome(StringBuilder sb)
	{
		int n=sb.length();
		int ct=0;
		for(int i=0;i<sb.length()/2;i++)
		{
			if(sb.charAt(i)!=sb.charAt(n-1))
			{
				ct++;
				break;
			}
			n--;
		}
		if(ct==0)
		{
			System.out.println("It is a Palindrome ...");
		}
		else
		{
			System.out.println("Not a Palindrome...");
		}
		
	}



}