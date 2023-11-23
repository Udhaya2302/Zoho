import java.util.*;

public class Test4{
	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr = new int[n];
	int c=0;
	for(int i=0;i<n;i++){

		arr[i]=sc.nextInt();

	}

	
	for(int i=0;i<n;i++){

		for (int j=i;j<n;j++){

			int sum=0,lc=1;

			for(int k=i;k<=j;k++){

				  sum+=arr[k];

				lc=(lc*arr[k])/gcd(lc,arr[k]);
		}
	if(sum%2 == lc%2) c++;
	}
	}
		System.out.println(c);
	}


	public static int gcd(int a,int b){
	while(b!=0){

		int t=b;
		b=a%b;
		a=t;
	}
	return a;
	}
}