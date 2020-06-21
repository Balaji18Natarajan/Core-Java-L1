import java.util.Scanner;

/**
 * Write a Program to accept two Strings Wipro Bangalore as command line  arguments and print the output “Wipro Technologies Bangalore” 
 * If the command line is “ABC Mumbai”, then it should print “ABC Technologies Mumbai” . 
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
		Scanner in = new Scanner(System.in);  
		String str1 = in.next(); 
		String str2 = in.next();  
		System.out.print(str1+" Technologies "+str2); 
		in.close();  
	}

}
