class Animal{
	void makeSound()
{
	System.out.println("Animals making sound...");	
}
}
class Dog extends Animal{
	void makeSound()
{
	System.out.println("Dog Barks...");
}

}
class Cat extends Animal{
	
	void makeSound()
{
	System.out.println("Cat Meows...");
}

}

class Task1{
public static void main(String[] args){

Animal A1=new Dog();
Animal A2=new Cat();
Animal A3=new Animal();

A1.makeSound();
A2.makeSound();
A3.makeSound();
}

}