class Task4{

public static void main(String[] args){

int a[]={2,3,5,1,3};
int extra=3;

for(int i=0;i<a.length;i++)
{
int ct=0;
	for(int j=0;j<a.length;j++)
	{
		if((a[i]+extra)<a[j])
		{
			ct++;
		}


		
	}
if(ct!=0)
System.out.println(false);
else
System.out.println(true);

	
}
}

}