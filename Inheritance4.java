package javaprograms;

public class Inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 circle ob = new circle(5);
	        System.out.println(" Circle:"+ob.getArea());
	        square obj = new square(4);
	        System.out.println(" Square:"+obj.getArea());
	        Rectangle re = new Rectangle(9, 10);
	        System.out.println(" Rectangle:"+re.getArea());

	}

}

class shape{
	double getArea(){
		return 0;
	}
}
class circle extends shape{
	
	int radius;
		circle(int radius){
		this.radius=radius;
	}
	public double getArea() {
		
		double area= 3.14*radius*radius;
		return area;
	}

}
class square extends shape{
	int length;

 square(int length){
	 this.length=length;
	 
 }
  double getArea() {
	 double squarearea= length*length;
	 return squarearea;
	 
 }
}
class Rectangle extends shape {
     int width;
     int height;

    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    
    public double getArea() {
       float rectanglearea=width * height;
       return rectanglearea;
    }
}

