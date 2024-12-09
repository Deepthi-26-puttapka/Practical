package javaprograms;

// single inheritance


	class parent { // parent class 
	    void parent1(){ 
	        System.out.println("Parent Class or Super Class");
	    }
	}
	    class child extends parent{ // parent class extends the child class
	        void child1(){
	             System.out.println("Child Class or Sub class ");
	        }
	    }
	    public class Parent1{ // main class
	        public static void main(String args[]){ // main method
	             
	            child ob=new child(); // create object for the child class no need to create parent class
	            
	            ob.child1(); // call child cls method
	            ob.parent1(); // call parent cls method
	            
	        }
	    }

