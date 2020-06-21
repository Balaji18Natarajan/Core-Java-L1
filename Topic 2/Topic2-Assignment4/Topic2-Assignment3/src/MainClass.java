/**
 * Write a program to create a class Book with the following data members: isbn, title and price. 
 * Inherit the class Book to two derived classes: Magazine and Novel with the following data members: 
 * Magazine:    type 
 * Novel:   author
 * Populate the details using constructors. Create a magazine and Novel and display the details
 */

/**
 * @author Balaji Natarajan
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magazine mg = new Magazine(783456,"Core Java","Science",200);  
		mg.display();  
		Novel nv = new Novel(123456,"Harry Potter","J.K.Rowling",650); 
		nv.display(); 
	}

}
