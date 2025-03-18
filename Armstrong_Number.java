package javaprograms.Arrays1;

public class Armstrong_Number {
	public static void main(String args[]) {
		
		// armstrong number cubes of sum of individual numbers are equal to given number
		// 153=1^3+5^3+3^3
		
		int number = 153,originalNumber,remainder,result = 0;

        originalNumber=number;

        while(originalNumber!= 0)
        {
            remainder = originalNumber%10;
            result =(int) (result+ Math.pow(remainder, 3));
            originalNumber=originalNumber/ 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else {
        	System.out.println(number + " is Not an Armstrong number.");
        	
        }
       
		
	}

}
