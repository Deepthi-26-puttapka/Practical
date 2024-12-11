package javaprograms;

class Inheritance5{
	public static void main(String args[])
	{
		car car1=new car("BMW Grp","BMW X6",2025,300); // create object for child cls Car
		car1.drive(); // call car method
		bike bike1=new bike("duke","KTM 6",2024,200); //create object for child cls bike
		bike1.drive(); // call bike method
		// these all are printing statements for child classes car , bike
		System.out.println("--------------------------");
        System.out.println("car Details:");
        System.out.println("Make: " + car1.make);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);
        System.out.println("Max Speed: " + car1.maxspeed);
        System.out.println("--------------------------");
        System.out.println("bike Details:");
        System.out.println("Make: " + bike1.make);
        System.out.println("Model: " + bike1.model);
        System.out.println("Year: " + bike1.year);
        System.out.println("Max Speed: " + bike1.maxspeed);
		
	}
} // parent class
class vehicle{
	String make,model; // parameters of parent cls
	int year,maxspeed;
	
		
	vehicle(String make,String model,int year,int maxspeed)// parent cls constructor 
	{
		this.make=make; // invoke the parent cls parameters
		this.model=model;
		this.year=year;
		this.maxspeed=maxspeed;
	}
	void drive() { // here is the one method used for print the statements
		
	}
}
class car extends vehicle // child class car that extend the parent cls vehicle
{
	car(String make,String model,int year,int maxspeed)// constructor for child cls 
	{
		super(make,model,year,maxspeed);//we use parameters of parent cls its causes to constructor 
		//override to avoid this we can use super keyword
		// constructor ovveride : super(parameters of parent cls)
		// method override: super.drive();
	}
	void drive() {
		System.out.println(make+" "+model+"car is driving");
	}
}
class bike extends vehicle{ // another child cls bike it extends vehicle
	bike(String make,String model,int year,int maxspeed){
		super(make,model,year,maxspeed);
	}
	void drive() {
		System.out.println(make+" "+model+"bike is driving");
	}
}

