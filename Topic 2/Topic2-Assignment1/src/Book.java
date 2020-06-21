import java.util.Scanner;

/**
 * @author Balaji Natarajan
 *
 */
public class Book {
	int isbn; 
	String title,author; 
	float price;   
	public Book(int isbn, String title, String author, float price) { 
		this.isbn = isbn;  
		this.title = title;  
		this.author = author;  
		this.price = price;  
	}  
	public void display_details() {   
		this.price = discountedprice(price);  
		System.out.println("ISBN : " +isbn);  
		System.out.println("Title : " +title); 
		System.out.println("Author : " +author); 
		System.out.println("Price : " +price);  
	} 
	public float discountedprice(float price2) {  
		// TODO Auto-generated method stub    
		Scanner in = new Scanner(System.in);  
		System.out.print("Enter Discount percentage % ");  
		float discnt = in.nextFloat();  
		in.close(); 
		price2-=price2*(discnt/100);   
		return price2;   
	}  
	
}
