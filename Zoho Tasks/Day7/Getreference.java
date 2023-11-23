
class Getreference{

public static void main(String[] args){

	Thread t1=Thread.currentThread();

	System.out.println("Thread Name  : "+t1.getName());
	System.out.println("Thread Priority  : "+t1.getPriority());
	System.out.println("Thread State  : "+t1.getState());
	System.out.println("Thread Alive  : "+t1.isAlive());
	t1.setPriority(10);
	System.out.println("Thread Priority  : "+t1.getPriority());

	

}
}