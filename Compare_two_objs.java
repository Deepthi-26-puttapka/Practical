package javaprograms.Arrays1;

public class Compare_two_objs    // use equals(),== operartor
{
	public static void main(String args[]) {
		Double x= new Double("1234.765");
	Double y=new Double ("1234.765");//equals() compare the content only
		System.out.println("Objects are not equal, hence it returns " + x.equals(y));
		
		
		int a=9,b=9; // checks primitive values int, float, char
		System.out.println(a==b);
		
		// == comapre memory addreses 
		String s1=new String("Hello");
		String s2=new String("Hello");
		 
		System.out.println("Compare Objects:"+s1==s2);
		
	}

}
