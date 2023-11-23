class Task4{

public static void main(String[] args){

int a[]={22,3,4,6,99,11};
int max1=0;
int max2=0;

for(int i=0;i<a.length-1;i++)
{

max1=a[0];
if(a[i]>a[i+1])
{
max2=max1;
max1=a[i];
}
}
System.out.println(max2);

}


}
