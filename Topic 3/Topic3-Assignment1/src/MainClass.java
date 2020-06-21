import java.util.Scanner;

/**
 * Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) 
 * and ensure that the age entered is >=18 and < 60. Display proper error messages. 
 * The program must exit gracefully after displaying the error message in case the arguments passed are not proper. 
 * (Hint : Create a user defined exception class for handling errors.) 
 */

/**
 * @author Balaji Natarajan
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);   
		String name = in.next();  
		int age = in.nextInt();  
		in.close();   
		try {   
			if(age < 18 || age >=60)   
				throw new MyException(2);  
			else {    
				System.out.println("Name : " +name);   
				System.out.println("Age : " +age);  
			}  
		}  
		catch(MyException e) {   
			System.out.println(e); 
		}  
	}

}
