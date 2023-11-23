interface Life{
	void life();
}

interface Employee{
	void work();
}

class Humans implements Life,Employee{
	
//@override
public void life(){
	
System.out.println("Humans wants to live...");
}

//@override...

public void work()
{	
	System.out.println("They also wants to work to live their life...");
}

}

public class Task1{
public static void main (String[] args){
	
	Humans h1=new Humans();

	h1.life();
	h1.work();

}
}
