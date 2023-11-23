class CreateTwoThreads{
public static void main(String[] args){
	
	AA thread1=new AA();
	BB thread2=new BB();
	thread1.start();
	thread2.start();
	
	System.out.println("After the Threads...");
	System.out.println("Thread 1 alive "+thread1.isAlive());
	System.out.println("Thread 2 alive "+thread2.isAlive());
	
	try{
	thread1.join();
	}
	catch(Exception e){
		System.out.println(e);
	}

	System.out.println("Thread 1 alive "+thread1.isAlive());
	System.out.println("Thread 2 alive "+thread2.isAlive());
}
}
class AA extends Thread{
	public void run(){
	for(int i=0;i<5;i++)
	{
		System.out.println("2nd Thread ");
		try{
		Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	}
}

class BB extends Thread{

	public void run(){
	for(int i=0;i<5;i++)
	{
		System.out.println("1st Thread ");
		try{
		Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	}



}