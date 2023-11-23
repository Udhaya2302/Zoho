class Task6{
public static void main(String[] args){

	MyThread t1=new MyThread("This Is 1st Thread...");
	Thread thread1=new Thread(t1);
	thread1.start();
	
	MyThread t2=new MyThread("This Is 2st Thread...");
	Thread thread2=new Thread(t2);
	thread2.start();

}

}

class MyThread implements Runnable{

	String message;

	MyThread(String message)
	{
		this.message=message;
	}

	
public void run(){

		for(int i=0;i<5;i++)
		{
			System.out.println(message);
			
			try{
			Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}

}


}