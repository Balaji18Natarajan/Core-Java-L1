import java.util.Scanner;

/**
 *  Write a Java program to calculate the factorial of a number without using any loop
 */

/**
 * @author Balaji Natarajan
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static int fact (int num) {  
		if(num > 1)   
			return num * fact(num - 1);  
		else   
			return 1; 
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");  
		Scanner in = new Scanner(System.in); 
		int input = in.nextInt();  
		int factorial = fact(input); 
		System.out.print("Factorial of "+input+" is : "+factorial); 
		in.close();  
	}

}
