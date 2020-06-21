/**
 * @author Balaji Natarajan
 *
 */
public class Magazine extends Book {

	String type;

	public Magazine(int isbn, String title,String type, int price) {
		super(isbn, title, price);
		// TODO Auto-generated constructor stub
		this.type = type; 
	}

		public void display() {   
			System.out.println("ISBN : " +isbn);   
			System.out.println("Title : " + title);  
			System.out.println("Type : " +type); 
			System.out.println("Price : " +price);
		} 
		
	}