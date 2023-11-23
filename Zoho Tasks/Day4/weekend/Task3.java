import java.util.Scanner;

class Task3{
public static void main(String[] args){

Scanner scan=new Scanner(System.in);

int words=scan.nextInt();
String[] s=new String[words];

for(int i=0;i<words;i++)
{
	s[i]=scan.next();

}

for(int i=0;i<words;i++)
{
	System.out.println(s[i]);
}

String pref=scan.next();


int ct=0;

for(String s1:s)
{
	if (s1.startsWith(pref)) {
                ct++;
            }
}

System.out.println(ct);

	

}
}