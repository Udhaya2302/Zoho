class Parent{
 final void Study()
{
	System.out.println("You must Study....");
}
void play()
{
	System.out.println("Its ur wish....");
}
}

class Child extends Parent {

/*void Study()
{
	System.out.println("I am not Study....");
}
*/
void play()
{
	System.out.println("I play Cricket...");
}

}

class Task2{
public static void main(String[] args){

Child c1=new Child();
c1.Study();
c1.play();

}

}
