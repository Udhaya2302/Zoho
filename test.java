
class test{
	
	public static void main(String[] args){
	
		B b=new B();
		b.show();
		
		A a = new B();
		a.show();
	
	
	}
		
}
class A{
	
	static void show(){
		System.out.println("Class A ");
	}
}
class B extends A{
	static void show(){
		System.out.println("Class B");
		
		
	}
	
}