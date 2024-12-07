package javaprograms;

public class constructor2 {

	 String firstname;
	 String lastname;
	 	int age;
	 	
	 public constructor2 (String firstname,String lastname,int age)
	 {
	 this.firstname= firstname;
	 this.lastname= lastname;
	 this.age=age;
	 }
	 void display()
	 {
	 System.out.println("firstname=" +firstname);
	 System.out.println("lastname=" +lastname);

	 System.out.println("age=" +age);

	 }
	 public static void main(String args[]) {
		 constructor2   ob=new constructor2  ("Deepthi", "Puttapaka", 21);
	 ob.display();


	}

}
