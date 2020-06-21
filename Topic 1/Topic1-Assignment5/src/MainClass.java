import java.util.Scanner;

/**
 * Write a program that will accept a 4-digit number (assume that the user enters only 4-digit nos.) and print the sum of all the 4 digits.
 * For ex: If the number passed is 3629, the program should print “The sum of all the digits entered is 20”. 
 */

/**
 * @author Balaji Natarajan
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 4-digit number");  
		Scanner in = new Scanner(System.in);  
		int input = in.nextInt(); 
		int input_bkp = input;
		int inpt = input; 
		int count = 0, sum = 0,rem; 
		while(input_bkp > 0) {   
			input_bkp=input_bkp/10;    
			count++;   
		} 
		if(count == 4) {  
			while(input>0) {   
				rem = input%10;    
				input = input/10;   
				sum = sum + rem;    
			}    
			System.out.print("Sum of digits of "+inpt+ " is " +sum);  
		}  
		else   
			System.out.print("please enter only 4-digit number");  
		in.close();  
	}

}
