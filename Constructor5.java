package javaprograms;

public class Constructor5 {
     int id;
     String name;
     int age;
     Constructor5(int id,String name,int age){
    	 this.id=id;
    	 this.name=name;
    	 this.age=age;
     }
     Constructor5(String name,int age){
    	 this.id=id;
    	 this.name=name;
    	 this.age=age;
     }
     void display() {
    	 System.out.println(name+" "+id+" "+age);
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor5 con=new Constructor5(102,"deepti",21);
		con.display();
		Constructor5 con1=new Constructor5("deepti",21);
		con1.display();
		
		

	}

}
