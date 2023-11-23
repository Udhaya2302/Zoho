import java.util.Scanner;

class Task2{
	
public static void main(String[] args){

Scanner scan=new Scanner(System.in);

System.out.println("Enter the size of array...");

int n= scan.nextInt();
int a[]=new int[n];
int j,k;
int sum=0;
	
for(int i=0;i<n;i++)
{
	a[i]=scan.nextInt();

}

for(int i=0;i<n;i++)
{
	System.out.println(a[i]);

}


for(int i=0;i<n;i++)
{
	for(j=i;j<n;j+=2)
	{
		for(k=i;k<=j;k++)
		{
			sum+=a[k];
		}
	}
}


System.out.println(sum);
}
}