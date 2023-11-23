import java.util.concurrent.TimeUnit;

public class TrafficSignalApp{
	public static void main(String[] args){

	TrafficSignalLight redLight=new TrafficSignalLight("Red",5);
	TrafficSignalLight yellowLight=new TrafficSignalLight("Yellow",2);
	TrafficSignalLight greenLight=new TrafficSignalLight("green",3);


	redLight.start();
	yellowLight.start();
	greenLight.start();
	
	 try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	
}

}

class TrafficSignalLight{

	String colour;
	int duration;

	TrafficSignalLight(String colour,int duration)
	{
		this.colour=colour;
		this.duration=duration;
	}
	
	public void run(){

	while(true){
	
	System.out.println(colour +  " Light is on.....");

	try{
		TimeUnit.SECONDS.sleep(duration);

	}catch(InterruptedException e)
	{
	e.printStackTrace();


	}	


	}
	}



}