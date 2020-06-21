/**
 * @author Balaji Natarajan
 *
 */
public class MyException extends Exception {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a;    
	 public MyException(int b) {
		// TODO Auto-generated constructor stub
		 a=b;  
	}
	public String toString() {  
		 return ("Error "+a+" : Improper age provided"); 
	 }
}