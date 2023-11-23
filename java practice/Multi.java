class Multi extends Thread{

public static void main(String[] args){

	Multi m=new Multi();
	m.start();

}
public void run(){
	System.out.println("Thread is running...");
}
}