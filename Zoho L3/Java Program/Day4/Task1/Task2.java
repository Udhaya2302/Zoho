abstract class Bank{

	abstract void getbalance();

}

class BankA extends Bank{
	int a=100;
	void getbalance(){

	System.out.println(" $ "+a);
}
}
class BankB extends Bank{
	int a=150;
	void getbalance(){

	System.out.println(" $ "+a);
}
}
class BankC extends Bank{
	int a=200;
	void getbalance(){

	System.out.println(" $ "+a);
}
}

public class Task2{
public static void main(String[] args)
{
	Bank b1=new BankA();
	b1.getbalance();
	Bank b2=new BankB();
	b2.getbalance();
	Bank b3=new BankC();
	b3.getbalance();
}

}