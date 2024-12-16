package javaprograms;
import java.util.*;
//Interface definition
interface Animal {
 void sound(); // Abstract method for animal sound
 void eat();   // Abstract method for eating behavior
}

//Dog class implementing Animal interface
class Dog implements Animal {
 
 public void sound() {
     System.out.println("Dog barks");
 }

 
 public void eat() {
     System.out.println("Dog eats bones");
 }
}

//Cat class implementing Animal interface
class Cat implements Animal {
 
 public void sound() {
     System.out.println("Cat meows");
 }

 
 public void eat() {
     System.out.println("Cat eats fish");
 }
}
class Interface5{
	public static void main(String args[]) {

Animal dog = new Dog();
Animal cat = new Cat();

// Calling methods on Dog
System.out.println("Dog:");
dog.sound();
dog.eat();

// Calling methods on Cat
System.out.println("\nCat:");
cat.sound();
cat.eat();
	}
}
