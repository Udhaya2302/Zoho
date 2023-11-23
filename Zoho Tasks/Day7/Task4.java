class Task4{
public static void main(String[] args){

	Class1 thread1=new Class1();
	Class2 thread2=new Class2();


}
}

class Class1 extends Thread {

	Class1(){
		start();
		}
	
public void run() {
	for(int i=0;i<5;i++)
	{
		System.out.println("Java is Hot....");
		try{
		Thread.sleep(1001);
		}catch(InterruptedException e){
		}

	}

}

}

class Class2 extends Thread {

	Class2(){
		start();
		}

public void run() {
	for(int i=0;i<5;i++)
	{
		System.out.println("Java is Aromatic...");
		try{
		Thread.sleep(1000);
		}catch(InterruptedException e){
		}	

	}
}

}