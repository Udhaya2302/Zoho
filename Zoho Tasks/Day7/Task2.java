class Task2{
public static void main(String[] args) throws Exception{


	MyThread t1=new MyThread("New Thread");
	System.out.println(t1.getName());
	
	t1.join();
	for(int i=0;i<5;i++)
	{
		System.out.println("Main Thread is Running...");
		Thread.sleep(1000);
	}
	

}

}
class MyThread extends Thread{



MyThread(String string)
{
	super(string);
	start();
}

public void run(){
	for(int i=0;i<5;i++)
	{
		System.out.println("My Thread is Running... "+i);
		try{
		Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println(e);
		}

	}
	}
}
