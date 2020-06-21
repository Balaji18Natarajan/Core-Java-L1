import java.util.Scanner;

/**
 *  Write a program to print month in words, based on input month in numbers. (using switch case)
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
		System.out.println("Enter month number");   
		Scanner in = new Scanner(System.in);   
		int input = in.nextInt();   
		switch(input) {   
			case 1 :     
				System.out.println("January");    
				break;   
			case 2 :     
				System.out.print("February");    
				break;   
			case 3 :     
				System.out.print("March");    
				break;   
			case 4 :     
				System.out.print("April");    
				break;  
			case 5 :    
				System.out.print("May");   
				break;   
			case 6 :     
				System.out.print("June");   
				break;   
			case 7 :     
				System.out.print("July");    
				break;   
			case 8 :     
				System.out.print("August");    
				break;   
			case 9 :     
				System.out.print("September");   
				break;   
			case 10 :     
				System.out.print("October");    
				break;  
			case 11 :     
				System.out.print("November");    
				break;   
			case 12 :  
			   System.out.print("December");    
			   break;   
			default :     
				System.out.print("Invalid Month number");   
		}   
		in.close(); 
	}

}
