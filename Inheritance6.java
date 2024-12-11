package javaprograms;

public class Inheritance6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person per=new person("Deepthi",21);
		per.speak();
		student st=new student("Deepthi",21,"A");
		st.study();
		System.out.println("name:"+per.name);
		System.out.println("age:"+per.age);
		System.out.println("name:"+st.name);
		System.out.println("age:"+st.age);
		System.out.println("grade:"+st.grade);
		
		
		
		

	}

}

class person{
	String name;
	int age;
	person(String name, int age){
		this.name=name;
		this.age=age;
	}
  void speak() {
	  System.out.println("this is speak method");
	  
  }
}
class student extends person{
	String grade;
	student( String name, int age,String grade){
		super(name,age);
		this.grade=grade;
		
		
	}
	void study() {
		System.out.println("this is study method");
	}
}
