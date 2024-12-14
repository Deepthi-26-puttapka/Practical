package javaprograms;
// multiple interface
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anu1 at=new Anu1();
		at.scan();
		at.print();

	}

}
interface deepthi{
	public void scan() ;
		
}
interface  divya{
	public void print();
}
class Anu1 implements deepthi,divya{
	public void scan() {
		System.out.println("deepthi interface");
	}
	public void print() {
		System.out.println("divya interface");
	}
	
}
	

