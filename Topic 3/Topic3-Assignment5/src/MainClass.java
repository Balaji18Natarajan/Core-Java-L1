import java.util.Scanner;

/**
 * Write a program to check the no.of occurrences of a given character within the given string without using any loop. [Hint: String str=”How was your day today”; char c=’a’; no.of occurrences of a is=3]
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
		System.out.println("Enter String"); 
		Scanner in = new Scanner(System.in);   
		String str1 = in.nextLine();  
		System.out.println("Enter Character");  
		char c = in.next().charAt(0);  
		int count = str1.length() - str1.replace(Character.toString(c),"").length(); 
		System.out.println("Number of occurances of \'"+c+"\' in \""+str1+"\" is ="+count);  
		in.close();  
	}

}
