import java.util.Scanner;

/**
 * Write a Java program to convert minutes into a number of years and days.
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
		int day_min = 24 * 60;  
		int yr_min = 365 * day_min;  
		System.out.println("Enter minutes"); 
		Scanner in = new Scanner(System.in);  
		int input = in.nextInt();  
		int years = input / yr_min; 
		int days = (input % yr_min)/day_min; 
		System.out.println(years+" years " +days+" days"); 
		in.close();  
	}

}
