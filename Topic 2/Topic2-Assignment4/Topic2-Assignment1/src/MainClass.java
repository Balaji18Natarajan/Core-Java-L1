/**
 * Write a program to create a class Book with the following   
 * - attributes:      -isbn, title, author, price   
 * - methods:               
 * 		i. Initialize the data members through parameterized constructor     
 * 	    ii. displaydeta ils() to display the details of the book        
 * 		iii. discountedprice() : pass the discount percent, calculate the discount on price and find the amount to be paid after discount   
 * - task:       
 * 		Create an object book, initialize the book and display the details along with the discounted price 
 */

/**
 * @author Balaji Natarajan
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Book bk = new Book(783456,"Core Java","John Wilson",200); 
		  bk.display_details();
	}

}
