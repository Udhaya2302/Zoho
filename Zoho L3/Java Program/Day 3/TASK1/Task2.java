class Rectangle{
	int length;
 	int breath;

	Rectangle(int length,int breath)
	{
		this.length=length;
		this.breath=breath;
	}

public int Area()
{
	int c=length*breath;
	return c;
}

}

class Task2{
public static void main(String[] args)
{

	Rectangle r1=new Rectangle(4,5);
	Rectangle r2=new Rectangle(5,8);	
	System.out.println(r1.Area());
	System.out.println(r2.Area());
}
}