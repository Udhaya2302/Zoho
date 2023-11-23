abstract class Marks{

	abstract double getMarks();

}

class StudentA extends Marks{

	double subject1;
	double subject2;
	double subject3;

	StudentA(double marks1,double marks2,double marks3)

	{
		this.subject1=marks1;
		this.subject2=marks2;
		this.subject3=marks3;
	}

	double getMarks()
	{
		  double  total=(subject1+subject2+subject3);
		double percent=(total/300)*100;
		return percent;
	}
}

class StudentB extends Marks{

	double subject1;
	double subject2;
	double subject3;
	double subject4;

	StudentB(double marks1,double marks2,double marks3,double marks4)

	{
		this.subject1=marks1;
		this.subject2=marks2;
		this.subject3=marks3;
		this.subject4=marks4;
	}

	double getMarks()
	{
		double  total=(subject1+subject2+subject3+subject4);
		double percent=(total/400)*100;
		return percent;
	}
}

public class Task4{

public static void main(String[] args)
{
	Marks student1=new StudentA(50,50,50);
	System.out.println("Percentage : "+student1.getMarks());

	
}

}
