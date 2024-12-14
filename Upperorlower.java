package javaprograms;
import java.util.*;
// chech given character is lower case or upper case

public class Upperorlower // class name
{ 

	public static void main(String[] args) // main method
	{
		
		Scanner sc=new Scanner(System.in); // here is the scanner class for input
	System.out.print("Enter ant character:  "); // print statement
	char ch = sc.next().charAt(0); //given input is character type
	 if (ch >= 'A' && ch <= 'Z') // check Uppercase letters
	 {
	System.out.println(ch+" "+"is an UpperCase character"); // if given chracter is uppercase print this statement
	 }
					     
	else if (ch >= 'a' && ch <= 'z') // check lower case character
	{ 
	System.out.println(ch+" "+"is an LowerCase character" );
	}
	 
       else{ // given char is not uppercase, lower case print below statement
    	   System.out.println(ch+""+"is not an alphabetic character" ); }
	}

}
