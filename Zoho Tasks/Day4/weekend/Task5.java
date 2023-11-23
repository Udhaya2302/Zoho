public class Task5{
public static void main(String[] args){

String s="11111222223";
int k=3;


while(s.length()>k)
{
	int i=0;
	StringBuilder sb = new StringBuilder();

	while(i<s.length())
	{

	int sum=0;
	for (int j = 0; j < k && i < s.length(); j++)
		 {
                    sum += Character.getNumericValue(s.charAt(i));
                    i++;
                }
	sb.append(sum);
	}
	s=sb.toString();

}
System.out.println(s);


}
}