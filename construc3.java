package javaprograms;

public class construc3 {

	     String title;
	     String author;
	     double price;

	    // default constructor
	    public construc3() {
	        this.title = "Untitled";
	        this.author = "Unknown";
	        this.price = 0.0;
	    }

	    // parameterizedconstructor
	    public construc3(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }

	    // Method to display book details
	    void display() {
	        System.out.println("Title:" + title);
	        System.out.println("Author:" + author);
	        System.out.println("Price:" + price);
	        
	    }

	    // Main method 
	    public static void main(String[] args) {
	        
	    	construc3 ob = new construc3();
	        System.out.println("Default Constructor:");
	        ob.display();

	        // Using the parameterized constructor
	        construc3 obj = new construc3("Ignited minds", "A.P.J. Abdul Kalam", 101.99);
	        System.out.println("Parameterized Constructor:");
	        obj.display();
	    }
	}
