class Student{
String name;
int roll_num;
String phone_no;
String address;

Student(String name,int roll_num,String phone_no,String address)
{
	this.name=name;
	this.roll_num=roll_num;
	this.phone_no=phone_no;
	this.address=address;
}
public String toString(){
return " Name : "+name+"\n Roll Num : "+roll_num+"\n Phone No : "+phone_no+"\n Address : "+address;
}

}

class Task5{
public static void main(String[] args)
{
	Student s1=new Student("sam",1,"12345678","3/40,tambaram,chennai.");
	Student s2=new Student("John",1,"87654321","3/42,guduvanchery,chennai.");
	System.out.println(s1);
	System.out.println(s2);


}
}