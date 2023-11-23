//Example 1:

//Input: words = ["bella","label","roller"]

//Output: ["e","l","l"]

import java.util.Scanner;

class CommonChars{
	public static void main(String[] args){
	
	String a[]= {"cool","lock","cook"};
	
	String s1=a[0];
	//String s2=a[1];
	String s3="";
	
	for(int i=0;i<a.length-1;i++)
	{
		s1=fun(s1,a[i+1]);
		//s1=s3;
		System.out.println(s1);
		
	}
	System.out.println(s3);
	
	
	
	}
	public static String fun(String s1,String s2)
	{
		//System.out.println(s1 +s2 );
		StringBuilder sb=new StringBuilder();
		
		int arr[] = new int[26];
		
		for (int i=0; i<s1.length(); i++)
			arr[s1.charAt(i) - 'a']++;
		
		for (char c : s2.toCharArray()) {
			if (arr[c - 'a'] != 0) {
				sb.append(c);
				arr[c - 'a']--;
			}
		}
		
		System.out.println(sb);
		return sb.toString();
		
	}


}