package javaprograms.Arrays1;

public class Createobjects {
	// method
	void display() {
		System.out.println("object creation using new keyword");
	}

 // constructor
	Createobjects(){
		System.out.println("object creation using constructors");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Createobjects ob =new Createobjects (); // for method
		ob.display();
		
		Createobjects xyz= new Createobjects (); // for construtcor

	}	

}
