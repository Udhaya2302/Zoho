import java.util.Scanner;
 class ATM {

    private double balance;

 	ATM(double balance) {
        this.balance = balance;
    }

    public  double getBalance() {
        return this.balance;
    }

public void deposit(double amount) {
	
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit :" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

public boolean withdraw(double amount) {
        if (amount > 0 &&amount<=balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Insufficient Balance...");
            return false;
        }
    }
}

public class TaskAtm{
public static void main(String[] args){

 	Scanner scan=new Scanner(System.in);
	ATM atm = new ATM(0);
	boolean loop=true;

while(loop)
{
	System.out.println("Enter 1 to credit");
	System.out.println("Enter 2 to debit");
	System.out.println("Enter 3 to exit");

	int opt=scan.nextInt();
	
	
	switch(opt)
	{
		
	case 1:
	{
		
		System.out.println("Enter Amount");
		int am=scan.nextInt();
		 atm.deposit(am);
       		 System.out.println("Current Balance: " + atm.getBalance());
		break;
	}
	case 2:
	{
		System.out.println("Current Balance: " + atm.getBalance());
		System.out.println("Enter Amount");
		int am=scan.nextInt();
		boolean success = atm.withdraw(am);
       		 if (success) {
            		System.out.println("Current Balance: " + atm.getBalance());
       			}
			break;
	}
	case 3:
	{
		System.out.println("exit");
		loop=false;
		break;
	}
	default :
	{
		System.out.println("Enter valid Input...");
		break;
	}


	}



}



}


}