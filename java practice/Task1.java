class Task1 implements Runnable{
public static void main(String[] args){

	Task1 t1=new Task1();

	Thread a=new Thread(t1);
	Thread b=new Thread(t1);
	Thread c=new Thread(t1);
	
	a.start();
	b.start();
	c.start();
}

public void run(){

	System.out.println("Thread is started  running... ");
	try{
		Thread.sleep(5000);

	}catch(InterruptedException e){

		System.out.println(e);

	}
	System.out.println("After Sleep ....");

	try{
		Thread.sleep(3000);

	}catch(InterruptedException e){

		System.out.println(e);

	}
	System.out.println("After 2nd sleep ....");

}

}