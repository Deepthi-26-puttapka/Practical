package javaprograms;

public class constructors1 {

	
	String name;
	int age;
	String branch;
	
	public constructors1(String name, int age, String branch)
	{
		this.name=name;
		this.age=age;
		this.branch=branch;
		
		
	}
	 void display() {
		System.out.println("student name:"+name);
		System.out.println("student age:" +age);
		System.out.println("student branch:"+ branch);
		
	}

public static void main(String args[])
{
	constructors1  ob=new constructors1("deepthi",21,"mca");
	ob.display();
	
}
}