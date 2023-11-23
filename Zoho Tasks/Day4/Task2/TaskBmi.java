import datas.Data;
import java.util.Scanner;

class TaskBmi{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter your weight...");
	int wgt=scan.nextInt();
	System.out.println("Enter your height...");
	int hgt=scan.nextInt();

	Data d1=new Data(wgt,hgt);
	System.out.println("BMI : "+d1.getBmi());

	
}
}