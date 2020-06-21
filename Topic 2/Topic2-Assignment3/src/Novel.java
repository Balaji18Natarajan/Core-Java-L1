/**
 * @author Balaji Natarajan
 *
 */
public class Novel extends Book {
	String author;  
	public Novel(int isbn, String title, String author, int price) { 
		super(isbn, title, price);   
		// TODO Auto-generated constructor stub   
		this.author = author; 
	} 
	public void display() {  
		System.out.println("ISBN : " +isbn); 
		System.out.println("Title : " +title);  
		System.out.println("Author : " +author);  
		System.out.println("Price : " +price);
	} 
}