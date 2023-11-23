import java.util.ArrayList;
import java.util.List;

class Person{

	String name;
	int age;
	String gender;

Person(String name,int age,String gender){
	this.name=name;
	this.age=age;
	this.gender=gender;
}

 public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

public String toString()
{
	return "Name :  "+ name+"  age :  "+age+" Gender :  "+gender;
}

}

class Patient extends Person{

	int patientid;
	
	Patient(String name ,int age,String gender,int patientid)
	{
		super(name,age,gender);
		this.patientid=patientid;
	}

	public int getPatientid() {
        	return patientid;
  	  }

public String toString(){

	return super.toString()+" "+patientid;
}
}


class Doctor extends Person{
String specialization;

Doctor(String name ,int age,String gender,String specialization)
{
	super(name,age,gender);
	this.specialization=specialization;

}

public String getSpecialization(){
	return specialization;
}

public String toString(){

	return super.toString()+ specialization;
}

}


class Hospital{

public List<Patient>patientList=new ArrayList<>();
public List<Doctor>doctorsList=new ArrayList<>();

void addPatient(Patient p)
{
	patientList.add(p);
}


public void printPatients(){
	System.out.println("Patient details  : ");

	for(Patient p: patientList)
	{
		System.out.println(p);

	}

}

}



class Task2{
public static void main(String[] args){

Hospital h1=new Hospital();
Doctor D1=new Doctor("aaa ",1,"M ","dd");
Patient p2=new Patient("bbb",2,"f",5);
Patient p3 = new Patient("Alice", 30, "Female", 1001);
Patient p4 = new Patient("Bob", 45, "Male", 1002);

	h1.addPatient(p2);
	h1.addPatient(p3);

	 h1.printPatients();




}


}