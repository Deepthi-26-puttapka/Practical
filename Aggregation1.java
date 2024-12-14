package javaprograms;

public class Aggregation1 // class name
{

	public static void main(String[] args) // main method
	{
		// TODO Auto-generated method stub
		name n=new name("Deepthi","Puttapaka"); // object for name class
		And a=new And(n,21,101); // object creation for And
		a.main(); // call the method
		

	}

}
class name // class name
{
	String firstname;
	String lastname;
	name(String firstname,String lastname )// create constructor
	{
		this.firstname=firstname;
		this.lastname=lastname;
	}
}
 class And // another cls name
 {
	name name; // call name cls
	int age;
	int id;
	And(name name, int age, int id) //constructor for And cls
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
	void main()  // method declaration
	{
		System.out.println("student details:");
		System.out.println("Name: " + name.firstname + " " + name.lastname);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
	}

}
