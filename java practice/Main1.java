class Main1{

public static void main(String[] args){

	//display();
	content();
	display();
}



static void display(){
	

	for(int i=0;i<5;i++)
	{
		System.out.println("Display....");
	}
}


static void content(){

	for(int i=0;i<5;i++)
	{
		try{
			Thread.sleep(1000);

		}catch(InterruptedException e){
	
		System.out.println(e);}

		System.out.println("Content....");
	}
	


	
} 

}

