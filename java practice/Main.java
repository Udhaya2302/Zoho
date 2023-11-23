class Main{

public static void main(String[] args){

	display();
}



display(){

	for(int i=0;i<n;i++)
	{
		System.out.println("Display....");
	}


content(){

	for(int i=0;i<n;i++)
	{
		System.out.println("Content....");
	}
	try{
	Thread.sleep(3000);

	}catch(InterruptedException e){
	
	System.out.println(e);

	}
} 
}
}

